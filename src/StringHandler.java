/*
 * StringHandler class
 * Contains main functionality for applying few operations to string and print the result into console
 * EPAM Java training for automation QA
 * Author: Kirill Kuzin
 * Lesson 1 Task 2
 * */
import java.util.Scanner;

public class StringHandler {
    public void doLongestShortestStringLength(){
        Scanner in = new Scanner(System.in);
        int longestStringIndex = 0;
        int shortestStringIndex = 0;
        System.out.println("Enter amount of strings:");
        if(in.hasNextInt()){
            int n = Integer.parseInt(in.nextLine());  //parseInt() added because of nextInt() ignoring \n symbol (so nextLine() gonna return empty string)
            String[] targetStringArray= new String[n];
            System.out.println("Enter " +  n + " strings:");
            for (int i = 0; i < n; i++) {
                targetStringArray[i] = in.nextLine();
                if(targetStringArray[i].length() <= targetStringArray[shortestStringIndex].length()){
                    shortestStringIndex = i;
                }
                if(targetStringArray[i].length() >= targetStringArray[longestStringIndex].length()){
                    longestStringIndex = i;
                }
            }
            System.out.println("Shortest string: \"" + targetStringArray[shortestStringIndex] + "\"; length: " + targetStringArray[shortestStringIndex].length());
            System.out.println("Longest string: \"" + targetStringArray[longestStringIndex] + "\"; length: " + targetStringArray[longestStringIndex].length());

        }
    }
}
