import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex{
    String pattern;
    
    MyRegex(){
        this.pattern = "^((([0-2](([0-5][0-5])|([0-4][0-9])))|([0-9]?[0-9])).){3}(([0-2](([0-5][0-5])|([0-4][0-9])))|([0-9]?[0-9]))$";
    }
}