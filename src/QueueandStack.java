public class QueueandStack {

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

        Object item = A1.peek();  //คืนค่าบนสุด
        A1.pop();
        return item;
    }

    public Void front() {
        if (A1.isEmpty())
            return null;
        return A1.getHead();//รีเทรินกลับค่าแรกสุด
    }

    // enqueue
    // dequeue
    // front
    public static void main(String[] args) {
        QueueWithLinkedlist Queue = new QueueWithLinkedlist();
        Queue.enqueue(3);//แสดงผล
        Queue.show();

        Queue.enqueue(2);//แสดงผล
        Queue.show();

        Queue.enqueue(1); //แสดงผล
        Queue.show();

        System.out.println("เอาdequeue : เลขที่" + Queue.dequeue()+"ออก");  //เอา3ออก
        Queue.show();

        System.out.println("เอาdequeue : เลขที่" + Queue.dequeue()+"ออก"); //เอา2ออก
        Queue.show();
    }
}
