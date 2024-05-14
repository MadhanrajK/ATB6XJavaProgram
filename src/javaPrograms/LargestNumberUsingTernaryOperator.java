package javaPrograms;


import java.util.Scanner;

public class LargestNumberUsingTernaryOperator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();
        System.out.println("Enter the second number:");
        int num3 = sc.nextInt();
        int A = (num1>num3)?num1:num3;
        int B = (num2>num3)?num2:num3;
        int largest = (num1>num2)?A:B;
        System.out.println("Largest between three numbers:"+largest);
        sc.close();
    }


}
