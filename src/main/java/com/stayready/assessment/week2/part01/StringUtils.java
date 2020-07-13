package com.stayready.assessment.week2.part01;

public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {

        StringBuilder strBuilder = new StringBuilder();
        int paddedAmount = amountOfPadding - stringToBePadded.length();

        for(int i = 0; i < paddedAmount; i++){
            strBuilder.append(" ");
        } strBuilder.append(stringToBePadded);
        return strBuilder.toString();
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        StringBuilder strBuilder = new StringBuilder();
        int paddedAmount = amountOfPadding - stringToBePadded.length();

        strBuilder.append(stringToBePadded);
        for(int i = 0; i < paddedAmount; i++){
            strBuilder.append(" ");
        }
        return strBuilder.toString();
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        return stringToBeRepeated.repeat(numberOfTimeToRepeat);
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alphabetic a-z characters
     */
    public static Boolean isAlphaString(String string) {
        String onlyAlphaString = string.replaceAll("\\s", "");
        return onlyAlphaString.matches("[a-zA-Z]+");
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        String onlyNumChars = string.replaceAll("\\s", "");
        return onlyNumChars.matches("[0-9]+");
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        String onlySpecialChars = string.replaceAll("\\s", "");
        return onlySpecialChars.matches("[!@#$%&*()_+=|<>?{}[]~-]+\\");
    }
}
