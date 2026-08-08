package BasicPrograms;

import java.util.Scanner;

public class AddBinaryStrings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first binary number: ");
        String binary1 = sc.nextLine();

        System.out.print("Enter second binary number: ");
        String binary2 = sc.nextLine();

        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);

        int sum = num1 + num2;

        String result = Integer.toBinaryString(sum);

        System.out.println("Sum = " + result);

        sc.close();
    }
}