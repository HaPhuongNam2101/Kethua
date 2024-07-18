package CircleCylinder;

public class Cylinder extends Circle {
    private double height;
    public Cylinder() {
        super();
        this.height = 1.0;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return getArea() * height;
    }
    @Override
    public String toString() {
        return "Cylinder[" + super.toString() + ", Chiều cao: " + height + "]";
    }
}
    class TestCylinder {
    public static void main(String[] args) {
        Cylinder cy1 = new Cylinder();
        System.out.println(cy1);
        System.out.println("Thể tích: " + cy1.getVolume());
        Cylinder cy2 = new Cylinder(2.5, "blue", 4.0);
        System.out.println(cy2);
        System.out.println("Thể tích: " + cy2.getVolume());
    }
}

