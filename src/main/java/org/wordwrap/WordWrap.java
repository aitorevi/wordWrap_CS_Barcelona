package org.wordwrap;

public class WordWrap {
    public static void main(String[] args) {
        String originalText = "hola";
        int columnsNumber = 7;
        System.out.println(TransformTextWithConsole(originalText,columnsNumber));
    }

    public static String TransformTextWithConsole(String originalText, int columnsNumber) {
        if (columnsNumber > originalText.length()) return originalText;
        return "";
    }
}
