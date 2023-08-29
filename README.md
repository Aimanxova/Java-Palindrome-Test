# Palindrome Checker

This program checks whether a given word is a palindrome or not. A palindrome is a word that reads the same forwards and backwards.

## Prerequisites

- Java Development Kit (JDK) 8 or later installed on your system.

## How to Run

1. Compile the Java source code using the following command in the terminal:

   ```
   javac PalindromeDemo.java
   ```

2. Run the compiled program using the following command:

   ```
   java PalindromeDemo
   ```

3. A dialog box will prompt you to enter a word. Type the word and click "OK".

4. The program will then determine whether the word is a palindrome or not and display the result in the console.

## Example Usage

Suppose you want to check if the word "racecar" is a palindrome. Here's how you would run the program:

1. Compile the Java source code:

   ```
   javac PalindromeDemo.java
   ```

2. Run the program:

   ```
   java PalindromeDemo
   ```

3. Enter the word "racecar" in the dialog box and click "OK".

4. The program will output the following in the console:

   ```
   Word: racecar is a Palindrome
   ```

   This indicates that the word "racecar" is indeed a palindrome.

## Explanation

The program consists of two main parts:

1. The `main` method:
   - Prompts the user to enter a word using a dialog box.
   - Passes the entered word to the `isPalindrome` method to check if it is a palindrome.
   - Prints the result in the console.

2. The `isPalindrome` method:
   - Takes a word as input and checks if it is a palindrome.
   - Converts the word to lowercase for case-insensitive comparison.
   - Implements a recursive algorithm to determine if the word is a palindrome:
     - If the word length is 0 or 1, it is considered a palindrome (base case).
     - If the first and last characters of the word are the same, the method calls itself recursively with a substring of the word without the first and last characters.
     - If the first and last characters are not the same, the word is not a palindrome.

Feel free to modify the code as needed or use it as a reference for your own projects.

Enjoy exploring palindromes with this program!

## License
[MIT License](LICENSE)

**Please note that this eLeave System is provided as-is without any warranty. Use it at your own risk.**
