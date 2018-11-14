package ghosh.kanchan.java.ds.queue;

import ghosh.kanchan.java.ds.linkedlist.ListNode;
import ghosh.kanchan.java.ds.queue.exception.EmptyQueueException;

/**
 * Queue implementation which uses a LinkedList for internal data storage.
 */
public class LLQueue {

    private ListNode entryNode; // head node
    private ListNode exitNode; // last node

    private LLQueue() {
        this.entryNode = null;
        this.exitNode = null;
    }

    public static LLQueue createQueue() {
        return new LLQueue();
    }

    public boolean isEmpty() {
        return (this.exitNode == null);
    }

    public void enQueue(int data) {
        ListNode newNode = new ListNode();
        newNode.setData(data);

        if(entryNode != null) {
            entryNode.setNext(newNode);
        }
        entryNode = newNode;

        if(exitNode == null) {
            exitNode = entryNode;
        }
    }


    public Integer deQueue() {
        Integer data = null;
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
