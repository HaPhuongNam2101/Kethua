package CircleCylinder;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Phương thức toString
    @Override
    public String toString() {
        return "Circle[Bán kinh: " + radius + ", Màu: " + color + "]";
    }
}
    class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1);
        System.out.println("Diện tích: " + c1.getArea());
        System.out.println("Chu vi: " + c1.getPerimeter());

        Circle c2 = new Circle(2.5, "blue");
        System.out.println(c2);
        System.out.println("Diện tích: " + c2.getArea());
        System.out.println("Chu vi: " + c2.getPerimeter());
    }
}

