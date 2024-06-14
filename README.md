# Project-5
# Number Sorting and Stacking Program
## Overview

This Java program takes a user input of numbers separated by spaces, converts them to an array of integers, sorts them in ascending order, and then adds them to a stack. The stack items are then printed back to the user in sorted order.
Features

    Accepts a string of numbers separated by spaces as user input.
    Converts the string of numbers into an array of integers.
    Sorts the array of integers in ascending order.
    Adds the sorted integers to a stack.
    Prints the stack items back to the user.

## Usage
## Prerequisites

    Java Development Kit (JDK) installed on your machine.

## Running the Program

    Compile the Program

    Open a terminal and navigate to the directory where the Main.java file is located. Compile the program using the following command:

    sh

javac Main.java

Run the Program

After successfully compiling the program, run it using the following command:

sh

java Main

## Provide Input

When prompted, enter a string of unsorted numbers separated by spaces. For example:

````
Enter an array of unsorted numbers: 
Example: 5 9 7 13 11 25 14 18
>>> 5 9 7 13 11 25 14 18

View Output

The program will then display the sorted numbers in stack order:

    Stack Items:
    5
    7
    9
    11
    13
    14
    18
    25
````
## Code Structure

The program consists of the following methods:

    user_array(): Prompts the user for input and ensures the input contains at least one space.
    convert_to_array(String user_numbers): Converts the user input string into an array of integers.
    sort_array(int[] array): Sorts the array of integers in ascending order.
    stack(int[] array): Adds the sorted integers to a stack and returns the stack items as a list.
    main(String[] args): The main method that orchestrates the flow of the program.

### Example

Here is an example of the program in action:

yaml

Enter an array of unsorted numbers: 
Example: 5 9 7 13 11 25 14 18
>>> 5 9 7 13 11 25 14 18

Stack Items:
5
7
9
11
13
14
18
25

Author

Jack Taubl
Version

1.0.0
License

This project is licensed under the MIT License.
