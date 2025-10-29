import java.util.*;

class shapes {
    double length, breadth, radius, base, height;

    double CalculateArea(double l, double b) {
        return l * b;
    }

    double CalculateArea(double r) {
        return 3.14 * r * r;
    }

    double CalculateArea(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        shapes s = new shapes();

        System.out.println("----Rectangle----");
        System.out.println("Enter Length : ");
        double length = sc.nextDouble();
        System.out.println("Enter Breadth : ");
        double breadth = sc.nextDouble();
        System.out.println("Area of Rectangle : " + s.CalculateArea(length, breadth));
        System.out.println("----Circle----");
        System.out.println("Enter Radius : ");
        double radius = sc.nextDouble();
        System.out.println("Area of Circle : " + s.CalculateArea(radius));

        System.out.println("----Triangle----");
        System.out.println("Enter Base : ");
        double base = sc.nextDouble();
        System.out.println("Enter Height : ");
        double height = sc.nextDouble();
        System.out.println("Area of Triangle : " + s.CalculateArea(base, height, true));

        sc.close();
    }
}