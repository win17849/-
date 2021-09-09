public class QueueWithStack extends LinkedList {

    private StackWithLinkedlist A1 = new StackWithLinkedlist();
    private StackWithLinkedlist B2 = new StackWithLinkedlist();

    public void enqueue(Object item) {
        while (!A1.isEmpty())
            B2.push(A1.pop());

        A1.push(item);

        while (!B2.isEmpty())
            A1.push(B2.pop());
    }
    public Object dequeue() {
        if (A1.isEmpty())
            return null;

        Object item = A1.peek();
        A1.pop();
        return item;
    }

    // enqueue
    // dequeue

    public static void main(String[] args) {
        QueueWithLinkedlist Queue = new QueueWithLinkedlist();
        Queue.enqueue(3);
        Queue.show();

        Queue.enqueue(2);
        Queue.show();

        Queue.enqueue(1);
        Queue.show();

        System.out.println("dequeue : นำค่า" + Queue.dequeue()+"ออก");
        Queue.show();

        System.out.println("dequeue : นำค่า" + Queue.dequeue()+"ออก");
        Queue.show();
    }
}