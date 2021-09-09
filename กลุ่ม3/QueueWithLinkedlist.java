public class QueueWithLinkedlist extends LinkedList {

    public void enqueue(Object item) {
        add(item);
    }

    public Object dequeue() {
        if (isEmpty())
            return null;
        Node current = front();
        remove(0);
        return current.getItem();
    }

    public Node front() {
        if (isEmpty())
            return null;
        return (Node) getHead();
    }

    public static void main(String[] args) {
        QueueWithLinkedlist Queue = new QueueWithLinkedlist();
        Queue.enqueue(10);
        Queue.enqueue(20);
        Queue.dequeue();
        Queue.dequeue();
        Queue.enqueue(30);
        Queue.enqueue(40);
        Queue.enqueue(50);
        Queue.dequeue();
        System.out.println("แสดงตัวหน้าสุดของ Queue : " + Queue.dequeue());
        System.out.println("แสดงตัวท้ายสุดของ Queue : " + Queue.dequeue());
    }
}
