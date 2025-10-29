import java.util.*;

class Rectangle {
    double length, breadth;

    void setDim(double l, double b) {
        this.length = l;
        this.breadth = b;
    }

    double calculateArea() {
        return length * breadth;
    }

    double calculatePerimeter() {
        return 2 * (length + breadth);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Rectangle rect = new Rectangle();
        System.out.println("Enter Length : ");
        double length = sc.nextDouble();
        System.out.println("Enter Breadth : ");
        double breadth = sc.nextDouble();
        rect.setDim(length, breadth);

        System.out.println("Area of Rectangle : " + rect.calculateArea());
        System.out.println("Perimeter of Rectangle : " + rect.calculatePerimeter());

        sc.close();
    }
}