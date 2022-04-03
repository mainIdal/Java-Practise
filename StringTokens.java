import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String [] tokens = s.split("[, !?._'@]");
        
        int num = 0;
        for(int i=0; i<tokens.length; i++){
            if (tokens[i].compareTo("") != 0){
                num++;
            }
        }
        System.out.println(num);
    
        for (String token:tokens){
            if (token.compareTo("") != 0){
                System.out.println(token);
            }
        }
        scan.close();
    }
}

