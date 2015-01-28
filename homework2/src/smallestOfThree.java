import java.util.Scanner;

public class smallestOfThree {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float firstNumber = input.nextFloat();
		float secondNumber = input.nextFloat();
		float thirdNumber = input.nextFloat();
		
		if(firstNumber < secondNumber && firstNumber < thirdNumber){
			System.out.println("Smallest number is " + firstNumber);
		}
		else if(secondNumber < firstNumber && secondNumber < thirdNumber){
			System.out.println("Smallest number is " + secondNumber);
		}
		else{
			System.out.println("Smallest number is " + thirdNumber);
		}
		
	}
}