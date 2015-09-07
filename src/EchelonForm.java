import java.util.Scanner;

public class EchelonForm {

	public static void main(String[] args) {
		Matrix sampleM = new Matrix(new int[][]{{0, -3, -6, 4, 9}, {-1, -2, -1, 3, 1}, {-2, -3, 0, 3, -1}, {1, 4, 5, -9, -7}});
		sampleM.printProperties();
		boolean repeat = true;
		while(repeat){
			System.out.println(">>> Action to perform:");
			Scanner input = new Scanner(System.in);
			int action = input.nextInt();
			switch(action){
				case 1: System.out.println("Change rows function");
						break;
				case 2: System.out.println("Multiply");
						break;
				case 0: System.out.println("==== PROGRAM QUIT BAI ====");
						repeat = false;
						break;
				default: System.out.println("==== Invalid action selection try again ====");
						break;
			}
		}
	}

	
	
}
