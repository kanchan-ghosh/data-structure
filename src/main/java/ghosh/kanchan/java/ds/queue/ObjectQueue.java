package ghosh.kanchan.java.ds.queue;


import ghosh.kanchan.java.ds.linkedlist.ObjectNode;
import ghosh.kanchan.java.ds.queue.exception.EmptyQueueException;

public class ObjectQueue {

    private ObjectNode entryNode; // head node
    private ObjectNode exitNode; // last node

    private ObjectQueue() {
        this.entryNode = null;
        this.exitNode = null;
    }

    public static ObjectQueue createQueue() {
        return new ObjectQueue();
    }

    public boolean isEmpty() {
        return (this.exitNode == null);
    }

    public void enQueue(Object data) {
        ObjectNode newNode = new ObjectNode();
        newNode.setData(data);

        if(entryNode != null) {
            entryNode.setNext(newNode);
        }
        entryNode = newNode;

        if(exitNode == null) {
            exitNode = entryNode;
        }
    }


    public Object deQueue() {
        Object data = null;
        if(isEmpty()) {
            throw new EmptyQueueException("No data available.");
        }
        else {
            data = exitNode.getData();
            exitNode = exitNode.getNext();
        }
        return data;
    }

    public void deleteQueue() {
        this.entryNode = null;
        this.exitNode = null;
    }
}
