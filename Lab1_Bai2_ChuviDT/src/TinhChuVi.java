import java.util.Scanner;
public class TinhChuVi {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap canh thu nhat: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap canh thu hai: ");
        double b = scanner.nextDouble();
        
        double perimeter = 2 * (a + b);
        double area = a * b;
        double minSide = Math.min(a, b);
        
        System.out.println("Chu vi hinh chu nhat: " + perimeter);
        System.out.println("Dien tich hình chu nhat: " + area);
        System.out.println("Canh nho hon: " + minSide);
        
        scanner.close();
    }

}
