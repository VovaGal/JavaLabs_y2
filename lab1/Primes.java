public class Primes {

    public static void main(String[] args) {
        for (int n = 2; n < 100; n++) {
            if (IsPrime(n)) {
            System.out.println(n);}
        }
    }

   public static boolean IsPrime(int n) {
        for (int i = 2; i <= n/2; i++) {
            if ((n % i) == 0)
                return false;
        }
        return true;
        }
}
