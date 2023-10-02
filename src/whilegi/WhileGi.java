package whilegi;
import java.util.Scanner;

public class WhileGi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Sartu zenbaki bat");
		int zenbakia = sc.nextInt();
		
		int batuketa = 0;
		int kontagailua = 1;
		
		while (kontagailua <= zenbakia) {
			
			batuketa += kontagailua;
			 kontagailua ++;
		}
		
	System.out.println("Batuketaren emaitza :" + batuketa);
	
	
		sc.close();

	}

	}
