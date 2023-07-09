public class StackService {
    private Node head;

    private int countSize;

    public void push(int value) {
        if (head == null) {
            head = new Node(value);
        } else {
            Node newNode = new Node(value);
            newNode.next = head;
            head = newNode;
        }
        countSize++;
    }

    public int pop() {
        int value = head.value;
        head = head.next;
        countSize--;
        return value;
    }

    public int peek() {
        return head.value;
    }

    public boolean isEmpty() {
        return (countSize == 0) ? true : false;
    }

    public int size() {
        return countSize;
    }
}
