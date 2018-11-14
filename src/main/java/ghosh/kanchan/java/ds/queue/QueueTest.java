package ghosh.kanchan.java.ds.queue;

public class QueueTest {

    public static void main(String[] args) {
        QueueTest queueTest = new QueueTest();
        queueTest.testLLQueue();
    }

    public void testLLQueue() {
        LLQueue llQueue = LLQueue.createQueue();
        System.out.println("At beginning is queue empty " + llQueue.isEmpty());
        llQueue.enQueue(1);
        llQueue.enQueue(2);
        System.out.println("Added 2 entry, is queue empty " + llQueue.isEmpty());
        System.out.println(llQueue.deQueue());
        System.out.println(llQueue.deQueue());
        System.out.println("At end is queue empty " + llQueue.isEmpty());

    }
}
