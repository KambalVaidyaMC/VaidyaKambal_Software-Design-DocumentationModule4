/**
 * Kambal Vaidya
 * Module 4 
 * Programming Assignment
 * Software Design and Documentation
 */

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * This class takes integer input from the user and stores the result into a sorted list.
 * It uses the Collections LinkedList as a base to build the program off.
 * It also uses the Collections to sort the list.
 */
public class SortedLinkedList {
    /**
     * The main method runs the program
     * This start by promting the user for input using scanner
     * It will add to the list and sort before printing and asking again
     * The program will end when the user types in Done
     * @param args not used, but allows running the program
     */
    public static void main(String[] args) {

        /**  Create a LinkedList to store integers
         * This is an example of code reuse as we already have the linkedlist
         * class created so we don't need to make it, and we can use the given methods to access 
         * and add to it.
         */
        List<Integer> linkedList = new LinkedList<>();
        
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);

        // Read integers from input
        System.out.println("Please enter integers (type 'done' to finish):");
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {

                /** Add the integer to the linked list
                 *  This is code reuse since the function to add is a part of linkedlist class imported
                */
                linkedList.add(scanner.nextInt());
                
                /** 
                 * Sort the linked list after each input
                 * Using the imported collections.sort
                 * Good use of code reuse since using a given code that sorts the specific collection of linkedlist 
                 */ 
                Collections.sort(linkedList);

                // Display the list after sorting
                System.out.println("Current sorted Linked List: " + linkedList);
            } else if (scanner.next().equalsIgnoreCase("done")) {
                // Break the loop when user types "done"
                break;
            } else {
                System.out.println("Please enter a valid integer or 'done' to finish.");
            }
        }

        // Closing the scanner
        scanner.close();

        // Print the final sorted list
        System.out.println("Final Sorted Linked List: " + linkedList);
    }
}
