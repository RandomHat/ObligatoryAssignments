package InheritanceFiles.Exercise3;

import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCounter {
    File file;
    List<String> stringArrayFromFile = new ArrayList<>();
    List<String[]> splitStringsIn2dArray = new ArrayList<>();

    // Makes the wordCounter from a filePath
    WordCounter(String pathName){
        file = new File(pathName);
        try {
            initializeStringArrayFromFile();
            splitLinesToWordsArray();
        } catch (FileNotFoundException err){
            System.err.println("File was not found at: " + pathName);
        }
    }

    // Reads the file and converts each line of the file into a String and adds it to the list of strings.
    private void initializeStringArrayFromFile() throws FileNotFoundException{
        Scanner sc = new Scanner(file);
        while (sc.hasNext()){
            String nextString = sc.nextLine();
            stringArrayFromFile.add(nextString);
        }
    }

    // Takes the stringArrayFromFile and replaces all numbers and symbols except hyphens with whitespaces
    // it then splits the string by whitespace and adds it to splitStringsIn2dArray
    private void splitLinesToWordsArray(){
        for(String textLine : stringArrayFromFile){
            splitStringsIn2dArray.add(textLine.replaceAll("[^A-Za-zæøåÆØÅ\s-]", " ").split(" "));
        }
    }

    // Finally the 2dArray of uncounted words are iterated over with a counter to find the amount of words.
    // Every single string resulting from the line split is searched with the regex. That is done to exclude strings
    // containing only whitespaces as a byproduct of the removal of numbers and symbols.
    // then returns the word count as an int.
    public int countWords(){
        int count = 0;
        for (String[] wordsFromLine : splitStringsIn2dArray){
            for (String word : wordsFromLine){
                Pattern pattern = Pattern.compile("[a-zæøå]", Pattern.CASE_INSENSITIVE);
                Matcher matcher = pattern.matcher(word);
                if (matcher.find()){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        WordCounter wordCounter = new WordCounter("resources/StringsExample");
        System.out.println(wordCounter.countWords());
    }
}
