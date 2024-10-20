package link;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class linkeJoin {

    /**
     * @Desc 两个链表相加
     * @Param link1
     * @Param link2
     * */
    public static List<Integer> linkJoin(LinkedList<Integer> link1 , LinkedList<Integer> link2){
        List<Integer> resultLinked = new LinkedList<>();
        int forNum = Math.max(link1.size(), link2.size());
        // 进位值
        Integer addIndexValue = 0;
        for (int i = 0; i < forNum; i++) {
            Integer v1 = Optional.ofNullable(link1.poll()).orElse(0);
            Integer v2 = Optional.ofNullable(link2.poll()).orElse(0);
            Integer nowValue = v1 + v2 + addIndexValue;
            // 余数
            Integer nowValueTail = nowValue%10;
            addIndexValue = nowValue/10;
            resultLinked.add(nowValueTail);
        }
        if(addIndexValue > 0){
            resultLinked.add(addIndexValue);
        }
        return resultLinked;
    }

    public static void main(String[] args) {
        LinkedList<Integer> linked1 = new LinkedList<>();
        linked1.add(7);
        linked1.add(8);
        linked1.add(9);
        LinkedList<Integer> linked2 = new LinkedList<>();
        linked2.add(7);
        linked2.add(8);
        linked2.add(9);
        System.out.println(linkeJoin.linkJoin(linked1, linked2));
    }
}
