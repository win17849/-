public class LinkedList {
    private Node head;
    private int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    // new!!
    public Node getHead() {
        return head;
    }

    public void add(Object item) {
        add(size, item);
    }

    public void add(int index, Object item) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("List index out of bounds on add");
        if (index == 0) {
            head = new Node(item, head);
        } else { // find predecessor
            Node curr = head;
            for (int i = 0; i < index - 1; i++) {
                curr = curr.getNext();
            }
            // append after predecessor
            curr.setNext(new Node(item, curr.getNext()));
        }
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("List index out of bounds on remove");
        if (index == 0) {
            head = head.getNext();
        } else { // locate predecessor of node to be removed
            Node curr = head;
            for (int i = 0; i < index - 1; i++)
                curr = curr.getNext();
            curr.setNext(curr.getNext().getNext());
        }
        size--;
    }

    public boolean remove(Object item) {

        if (size == 0)
            return false;
        if (item.equals(head.getItem())) {
            head = head.getNext();
            size--;
            return true;
        } else {
            // locate predecessor of node to be removed
            Node curr = head;
            while (curr.getNext() != null && !item.equals(curr.getNext().getItem())) {
                curr = curr.getNext();
            }
            // if node is not in the list
            if (curr.getNext() == null)
                return false;
            else {
                curr.setNext(curr.getNext().getNext());
                size--;
                return true;
            }
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String toString() {
        String res = "[" + size + "| ";
        for (Node current = head; current != null; current = current.getNext())
            res += current.getItem().toString() + " ";
        return res + "]";
    }

    public void show() {
        System.out.print("show | ");
        System.out.println(toString());
    }

}

