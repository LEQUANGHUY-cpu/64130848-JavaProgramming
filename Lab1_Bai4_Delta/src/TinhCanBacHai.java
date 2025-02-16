import java.util.Scanner;
public class TinhCanBacHai {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap he so a: ");
        double a = scanner.nextDouble();        
        System.out.print("Nhap he so b: ");
        double b = scanner.nextDouble();        
        System.out.print("Nhap he so c: ");
        double c = scanner.nextDouble();
        
        double delta = b * b - 4 * a * c;
        
        if (delta >= 0) {
            double sqrtDelta = Math.sqrt(delta);
            System.out.println("Can delta: " + sqrtDelta);
        } else {
            System.out.println("Delta am, khong tinh duoc can delta.");
        }
        
        scanner.close();
    }
}

