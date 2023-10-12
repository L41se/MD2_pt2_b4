package RectangleClass;

import java.util.Scanner;

public class RectangleClass {
    public static void main(String[] args) {
        Scanner cm = new Scanner(System.in);
        System.out.println("Enter width: ");
        int width = cm.nextInt();
        System.out.println("Enter height: ");
        int height = cm.nextInt();

        Rectangle hcn = new Rectangle(width, height);
        System.out.println("Your rectangle: " + hcn.displayName());
        System.out.println("Your rectangle perimeter: " + hcn.getPerimeter());
        System.out.println("your rectangle area: " + hcn.getArea());
    }


}
