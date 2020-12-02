package com.example.wordcounter;

public class TextCounter {
    public static int getCharsCount(String text) {
        return text.length();
    }


    public static int countStrings(String text)
     {
      return text.split(",.\\s+").length;
    }

}
