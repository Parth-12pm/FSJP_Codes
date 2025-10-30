import java.util.*;

class Triangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.println("Enter 1st Side :");
        a = sc.nextDouble();
        System.out.println("Enter 2nd Side :");
        b = sc.nextDouble();
        System.out.println("Enter 3rd Side :");
        c = sc.nextDouble();

        if (a + b > c && b + c > a && a + c > b) {
            System.out.println("A Triangle Can be Formed !");
            if (a == b && b == c) {
                System.out.println("The Triangle is Equilateral");
            } else if (a == b || b == c || a == c) {
                System.out.println("The Triangle is Isosceles");
            } else {
                System.out.println("The Triangle is Scelene");
            }
            double s = (a + b + c) / 2;
            double Area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.println("The Area of Triangle : " + Area);
        } else {
            System.out.println("A Triangle Cannot be Formed !");
        }
        sc.close();
    }
}