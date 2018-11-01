//Author: Joshua J. Magdaleno
//Program: Java on IntelliJ
//Professor: Adam Kaplan
//class: COMP SCI 282

public class StringArray {
    private StringArray[] theArray;
    private int capacity;
    private int inputAmount;
    private String input;

    public StringArray(int c) {
        this.theArray = new StringArray[10];
        this.capacity = c;
        this.inputAmount = 0;
        this.input = input;
    }

    public StringArray(String value, int c) {
        theArray = new StringArray[10];
        this.capacity = c;
        this.inputAmount = 0;
        this.input = value;
    }

    public void setString(String value) {
        this.input = value;
    }

    //
    public String getString() {
        return input;
    }

    public void print() {
        StringArray tempSA = new StringArray(input, capacity);
        tempSA.setString(input);
        System.out.println(" " + inputAmount + " : " + tempSA.getString());
    }

    public void checkVectorSize() {
        System.out.println("Vector Size " + capacity);
    }

    public void insert(String value) {
        this.input = value;
        StringArray tempSA = new StringArray(this.input, capacity);
        if (inputAmount >= capacity) {
            StringArray[] newArray = new StringArray[2 * capacity];
            for (int i = 0; i < inputAmount; i++) {
                newArray[i] = theArray[i];
            }
            theArray = newArray;
            capacity = capacity * 2;
        }
        for (int i = this.inputAmount; i <tempSA.inputAmount; i--) {
            theArray[i] = theArray[i - 1];
        }
        theArray[inputAmount] = tempSA;
        reverse(this.input);
//        print();
        inputAmount++;
    }
//    https://stackoverflow.com/questions/7569335/reverse-a-string-in-java
    public void  reverse(String value){
        setString(value);
        char[] in = value.toCharArray();
        int begin=0;
        int end=in.length-1;
        char temp;
        while(end>begin){
            temp = in[begin];
            in[begin]=in[end];
            in[end] = temp;
            end--;
            begin++;
        }
        String newString = String.valueOf(in);

        System.out.println("reversed: " + newString);
    }
}