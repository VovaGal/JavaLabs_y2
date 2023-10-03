import java.util.Arrays;
import java.util.StringJoiner;

public class Main {
    private static String s = "aaa abb bcc cdd";
    public static void main(String[] args) {
//        System.out.println(replaceVowels());/// 1
//        System.out.println(stringTransform());/// 2
        int[] shape = {10,10,2};
        int[] hole = {1,10};
        System.out.println(doesBlockFit(shape, hole));/// 3
        int a = 243;
        System.out.println(numCheck(a));/// 4
        int[] quad_arr = {1, -6, 9};
        System.out.println(countRoots(quad_arr));/// 5
        String[][] item_list = { {"Apple", "shop1", "shop2", "shop3", "shop4"},
                {"Banana", "shop2", "shop3", "shop4"},
                {"Dog", "shop1", "shop3", "shop4"},
                {"Orange", "shop1", "shop2", "shop3", "shop4"}
        };
        System.out.println(salesData(item_list));/// 6
        System.out.println(validSplit());/// 7
        int[] wave = {1,2,-6,10,3};
        System.out.println(waveForm(wave));/// 8
        System.out.println(commonVowel());/// 9
        int [][] arrgh = {{1, 2, 3, 4, 5},
                          {6, 7, 8, 9, 10},
                          {5, 5, 5, 5, 5},
                          {7, 4, 3, 14, 2},
                          {1, 0, 11, 10, 1}};
        dataScience(arrgh);
        for (int[] ints : arrgh) System.out.println(Arrays.toString(ints));/// 10


    }

    public static String replaceVowels() {
        s = s.replaceAll("[aeiou]", "*");
        return s;
    } /// 1

    static String stringTransform () {
        for (int i = 0; i < s.length(); i++)
            s = s.replaceAll("(.)\\1", "Double$1");
        return s; /// 2
    }

    static boolean doesBlockFit (int[] shape, int[] hole) {
        Arrays.sort(shape);
        Arrays.sort(hole);
        return
                shape[0] <= hole[0] && shape[1] <= hole[1];

    } /// 3 переделано и упрощено

    static boolean numCheck (int a) {
        int sqrd_sum = 0;
        int b = a;
        while (b > 0) {
            sqrd_sum = sqrd_sum + (b % 10)*(b % 10);
            b = b / 10;
        }
        return ((a + sqrd_sum) % 2 == 0);
    } /// 4 упростил return

    static int countRoots (int[] quad_arr) {
        int D = ((quad_arr[1] * quad_arr[1]) - 4 * quad_arr[0] * quad_arr[2]);
        if (D > 0) {
            double x1 = (-quad_arr[1] + Math.pow(D, 0.5))/(2 * quad_arr[0]);
            double x2 = (-quad_arr[1] - Math.pow(D, 0.5))/(2 * quad_arr[0]);
            if (x1 == (int)x1 && x2 == (int)x2) return 2;
            else return 1;
        }
        else if (D == 0) {
            double x1 = (double) (-quad_arr[1]) / (2 * quad_arr[0]);
            if (x1 == (int)x1) return 1;
        }
        return 0;
    } /// 5

    static String salesData (String[][] item_list) {
        StringJoiner list = new StringJoiner(" ");
        for (String[] strings : item_list) {
            if (strings.length == 5)
                list.add(strings[0]);
        }
        return list.toString();
    } /// 6

    static boolean validSplit() {
        boolean result = false;
        int counter = 0;
        String[] a = s.split(" ");
        for (int i = 1; i < a.length; i++) {
            if (a[i-1].charAt(a[i-1].length()-1) == a[i].charAt(0)) {
                counter++;
            }
        }
        for (int i = 2; i < a.length; i++) {
            if (a[i-1].charAt(a[i-1].length()-1) == a[i].charAt(0)) {
                counter++;
            }
        }
        if (counter == -3 + (a.length ) * 2) {
            result = true;
        }
        return result;
    } /// 7

    static boolean waveForm(int[] wave) {
        boolean result = false;
        if (wave[1] > wave[0] && wave[1] > wave[2]) {
            for (int i = 1; i < wave.length - 1; i +=2) {
                if (wave[i] > wave[i - 1] && wave[i] > wave[i + 1]) {
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }
            if (result == true && wave.length % 2 == 0) {
                if (wave[wave.length - 1] <= wave[wave.length - 2]) {
                    result = false;
                }
            }
        }
        else if (wave[1] < wave[0] && wave[1] < wave[2]) {
            for (int i = 1; i < wave.length - 1; i += 2) {
                if (wave[i] < wave[i - 1] && wave[i] < wave[i + 1]) {
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }
            if (result == true && wave.length % 2 == 0) {
                if (wave[wave.length - 1] >= wave[wave.length - 2]) {
                    result = false;
                }
            }
        }
        return result;
    } /// 8

/*    static String commonVowel() {
        int vowA = 0;
        int vowE = 0;
        int vowI = 0;
        int vowO = 0;
        int vowU = 0;
        String vowel = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            if (ch == 'a')
                vowA++;
            else if (ch == 'e')
                vowE++;
            else if (ch == 'i')
                vowI++;
            else if (ch == 'o')
                vowO++;
            else if (ch == 'u')
                vowU++;
        }
        if (vowA > vowE && vowA > vowI && vowA > vowO && vowA > vowU)
            vowel = "A";
        else if (vowE > vowA && vowE > vowI && vowE > vowO && vowE > vowU)
            vowel = "E";
        else if (vowI > vowE && vowI > vowA && vowI > vowO && vowI > vowU)
            vowel = "I";
        else if (vowO > vowE && vowO > vowI && vowO > vowA && vowO > vowU)
            vowel = "O";
        else if (vowU > vowE && vowU > vowI && vowU > vowO && vowU > vowA)
            vowel = "U";
        return vowel;
    } /// 9 */

    static char commonVowel() {
        String ss = s.toLowerCase();
        String vowels = "aeiou";
        char maxappearchar = ' ';
        int counter = 0;
        int[] charcnt = new int[Character.MAX_VALUE + 1];
        for (int i = 0 ; i < ss.length() ; i++) {
            char ch = ss.charAt(i);
            charcnt[ch]++ ;
            if  (vowels.contains(String.valueOf(ch)) && (charcnt[ch] >= counter)) {
                counter = charcnt[ch];
                maxappearchar = ch;
            }
        }
        return maxappearchar;
    } /// 9 оптимизирован

    static String dataScience(int[][] arrgh) {
        int[] replaced = new int[arrgh.length];
        for (int[] ints : arrgh) {
            for (int i = 0; i < arrgh.length; i++) {
                replaced[i] += ints[i];
            }
        }
        for (int j = 0; j < arrgh.length; j++) {
            arrgh[j][j] = replaced[j] / arrgh.length;
        }
        return Arrays.toString(arrgh[0]) + Arrays.toString(arrgh[1]) + Arrays.toString(arrgh[2]) + Arrays.toString(arrgh[3]) + Arrays.toString(arrgh[4]);
    } /// 10 сократил
}
