import java.util.Arrays;
import java.util.StringJoiner;

public class Main {
    private static String s = "aaa abb bcc cdd dee eff";
    public static void main(String[] args) {
        System.out.println(replaceVowels());/// 1
        System.out.println(stringTransform());/// 2
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
    } /// 4 упрощено return

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

    static String commonVowel() {
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
    } /// 9

    static String dataScience(int[][] arrgh) {
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        int sum5 = 0;
        for (int i = 0; i < arrgh.length; i++) {
            sum1 += arrgh[i][0];
            sum2 += arrgh[i][1];
            sum3 += arrgh[i][2];
            sum4 += arrgh[i][3];
            sum5 += arrgh[i][4];
        }
        int avv1 = sum1 / arrgh.length;
        int avv2 = sum2 / arrgh.length;
        int avv3 = sum3 / arrgh.length;
        int avv4 = sum4 / arrgh.length;
        int avv5 = sum5 / arrgh.length;
        int[] replaced = {avv1, avv2, avv3, avv4, avv5};

        int[][] new_arrgh = arrgh;
        for (int j = 0; j < new_arrgh.length; j++){
            if (j == 0)
                new_arrgh[j][0] = avv1;
            else if (j == 1)
                new_arrgh[j][1] = avv2;
            else if (j == 2)
                new_arrgh[j][2] = avv3;
            else if (j == 3)
                new_arrgh[j][3] = avv4;
            else if (j == 4)
                new_arrgh[j][4] = avv5;
            else
                new_arrgh[j] = arrgh[j];
        }
        return Arrays.toString(new_arrgh[0]) + Arrays.toString(new_arrgh[1]) + Arrays.toString(new_arrgh[2]) + Arrays.toString(new_arrgh[3]) + Arrays.toString(new_arrgh[4]);

    } /// 10




}
