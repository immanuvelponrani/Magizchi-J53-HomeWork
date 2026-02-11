class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
    }
}

class CircularDoublyLinkedList {
    Node head = null;

    // Insert at head
    void insertHead(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            head.next = head.prev = head;
            return;
        }

        Node last = head.prev;

        newNode.next = head;
        newNode.prev = last;

        last.next = head.prev = newNode;
        head = newNode;
    }

    // Insert at tail
    void insertTail(int data) {
        if (head == null) {
            insertHead(data);
            return;
        }

        Node newNode = new Node(data);
        Node last = head.prev;

        last.next = newNode;
        newNode.prev = last;

        newNode.next = head;
        head.prev = newNode;
    }

    // Insert at position
    void insertAtPosition(int data, int pos) {
        Node temp = head;

        for (int i = 1; i < pos - 1; i++)
            temp = temp.next;

        Node newNode = new Node(data);
        Node nextNode = temp.next;

        temp.next = newNode;
        newNode.prev = temp;

        newNode.next = nextNode;
        nextNode.prev = newNode;
    }

    // Display
    void display() {
        Node temp = head;

        do {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(HEAD)");
    }

    public static void main(String[] args) {
        CircularDoublyLinkedList list = new CircularDoublyLinkedList();

        list.insertHead(20);
        list.insertHead(10);

        list.insertTail(40);

        list.insertAtPosition(30, 3);

        list.display();
    }
}
