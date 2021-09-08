public class Node {
    private Object item;
    private Node next;
    private Node prev; //ก่อนหน้า

    public Node(Object item) {
        this.item = item;
        this.next = null;
    }

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }

    public Node(Object item, Node next, Node prev) {
        this.item = item;
        this.next = next;
        this.prev = prev;
    }

    public void setNext(Node nextNode) {
        next = nextNode;
    }

    public Node getNext() {
        return next;
    }

    public void setPrev(Node prevNode) {
        prev = prevNode;
    }

    public Node getPrev() {
        return prev;
    }

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }

    public String toString() {
        return item.toString();
    }
}
