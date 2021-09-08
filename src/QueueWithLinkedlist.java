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

    // public int size() extends from LinkedList
    // public int isEmpty() extends from LinkedList

    public static void main(String[] args) {
        QueueWithLinkedlist Queue = new QueueWithLinkedlist();
        Queue.enqueue(5);
        Queue.show();

        Queue.enqueue(4);
        Queue.show();

        Queue.enqueue(3);
        Queue.show();

        System.out.println("แสดงค่าQequeue : " + Queue.dequeue());
        Queue.show();

        System.out.println("แสดงค่าQequeue : " + Queue.dequeue());
        Queue.show();
    }
}
