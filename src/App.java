public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(StringOperations.reverseString("Test"));

        System.out.println(StringOperations.countChartAtString("Alabama", 'a'));

        System.out.println(StringOperations.indexOf("Alabama", "ma"));

        System.out.println(StringOperations.subString("Alabama", 0, 3));

        System.out.println(StringOperations.isPalindrome("ama"));
    }
}
