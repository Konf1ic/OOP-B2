import java.util.Scanner;

public class UocChungLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số thứ 1: ");
        int num1 = sc.nextInt();
        System.out.print("Nhập số thứ 2: ");
        int num2 = sc.nextInt();
        int gcf = findUCLN(num1, num2);
        System.out.println("Ước chung lớn nhất của " + num1 + " và " + num2 + " là: " + gcf);
    }

    public static int findUCLN(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        int remainder = num1 % num2;
        return findUCLN(num2, remainder);
    }
}


