public class StringOperations {

    public static String reverseString(String text) {

        String reveserdString = "";

        int length = text.length();
        for (int index = 0; index < length; index++) {
            reveserdString = text.charAt(index) + reveserdString;
        }

        return reveserdString;
    }

    public static int countChartAtString(String text, char character) {
        int count = 0;
        int length = text.length();
        for (int index = 0; index < length; index++) {
            if (text.charAt(index) == character) {
                count++;
            }
        }
        return count;
    }

    public static int indexOf(String text, String subText) {
        return text.indexOf(subText);
    }

    public static String subString(String text, int index, int length) {
        return text.substring(index, index + length);
    }

    public static boolean isPalindrome(String text) {
        text = text.replace(" ", "");
        return text.equals(reverseString(text));
    }
}
