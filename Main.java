//Author: Joshua J. Magdaleno
//Program: Java on IntelliJ
//Professor: Adam Kaplan
//class: COMP SCI 282

import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String[] args) {
//        url: https://stackoverflow.com/questions/5204051/how-to-calculate-the-running-time-of-my-program
        long startTime = System.nanoTime();

        StringArray sas = new StringArray(10);
        StringLinkedList slink = new StringLinkedList();
        StringQueue sq = new StringQueue();
        StringStack stack = new StringStack();


//        Array traversal
//        url: https://stackoverflow.com/questions/13185727/reading-a-txt-file-using-scanner-class-in-java
        File file = new File("C:\\Users\\Owner\\Documents\\summer282\\Project1\\src\\big.txt");

        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String value = sc.nextLine();
                String[] valueArray = value.split(" ");
                for (int i = 0; i < valueArray.length; i++) {
//                    has the reverse() method inside here. If you want to take it out you can comment out line 61 on StringArray.java
                    sas.insert(valueArray[i]);
                    //uncomment this line if you comment the reverse method in StringArray.java
//                    sas.print();

                }
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
//        Stack/Queue to Queue/Stack
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String value = sc.nextLine();
                String[] valueArray = value.split(" ");
                for (int i = 0; i < valueArray.length/4; i++) {
                    //queue to stack
                    sq.enqueue(valueArray[i]);
                    String takeQueue = sq.dequeue();
                    String toStack = takeQueue + "now is in stack";
                    stack.push(toStack);
                    //stack to queue
//                    stack.push(yes[i]);
//                    String takeStack = stack.pop();
//                    String toQueue = takeStack + " now is in Queue";
//                    sq.enqueue(toQueue);
                }
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime / 1000000000 + " seconds");
    } //end main

}//end class

