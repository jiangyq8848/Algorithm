package tree;

import java.util.Stack;

public class TreePrint {

    static class Node{
        // 节点的值
        Integer v;
        // 左子树
        Node leftNode;
        // 右子树
        Node rightNode;
        //构造方法
        public Node(Integer v){
            this.v = v;
        }
        public Integer getV(){
            return v;
        }
    }

    /**
     * 中序遍历打印树节点，不许用递归
     * @param node
     */
    public static void middlePrintTree(Node node){
        Stack stack = new Stack();
        addLeftNodeToTree(node , stack);

        while (true){
            if(stack.empty()){
                break;
            }
            Node popValue = (Node)stack.pop();
            System.out.println(popValue.getV());
            if(popValue.rightNode != null){
                addLeftNodeToTree(popValue.rightNode,stack);
            }
        }
    }

    /**
     * 中序遍历打印树节点，不许用递归
     * @param node
     */
    public static void addLeftNodeToTree(Node node, Stack stack){
        Node nowNode = node;
        if(stack == null){
            stack = new Stack();
        }
        while (true){
            stack.add(nowNode);
            nowNode = nowNode.leftNode;
            if (nowNode == null){
                break;
            }
        }
    }

    public static void main(String[] args) {
        Node node_bottom1 = new Node(4);
        Node node_bottom2 = new Node(5);
        Node node_bottom3 = new Node(6);
        Node node_bottom4 = new Node(7);

        Node node_middle1 = new Node(2);
        node_middle1.leftNode = node_bottom1;
        node_middle1.rightNode = node_bottom2;

        Node node_middle2 = new Node(3);
        node_middle2.leftNode = node_bottom3;
        node_middle2.rightNode = node_bottom4;

        Node node_root = new Node(1);
        node_root.leftNode = node_middle1;
        node_root.rightNode = node_middle2;

        middlePrintTree(node_root);
    }

 //        1
 //     2     3
 //   4   5  6  7

}
