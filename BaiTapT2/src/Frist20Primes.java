public class Frist20Primes {
    public static void main(String[] args) {
        int count = 0;
        int num = 2;
        while (count < 20) {
            if (LaSoNguyenTo(num)) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }

    public static boolean LaSoNguyenTo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
