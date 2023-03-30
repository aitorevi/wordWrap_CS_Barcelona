package org.wordwrap;

public class WordWrap {
    public static void main(String[] args) {
        String originalText = "hola";
        int columnsNumber = 2;
        System.out.println(TransformTextWithConsole(originalText,columnsNumber));
    }

    public static String TransformTextWithConsole(String originalText, int columnsNumber) {
        if (!(columnsNumber > originalText.length())) {
            var transformTextPartOne = originalText.substring(0,2);
            var transformTextPartTwo = originalText.substring(2);
            return transformTextPartOne + "\n" + transformTextPartTwo;
        }
        return originalText;
    }
}
