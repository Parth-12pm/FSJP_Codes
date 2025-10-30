import java.util.*;

abstract class num_op {
    abstract double Square(double num);

    abstract double SquareRoot(double num);

    abstract double Cube(double num);
}

class Calculator extends num_op {
    double num;

    double Square(double num) {
        return num * num;
    }

    double SquareRoot(double num) {
        return Math.sqrt(num);
    }

    double Cube(double num) {
        return num * num * num;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Calculator c = new Calculator();

        System.out.println("Enter a Number :");
        double num = sc.nextDouble();

        System.out.println("Square of Number :" + c.Square(num));
        System.out.println("Square Root of Number :" + c.SquareRoot(num));
        System.out.println("Cube of Number :" + c.Cube(num));

        sc.close();

    }
}