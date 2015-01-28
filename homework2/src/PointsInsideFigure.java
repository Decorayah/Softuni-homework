import java.util.Scanner;


public class PointsInsideFigure {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String numbers = input.nextLine();
		String[] numArray = numbers.split(" ");
		float a = Float.parseFloat(numArray[0]);
		float b = Float.parseFloat(numArray[1]);
		if(a >= 12.5 && a <= 22.5){
			if(b >= 6 && b <= 13.5){
				if((a > 17.5 && a < 20) && (b > 8.5))
					System.out.println("Outside");
				else
					System.out.println("Inside");
			}
			else
				System.out.println("Outside");
		}
		else
			System.out.println("Outside");
	}
}
