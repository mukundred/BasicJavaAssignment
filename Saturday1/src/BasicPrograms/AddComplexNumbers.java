package BasicPrograms;

import java.util.Scanner;

public class AddComplexNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter real part of first number: ");
        int real1 = sc.nextInt();

        System.out.print("Enter imaginary part of first number: ");
        int imag1 = sc.nextInt();

        System.out.print("Enter real part of second number: ");
        int real2 = sc.nextInt();

        System.out.print("Enter imaginary part of second number: ");
        int imag2 = sc.nextInt();

        int real = real1 + real2;
        int imag = imag1 + imag2;

        System.out.println("Sum = " + real + " + " + imag + "i");

        sc.close();
    }
}