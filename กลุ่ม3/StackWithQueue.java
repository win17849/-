public class StackWithQueue {
    private QueueWithLinkedlist A1 = new QueueWithLinkedlist();
    private QueueWithLinkedlist B2 = new QueueWithLinkedlist();

    private int size = 0;

    public void push(Object item) {
        size++;

        B2.enqueue(item);

        while (!A1.isEmpty())
            B2.enqueue(A1.dequeue());

        QueueWithLinkedlist A = A1;
        A1 = B2;
        B2 = A;

    }

    public Object pop() {
        size--;

        if (A1.isEmpty())
            return null;

        return A1.dequeue();
    }

    public Object peek() {

        return A1.front();
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return A1.isEmpty();
    }

    public void Show() {
        System.out.print("Show : ");
        System.out.println(A1.toString());
    }

    public static void main(String[] args) {
        StackWithQueue stack = new StackWithQueue();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);


        stack.Show();

        System.out.println("POP: เอาค่า " + stack.pop()+"ออก");
        stack.Show();

        System.out.println("Peek: ค่าบนสุดของTopคือ " + stack.peek());
        stack.Show();

        System.out.println("Size: เหลือ " + stack.size()+"ตัวเลข");
        stack.Show();

        System.out.println("isEmpty: " + stack.isEmpty());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println("isEmpty: " + stack.isEmpty());
        stack.Show();
    }
}
