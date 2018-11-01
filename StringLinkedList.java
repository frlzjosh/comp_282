//Author: Joshua J. Magdaleno
//Program: Java on IntelliJ
//Professor: Adam Kaplan
//class: COMP SCI 282

public class StringLinkedList {
    private StringLinkedList list;
    private int howMany;
    private Node head, tail;
    String input;

    public StringLinkedList(String value) {
        this.head = new Node(value);
        this.input = value;
        this.howMany = 0;
    }

    public StringLinkedList() {
        this.head = new Node();
        this.howMany = 0;
        this.input = input;
    }

    public void setString(String value){
        this.input = value;
    }
    public String getString(){
        return this.input;
    }

    public void insert(String value) {
        Node current = new Node(value);
        input = value;
        if (this.head == null) {
            this.head = current;
            this.howMany++;
        } else {
            head.next = current;
            current.next = tail;
            head = tail;
            this.howMany++;
        }
        print();
    }

    public void print() {
        StringLinkedList currentList = new StringLinkedList(this.input);
        currentList.setString(this.input);
        System.out.println("Linked list holds: " + currentList.getString() + " at: " + this.howMany);

    }

    class Node {
        Node next;
        String input;

        public Node() {
            this.next = next;
            this.input = input;
        }

        public Node(String value) {
            this.input = value;
            this.next = null;
        }

    }
}