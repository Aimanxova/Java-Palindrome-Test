/*
 * @Author   Muhammad Aiman Iskandar
 * @Version  JDK 18
 * @Since    14-06-2022
 */
import javax.swing.*;
import java.util.Locale;

public class PalindromeDemo {

    public static void main(String[] args) {
        String str = JOptionPane.showInputDialog("Insert a word");

        if (isPalindrome(str)) {
            System.out.println("Word: " + str + " is a Palindrome");
        } else {
            System.out.println("Word: " + str + " is not a Palindrome");
        }
    }

    /**
     * Checks if a word is a palindrome.
     *
     * @param word the word to check
     * @return true if the word is a palindrome, false otherwise
     */
    public static boolean isPalindrome(String word) {
        word = word.toLowerCase(Locale.ROOT); // Convert word to lowercase for case-insensitive comparison

        // Base case: word with length 0 or 1 is considered a palindrome
        if (word.length() <= 1) {
            return true;
        } else {
            char first = word.charAt(0); // First character of the word
            char last = word.charAt(word.length() - 1); // Last character of the word

            if (first == last) {
                // Recursively check if the substring without the first and last characters is a palindrome
                return isPalindrome(word.substring(1, word.length() - 1));
            } else {
                return false;
            }
        }
    }
} // End of class
