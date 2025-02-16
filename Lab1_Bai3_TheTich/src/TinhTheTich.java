import java.util.Scanner;
public class TinhTheTich {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhap so canh cua khoi lap phuong: ");
	        
	        double edge = scanner.nextDouble();
	        double volume = Math.pow(edge, 3);
	        
	        System.out.println("The tich cua khoi lap phuong là: " + volume);
	        
	        scanner.close();
	    }

}
