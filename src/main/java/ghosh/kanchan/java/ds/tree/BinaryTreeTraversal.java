package ghosh.kanchan.java.ds.tree;

import ghosh.kanchan.java.ds.queue.ObjectQueue;

public class BinaryTreeTraversal {

    public static void main(String[] args) {

        BinaryTreeTraversal binaryTreeTraversal = new BinaryTreeTraversal();
        BinaryTreeNode rootNode = binaryTreeTraversal.constructFullBinaryTree();

        System.out.println("========= InOrder Tree =============");
        binaryTreeTraversal.inOrderTraversal(rootNode);
        System.out.println();

        System.out.println("========= PreOrder Tree =============");
        binaryTreeTraversal.preOrderTraversal(rootNode);
        System.out.println();

        System.out.println("========= PostOrder Tree =============");
        binaryTreeTraversal.postOrderTraversal(rootNode);
        System.out.println();

        System.out.println("========= Level Order Tree =============");
        binaryTreeTraversal.levelOrderTraversal(rootNode);
        System.out.println();

    }

    /**
     *      1
     *     / \
     *    /   \
     *   2     3
     *  / \   / \
     * 4   5 6   7
     *
     */
    public BinaryTreeNode constructFullBinaryTree() {
        BinaryTreeNode rootNode = new BinaryTreeNode(1).populateLeftNode(new BinaryTreeNode(2)).populateRightNode(new BinaryTreeNode(3));
        rootNode.getLeft().populateLeftNode(new BinaryTreeNode(4)).populateRightNode(new BinaryTreeNode(5));
        rootNode.getRight().populateLeftNode(new BinaryTreeNode(6)).populateRightNode(new BinaryTreeNode(7));
        return rootNode;
    }

    /**
     * inOrder traversal is =  left -> data -> right
     */
    public void inOrderTraversal(BinaryTreeNode node) {
        if(node != null) {
            inOrderTraversal(node.getLeft());
            System.out.print(node.getData() + " ");
            inOrderTraversal(node.getRight());
        }
    }

    /**
     * preOrder traversal is =  data -> left -> right
     */
    public void preOrderTraversal(BinaryTreeNode node) {
        if(node != null) {
            System.out.print(node.getData() + " ");
            preOrderTraversal(node.getLeft());
            preOrderTraversal(node.getRight());
        }
    }

    /**
     * postOrder traversal is =  left -> right -> data
     */
    public void postOrderTraversal(BinaryTreeNode node) {
        if(node != null) {
            postOrderTraversal(node.getLeft());
            postOrderTraversal(node.getRight());
            System.out.print(node.getData() + " ");
        }
    }

    /**
     * Level order traversal is defined as
     * 1. visit root
     * 2. while travelling level l, keep all the elements at level l+1 in queue
     * 3. Go to the next level and visit all the nodes in that level
     * 4. Repeat this until all levels are completed.
     *
     */
    public void levelOrderTraversal(BinaryTreeNode node) {
        BinaryTreeNode temp;
        ObjectQueue queue = ObjectQueue.createQueue();
        if(node == null) {
            return;
        }

        queue.enQueue(node);

        while(!queue.isEmpty()) {
            temp = (BinaryTreeNode) queue.deQueue();
            if(temp.getData() != null) {
                System.out.print(temp.getData() + " ");
                queue.enQueue(temp.getLeft());
                queue.enQueue(temp.getRight());
            }
        }

        queue.deleteQueue();

    }

}
