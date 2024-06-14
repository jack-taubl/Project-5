import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 * Take in user input which should be a string of numbers separated by a space character.
 * We will then convert those numbers to an array of ints and sort them. We then initialize a new
 * Stack object and add them to the Stack object in order of smallest to biggest and
 * print the Stack items back to the user.
 * @author Jack Taubl
 * @version 1.0.0
 * @since Week 5 of CSC6301
 */


/**
 * Main method for the program, has methods:
 * user_array(), convert_to_array(), sort_array(), main()
 */
public class Main {

    /**
     * This method prompts the user for input, for a string of numbers separated
     * by a space. We ensure that there is at least one space in the user input.
     * @return user_input, a string of numbers separated by a space.
     */
    public static String user_array() {
        Scanner scanner = new Scanner(System.in);

        // Instructions for the user
        System.out.println("Enter an array of unsorted numbers: ");
        System.out.println("Example: 5 9 7 13 11 25 14 18");
        System.out.print(">>> ");
        // Grab the user input
        String user_input = scanner.nextLine();
        // Ensure there is a space in the string
        if (!user_input.contains(" ")) {
            System.out.println("Invalid input, please enter an array of numbers:");
            System.out.println("Example: 5 9 7 13 11 25 14 18");
            System.out.println("");
            return user_array();
        }
        
        return user_input;
    }

    /**
     * This method takes in the user input as a parameter, splits the user input on 
     * spaces and then adds each number formatted as a string to an int in the new array.
     * @param user_numbers the user input (string) that will be split on the space
     * and then converted to an array of ints.
     * @return an array of ints int_user_array will be returned to the program.
     */
    public static int[] convert_to_array(String user_numbers) {
        // Split the user's numbers on a space
        String[] user_numbers_split = user_numbers.split(" ");

        // Create an array of ints from the user provided string
        int[] int_user_array = new int[user_numbers_split.length];

        // Convert each item to int 
        for (int i = 0; i < user_numbers_split.length; i++) {
            int_user_array[i] = Integer.parseInt(user_numbers_split[i]);
        }

        return int_user_array;
    }

    /**
     * This method sorts the array of integers.
     * @param array an array of ints that is currently unsorted.
     * @return array an array of ints that have been sorted from smallest to largest.
     */
    public static int[] sort_array(int[] array) {
        Arrays.sort(array);
        return array;
    }

    /**
     * This method takes an array of integers, adds them to a stack,
     * and returns the items in the stack.
     * @param array an array of sorted integers.
     * @return a list of integers representing the items in the stack.
     */
    public static List<Integer> stack(int[] array) {
        Stack<Integer> stack = new Stack<>();
        for (int i = array.length - 1; i >= 0; i--) {
            stack.push(array[i]);
        }

        // Collect stack items in a list
        List<Integer> stackItems = new ArrayList<>();
        while (!stack.empty()) {
            stackItems.add(stack.pop());
        }
        
        return stackItems;
    }

    /**
     * This is the main method which takes in String[] as args. 
     * Prompts the user for input, takes in the user string input and converts each
     * value to an int, sorts them, adds them to the stack structure and prints
     * the output of the sorted stack back to the user.
     * @param args
     */
    public static void main(String[] args) {
        
        // Get user input
        String user_input = user_array();

        // Debugging line 
        // System.out.println(user_input);

        int[] converted_array = convert_to_array(user_input);

        // Sort the array
        int[] sorted_array = sort_array(converted_array);

        // Print to the user let them know it's our stack
        System.out.println("");
        System.out.println("Stack Items:");
        List<Integer> stackItems = stack(sorted_array);
        
        // Print the items in the stack
        for (int item : stackItems) {
            System.out.println(item);
        }
    }
}
