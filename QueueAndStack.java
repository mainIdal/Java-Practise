import java.io.*;
import java.util.*;

public class Solution {
    
    ArrayList<Character> stack;
    ArrayList<Character> que;
    
    Solution(){
        this.stack = new ArrayList<Character>();
        this.que = new ArrayList<Character>();
    }
    
    void pushCharacter(char ch){
        stack.add(ch);
    }
    
    void enqueueCharacter(char ch){
        que.add(ch);
    }
    
    char popCharacter() {
        int lastIndex = stack.size()-1;
        char temp = stack.get(lastIndex);
        stack.remove(lastIndex);
        return temp;
    }
    
     char dequeueCharacter() {
        char temp = que.get(0);
        que.remove(0);
        return temp;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}