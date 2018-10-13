/*
 * StringHandler class
 * Contains main functionality for applying few operations to string and print the result into console
 * EPAM Java training for automation QA
 * Author: Kirill Kuzin
 * Lesson 1 Task 2
 * */
import java.util.*;

public class StringHandler {
    public void doLongestShortestStringLength(){
        Scanner in = new Scanner(System.in);
        int longestStringIndex = 0;
        int shortestStringIndex = 0;
        System.out.println("First task. \nEnter amount of strings:");
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
    public void doWordsLengthComparison(){
        String[] words;
        String text;
        int minAmountOfDiffSymbols = Integer.MAX_VALUE;
        Scanner in = new Scanner(System.in);
        System.out.println("Forth task. \nEnter words divided with 'space':");
        text = in.nextLine();
        words = text.split(" ");
        String wordWithLesserUniqChars = words[0];
        int amountOfUniqChars = new HashSet<String> (Arrays.asList(words[0].split(""))).size();
        for (String word : words){
            Set<String> hashSet = new HashSet<String> (Arrays.asList(word.split("")));
            if (hashSet.size() < amountOfUniqChars){
                wordWithLesserUniqChars = word;
                amountOfUniqChars = hashSet.size();
            }
        }
        System.out.println("Word with lesser amount of unique chars is \"" + wordWithLesserUniqChars  +"\".");
    }
}

