package rocks.zipcode.quiz4.fundamentals;

import java.util.Arrays;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        return string.charAt(string.length()>>1);
    }

    public static String capitalizeMiddleCharacter(String str) {
        char[] arr = str.toCharArray();
        arr[arr.length>>1] = String.valueOf(getMiddleCharacter(str)).toUpperCase().charAt(0);
        return new String(arr);
    }

    public static String lowerCaseMiddleCharacter(String str) {
        char[] arr = str.toCharArray();
        arr[arr.length>>1] = String.valueOf(getMiddleCharacter(str)).toLowerCase().charAt(0);
        return new String(arr);
    }

    public static Boolean isIsogram(String str) {
        return Arrays.stream(str.split("")).filter(x-> countLetter(str,x)==1).count() == str.length();
    }

    public static int countLetter(String str, String letter) {
        return Math.toIntExact(Arrays.stream(str.split("")).filter(x-> x.equals(letter)).count());
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        return str.matches(".*(.)\\1.*");
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        return str.replaceAll("(.)\\1","");
    }

    public static String invertCasing(String str) {
        char[] arr = str.toCharArray();
        for (int i=0; i<arr.length; i++) {
            arr[i] = (arr[i] <= 90)
                    ? String.valueOf(arr[i]).toLowerCase().charAt(0)
                    : String.valueOf(arr[i]).toUpperCase().charAt(0);
        }
        return String.valueOf(arr);
    }
}