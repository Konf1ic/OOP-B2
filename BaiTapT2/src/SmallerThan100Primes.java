public class SmallerThan100Primes {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            if (LaSoNguyenTo(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean LaSoNguyenTo(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

