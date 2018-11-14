package ghosh.kanchan.java.ds.tree;

public class MirrorBinaryTree {

    public static void main(String[] args) {
        MirrorBinaryTree mirrorBinaryTree = new MirrorBinaryTree();
        BinaryTreeTraversal binaryTreeTraversal = new BinaryTreeTraversal();

        BinaryTreeNode rootNode = binaryTreeTraversal.constructFullBinaryTree();

        System.out.println("-------------------- Original Binary Tree ----------------------");
        binaryTreeTraversal.inOrderTraversal(rootNode);
        System.out.println();

        rootNode = mirrorBinaryTree.makeMirror(rootNode);

        System.out.println("-------------------- Mirror of Original Binary Tree ----------------------");
        binaryTreeTraversal.inOrderTraversal(rootNode);
        System.out.println();

    }

    private BinaryTreeNode makeMirror(BinaryTreeNode rootNode) {
        if(rootNode != null) {
            BinaryTreeNode left = makeMirror(rootNode.getLeft());
            BinaryTreeNode right = makeMirror(rootNode.getRight());

            BinaryTreeNode temp = null;
            temp = left;
            left = right;
            right = temp;

            rootNode.setLeft(left);
            rootNode.setRight(right);
        }
        return rootNode;
    }
}
