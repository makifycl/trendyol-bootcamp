package week3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordCountTests {

    @Test
    public void it_should_return_4_word() {
        //Arrange
        String givenString = "Merhaba Mustafa Akif Yücel";
        WordCount wordCount = new WordCount();

        //Act
        int words = wordCount.wordCount(givenString);


        //Verify
        assertEquals(words, 4);
    }

}
