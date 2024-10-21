package tree.traversal.after;


import java.util.Stack;

/**
 * @Desc 前序遍历
 *
 * */
public class TreePrintStack {


    static class Node{
        // 节点的值
        Integer v;
        // 左子树
        TreePrintStack.Node leftNode;
        // 右子树
        TreePrintStack.Node rightNode;
        //构造方法
        public Node(Integer v){
            this.v = v;
        }
        public Integer getV(){
            return v;
        }
    }

    public static void printTree(TreePrintStack.Node node){
        Stack<Node> stack = new Stack();
        stack.add(node);

        while (true){
            if(stack.empty()){
               break;
            }
            Node popNode = stack.pop();
            System.out.println(popNode.v);
            if(popNode.rightNode != null){
                stack.add(popNode.rightNode);
            }
            if(popNode.leftNode != null){
                stack.add(popNode.leftNode);
            }
        }
    }

    public static void main(String[] args) {

        TreePrintStack.Node node_bottom1 = new TreePrintStack.Node(4);
        TreePrintStack.Node node_bottom2 = new TreePrintStack.Node(5);
        TreePrintStack.Node node_bottom3 = new TreePrintStack.Node(6);
        TreePrintStack.Node node_bottom4 = new TreePrintStack.Node(7);

        TreePrintStack.Node node_middle1 = new TreePrintStack.Node(2);
        node_middle1.leftNode = node_bottom1;
        node_middle1.rightNode = node_bottom2;

        TreePrintStack.Node node_middle2 = new TreePrintStack.Node(3);
        node_middle2.leftNode = node_bottom3;
        node_middle2.rightNode = node_bottom4;

        TreePrintStack.Node node_root = new TreePrintStack.Node(1);
        node_root.leftNode = node_middle1;
        node_root.rightNode = node_middle2;

        printTree(node_root);
        
    }

    //        1
    //     2     3
    //   4   5  6  7


}
