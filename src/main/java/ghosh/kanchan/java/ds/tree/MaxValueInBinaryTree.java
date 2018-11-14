package ghosh.kanchan.java.ds.tree;

public class MaxValueInBinaryTree {

    public static void main(String[] args) {
        MaxValueInBinaryTree maxValueInBinaryTree = new MaxValueInBinaryTree();
        BinaryTreeTraversal binaryTreeTraversal = new BinaryTreeTraversal();
        BinaryTreeNode rootNode = binaryTreeTraversal.constructFullBinaryTree();
        System.out.println("Maximum vale - " + maxValueInBinaryTree.findMax(rootNode));
    }

    private Integer  findMax(BinaryTreeNode node) {
        Integer root_val, left, right, max = Integer.MIN_VALUE;
        if(node != null) {
            root_val = node.getData();
            left = findMax(node.getLeft());
            right = findMax(node.getRight());

            if(left > right) {
                max = left;
            }
            else {
                max = right;
            }
            if(root_val > max) {
                max = root_val;
            }
        }
        return max;
    }

}


