package week3;

public class WordCount {


    public int wordCount(String givenString) {
        String[] splittedString = givenString.split(" ");

        return splittedString.length;
    }

}
