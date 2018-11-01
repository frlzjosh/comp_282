//Author: Joshua J. Magdaleno
//Program: Java on IntelliJ
//Professor: Adam Kaplan
//class: COMP SCI 282

public class StringQueue extends StringLinkedList {
    private StringLinkedList qu;
    private int indexCount;
    private String input;
    private Node rear;
    private Node front;

    public StringQueue() {

        qu = new StringLinkedList(input);
        this.indexCount = 0;
    }

    public StringQueue(String value) {
        qu = new StringLinkedList(value);
        this.input = value;
        this.indexCount = 0;
    }

    public void setString(String value) {
        this.input = value;
    }

    public String getString() {
        return this.input;
    }

    public void print() {
        StringQueue printQueue = new StringQueue(this.input);
        System.out.println("Queue is at: " + indexCount + " rear has: " + printQueue.getString());
    }

    public void enqueue(String value) {
        Node current = new Node(value);
        this.input = value;
        if (rear == null) {
            this.front = this.rear = current;
        }
        rear.next = current;
        this.rear = current;
        indexCount++;
        print();
    }
    public String dequeue(){
        Node current = new Node(input);
//        this.input = value;
        rear = current.next;
        setString(input);
        front = null;
        indexCount--;
        String poppedNode  = "Popped: " + current.input;
        return poppedNode ;
    }
}