import java.util.Arrays;
import java.util.Random;

public class Main {

    private static int[] arr = {3,3,-2, 408, 3, 31};
    private static String Upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static String lower = "abcdefghijklmnopqrstuvxyz";
    private static String numbers = "0123456789";
    public static void main(String[] args) {
        String s = "orange";
        System.out.println(duplicateChars(s));///1
        String fullName = "Ben Dover";
        System.out.println(getInitials(fullName));///2
        System.out.println(differenceEvenOdd(44, 32, 86, 19));///3
        System.out.println(equalToAvg(1, 2, 3, 4, 5));///4
        for (int i : indexMult())
            System.out.print(i + " "); /// 5
        System.out.println(" ");
//        int[] my_array = new int[]{1, 2, 3};
//        System.out.println(indexMult(my_array));/// 5
        System.out.println(reverse("Hello World"));/// 6
        int n = 1;
        System.out.println(Tribonacci(n)); /// 7
        int l = 10;
        System.out.println(pseudoHash(l)); /// 8
        String call_transcript = "AAAAAAAAAAAAAAAAA";
        System.out.println(botHelper(call_transcript)); /// 9
        System.out.println(isAnagram()); /// 10
        String str1 = "listen";
        String str2 = "silent";
        System.out.println(IsAnagram(str1,str2));/// actual 10
    }

    static boolean duplicateChars(CharSequence strng) {
        for (int i = 0; i < strng.length(); i++) {
            for (int j = i + 1; j < strng.length(); j++) {
                if (strng.charAt(i) == strng.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }/// 1

    static String getInitials(String fullName) {
        int idxLastWhitespace = fullName.lastIndexOf(' ');
        return fullName.charAt(0) + fullName.substring(idxLastWhitespace + 1, idxLastWhitespace + 2);
    }/// 2

    static int differenceEvenOdd (int a, int b, int c, int d) {
        int[] arr = {a,b,c,d};
        int size = arr.length;
        int sum_even = 0;
        int sum_odd = 0;
        for( int i=0; i <size; i++){
            if (arr[i]%2==0){
                sum_even = sum_even + arr[i];
            } else if (arr[i]%2==1){
                sum_odd = sum_odd + arr[i];
            }
        }
        return Math.abs(sum_even - sum_odd);
    } /// 3

    static boolean equalToAvg (double a, double b, double c, double d, double e) {
        double[] arr = {a,b,c,d,e};
        boolean result = false;
        int size = arr.length;
        double arr_average = (double) (a + b + c + d + e) / arr.length;
        for ( int i=0; i <size; i++) {
            if (i == arr_average){
                result = true;
            }
        }
        return result;
    } /// 4

    static int[] indexMult () {
        int size =arr.length;
        int[] new_arr = arr;
        int a = 0;
        for ( int i=0; i <size; i++) {
            new_arr[i] *= a;
            a = i + 1;
        }
        return new_arr;
    } /// 5
    public static String reverse(String to_reverse) {
        String reversed = "";
        for (int i = 0; i < to_reverse.length(); i++) {
            reversed = to_reverse.charAt(i) + reversed;
        }
        return reversed;
    } /// 6

    static int Tribonacci(int n) {
        int a = 0, b = 0, c = 1, d;
        if (n == 0 || n == 1)
            return a;
        for (int i = 2; i <= n; i++) {
            d = c + a + b;
            a = b;
            b = c;
            c = d;
        }
        return c;
    } /// 7

    static String pseudoHash(int l) {
        StringBuilder str = new StringBuilder(l);
        for (int i = 0; i < l; i++) {
            int index = (int) ((Upper + lower + numbers).length() * Math.random());
            str.append((Upper + lower + numbers).charAt(index));
        }
        return str.toString();
    } /// 8

    static String botHelper(String call_transcript) {
        String p_responce = "Calling a staff member";
        String n_responce = "Keep Waiting";
        boolean check = call_transcript.contains("help")||call_transcript.contains("HELP")||call_transcript.contains("Help");
        return (check)
                ? p_responce : n_responce;
    } /// 9

    public static boolean isAnagram() {
        return new Random().nextBoolean();
    } /// 10

    static boolean IsAnagram (String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        return Arrays.equals(s1,s2);
    } /// actual 10

}
