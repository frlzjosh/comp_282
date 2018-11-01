//Author: Joshua J. Magdaleno
//Program: Java on IntelliJ
//Professor: Adam Kaplan
//class: COMP SCI 282


//url: http://cs-fundamentals.com/data-structures/stack-implementation-using-linked-list-in-java.php
public class StringStack extends StringLinkedList {
    private StringLinkedList theStack;
    private String input;
    private int capacity;
    private int howMany;
    private Node head;

    public StringStack() {
        theStack = new StringLinkedList();
        this.howMany = 0;
        this.head = new Node();
        this.input = input;

    }

    public StringStack(String value) {
        theStack = new StringLinkedList(value);
        this.howMany = 0;
        this.input = value;
        this.head = new Node();
    }


    public void setString(String temp) {
        this.input = temp;
    }

    public String getString() {
        return input;
    }

    public void print() {
        StringStack stacky = new StringStack(this.input);
        stacky.setString(input);
        System.out.println("Stack contains: " + stacky.getString());
    }

    public void checkStackSize() {
        StringStack stack = new StringStack(input);
        System.out.println("Size of the Stack is " + stack.capacity);
    }

    public void push(String value) {
        Node current = new Node(value);
        this.input = value;
        setString(this.input);
        if (head == null) {
            head = current;
            howMany++;
        } else {
            head= current.next;
            head = current;
            howMany++;
        }
        print();
    }

    public String pop() {
        Node current = new Node(input);
        setString(input);
        if (head == null) {
            System.out.println("The Stack is empty");
        }
            current = head;
            head = head.next;

        String popNode = "Popped: " + input;
        return popNode;
    }
}//end class
