package tree;

/*
*
* 描述： 递归方式中序遍历
*
*
* */
public class MiddleDgTreePrint {

    static class Node{
        // 节点的值
        Integer v;
        // 左子树
        TreePrint.Node leftNode;
        // 右子树
        TreePrint.Node rightNode;
        //构造方法
        public Node(Integer v){
            this.v = v;
        }
        public Integer getV(){
            return v;
        }
    }

    /**
     * 中序遍历打印树节点，用递归
     * @param node
     */
    public static void middlePrintTree(TreePrint.Node node){
        if(node == null){
            return;
        }
        middlePrintTree(node.leftNode);
        System.out.println(node.getV());
        middlePrintTree(node.rightNode);
    }

    public static void main(String[] args) {
        TreePrint.Node node_bottom1 = new TreePrint.Node(4);
        TreePrint.Node node_bottom2 = new TreePrint.Node(5);
        TreePrint.Node node_bottom3 = new TreePrint.Node(6);
        TreePrint.Node node_bottom4 = new TreePrint.Node(7);

        TreePrint.Node node_middle1 = new TreePrint.Node(2);
        node_middle1.leftNode = node_bottom1;
        node_middle1.rightNode = node_bottom2;

        TreePrint.Node node_middle2 = new TreePrint.Node(3);
        node_middle2.leftNode = node_bottom3;
        node_middle2.rightNode = node_bottom4;

        TreePrint.Node node_root = new TreePrint.Node(1);
        node_root.leftNode = node_middle1;
        node_root.rightNode = node_middle2;

        middlePrintTree(node_root);
    }

    //        1
    //     2     3
    //   4   5  6  7
}
