package QuadraticEquation;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = input.nextDouble();
        System.out.print("Enter b: ");
        double b = input.nextDouble();
        System.out.print("Enter c: ");
        double c = input.nextDouble();
        stuff bob = new stuff(a, b, c);
        System.out.println("Delta = " + bob.getDiscriminant(a,b,c));
        System.out.println(bob.checkDelta(a,b,c));
    }
}
