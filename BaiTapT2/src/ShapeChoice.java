import java.util.Scanner;

public class ShapeChoice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Chon;

        do {
            System.out.println("1. Hình Chữ Nhật");
            System.out.println("2. Tam Giác Vuông");
            System.out.println("3. Tam Giác Cân");
            System.out.println("4. Thoát");
            System.out.print("Nhập lựa chon: ");

            Chon = sc.nextInt();

            switch (Chon) {
                case 1:
                    HCN();
                    break;
                case 2:
                    TamGiacVuong();
                    break;
                case 3:
                    TamGiacCan();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("No option. Mời chọn lại!");
                    break;
            }
        } while (Chon != 4);
    }

    public static void HCN() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void TamGiacVuong() {
        System.out.println("1. Top-Trái");
        System.out.println("2. Top-Phải");
        System.out.println("3. Bottom-Trái");
        System.out.println("4. Bottom-Phải");
        System.out.print("Nhập lựa chon: ");

        Scanner sc = new Scanner(System.in);
        int Chon = sc.nextInt();

        switch (Chon) {
            case 1:
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                for (int i = 1; i <= 5; i++) {
                    for (int j = 5; j >= 1; j--) {
                        if (j > i) {
                            System.out.print(" ");
                        } else {
                            System.out.print("* ");
                        }
                    }
                    System.out.println();
                }
                break;
            case 3:
                for (int i = 5; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 4:
                for (int i = 5; i >= 1; i--) {
                    for (int j = 5; j >= 1; j--) {
                        if (j > i) {
                            System.out.print(" ");
                        } else {
                            System.out.print("* ");
                        }
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("No option. Mời chọn lại!");
                break;
        }
    }

    public static void TamGiacCan() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập chiều cao: ");
        int height = input.nextInt();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}