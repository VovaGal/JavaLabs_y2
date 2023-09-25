public class Main {
    public static void main(String[] args) {
        System.out.println(convert(5)); /// 1
        System.out.println(fitCalc(15,1)); /// 2
        System.out.println(containers(20,50,100, 3,4,2)); /// 3
        triangleTypes(3,4,5);/// 4
        System.out.println(ternaryEvaluation(8,4)); /// 5
        System.out.println(howManyItems(22,1.4,2)); /// 6
        System.out.println(factorial(4)); /// 7
        System.out.println(gcd(25,125)); /// 8
        System.out.println(ticketSaler(70,1500)); /// 9
        System.out.println(tables(31,20)); /// 10
    }
    public static float convert (int lit2gal) {
        return lit2gal*3.785f; } /// 1
    public static float fitCalc (int extime, int difficulty ) {
        return extime*difficulty; } /// 2
    public static float containers (int box, int bag, int barrel, int box_count, int bag_count, int barrel_count ) {
        return box_count*box+bag_count*bag+barrel_count*barrel; } /// 3
    public static void triangleTypes (int x, int y, int z) { ///////////// check switch case
        if (x + y <z || x + z < y) {
            System.out.println("Not a triangle");
        } else {
            if (x == y && y == z)
                System.out.println("Equilateral");
            else if (x == y || y == z || x == z)
                System.out.println("Isosceles");
            else
                System.out.println("Scalene");
        }
    } /// 4
    public static float ternaryEvaluation (int a, int b ) {
       var result = (a > b)
               ? a : b;
       return result;
    } /// 5 /// actually in java ($15.25) this is THE conditional operator. there could be another ternary operator but only one conditional operator
    public static double howManyItems (int roll_l, double part_l, double part_w) {
        return Math.floor((roll_l * 2) /(part_l*part_w));
    } /// 6
    public static float factorial (int fac) {
        return (fac <= 2)
                ? fac : fac * factorial(fac - 1);
    } /// 7
    public static float gcd (int a, int b ) {
        return (b == 0)
                ? a : gcd (b, a % b);
    } /// 8
    public static double ticketSaler (int tickets, int price ) {
        return tickets*price*0.72; } /// 9
    public static int tables (int student_n, int table_n) {
        return ((student_n/2)<=table_n)
                ? 0 : (int) Math.ceil( (double) (student_n%table_n)/2);
    } /// 10
}
