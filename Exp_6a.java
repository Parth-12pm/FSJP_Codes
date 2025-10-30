import java.util.*;

class Shape {
    double pi = 3.14;
}

class Circle extends Shape {
    double radius;
    void setRadius(double r) {
        radius = r;
    }
}

class Sphere extends Circle {
    double VolumeOfSphere() {
        return (4.0 / 3.0) * pi * radius * radius * radius;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Sphere s = new Sphere();
        System.out.println("Enter the Radius : ");
        double radius = sc.nextDouble();
        s.setRadius(radius);
        System.out.println("The Volume of Sphere is : " + s.VolumeOfSphere());

        sc.close();
    }
}