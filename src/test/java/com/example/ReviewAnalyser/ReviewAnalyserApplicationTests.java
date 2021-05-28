package com.example.ReviewAnalyser;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
//import org.junit.Test;
import static org.junit.Assert.*;

@SpringBootTest
class ReviewAnalyserApplicationTests {

    private ReviewAnalyserApplication analyser = new ReviewAnalyserApplication();
    @Test	 
    public void testWordCount() {     	 
   	 assertEquals(7,analyser.getWordCount("Train to win in the digital economy"));	 
    }
}

