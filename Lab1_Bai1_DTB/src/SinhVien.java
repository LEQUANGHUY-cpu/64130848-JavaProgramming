import java.util.Scanner;

public class SinhVien {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhap ho va ten sinh vien: ");
	        String fullName = scanner.nextLine();
	        System.out.print("Nhap điem trung binh: ");
	        double averageScore = scanner.nextDouble();

	        System.out.println("\nThong tin sinh vien:");
	        System.out.println("Ho va ten: " + fullName);
	        System.out.println("Điem trung binh: " + averageScore);
	        
	        scanner.close();
	    }

}
