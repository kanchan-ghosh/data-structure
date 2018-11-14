package ghosh.kanchan.java.ds.tree;

import ghosh.kanchan.java.ds.queue.ObjectQueue;

public class MaxValueInBinaryTreeWithoutRecursion {

    public static void main(String[] args) {
        MaxValueInBinaryTreeWithoutRecursion maxValueInBinaryTreeWithoutRecursion = new MaxValueInBinaryTreeWithoutRecursion();
        BinaryTreeTraversal binaryTreeTraversal= new BinaryTreeTraversal();
        BinaryTreeNode rootNode = binaryTreeTraversal.constructFullBinaryTree();
        System.out.println("Maximum value in Binary tree without recursion - " + maxValueInBinaryTreeWithoutRecursion.findMaxWithoutRecursion(rootNode));

    }

    private Integer findMaxWithoutRecursion(BinaryTreeNode node) {
        BinaryTreeNode temp = null;
        Integer max = Integer.MIN_VALUE;
        ObjectQueue queue = ObjectQueue.createQueue();

        if(node != null) {
            queue.enQueue(node);

            while (!queue.isEmpty()) {
                temp = (BinaryTreeNode) queue.deQueue();

                if(temp.getData() > max) {
                    max = temp.getData();
                }

                if(temp.getLeft() != null) {
                    queue.enQueue(temp.getLeft());
                }
                if(temp.getRight() != null) {
                    queue.enQueue(temp.getRight());
                }
            }
        }

        return max;
    }
}
