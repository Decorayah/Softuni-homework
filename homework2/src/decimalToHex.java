import java.util.Scanner;


public class decimalToHex {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Integer num = input.nextInt();
		String hexNum = Integer.toHexString(num);
		System.out.println(hexNum);
	}

}
