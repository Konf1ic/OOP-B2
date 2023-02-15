import java.util.Scanner;
public class LaiSuatChoVay {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập số tiền vay: ");
            double TienVay = sc.nextDouble();
            System.out.print("Nhập lãi suất: ");
            double LaiSuat = sc.nextDouble();
            System.out.print("Nhập số năm: ");
            int SoNam = sc.nextInt();
            double LaiVay = TienVay * (LaiSuat / 100) * SoNam;
            System.out.println("Lãi vay là: $" + LaiVay);
        }
    }

