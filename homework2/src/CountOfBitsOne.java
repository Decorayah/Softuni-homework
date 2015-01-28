import java.util.Scanner;


public class CountOfBitsOne {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int v = input.nextInt();
		v = v - ((v>>1) & 0x55555555);
		v = (v & 0x33333333) + ((v>>2) & 0x33333333);
		int count = ((v + (v>>4) & 0xF0F0F0F) * 0x1010101) >> 24;
		System.out.println(count);
	}

}
