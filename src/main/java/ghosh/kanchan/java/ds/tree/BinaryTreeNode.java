package ghosh.kanchan.java.ds.tree;

public class BinaryTreeNode {

    private Integer data;
    private BinaryTreeNode left;
    private BinaryTreeNode right;

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public BinaryTreeNode getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }

    public BinaryTreeNode getRight() {
        return right;
    }

    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }

    public BinaryTreeNode(Integer data) {
        this.data = data;
    }

    public BinaryTreeNode populateData(Integer data) {
        if(data != null) {
            this.data = data;
        }
        return this;
    }

    public BinaryTreeNode populateLeftNode(BinaryTreeNode node) {
        this.left = node;
        return this;
    }

    public BinaryTreeNode populateRightNode(BinaryTreeNode node) {
        this.right = node;
        return this;
    }

}
