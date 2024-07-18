package Point;

public class Point3D extends Point2D {
    private float z;

    public Point3D() {
        super();
        this.z = 0.0f;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{getX(), getY(), z};
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + z + ")";
    }
}
class Point3DTest {
    public static void main(String[] args) {
        Point3D point1 = new Point3D();
        System.out.println(point1);

        Point3D point2 = new Point3D(1.0f, 2.0f, 3.0f);
        System.out.println(point2);

        point2.setX(4.5f);
        point2.setY(5.5f);
        point2.setZ(6.5f);
        System.out.println(point2);

        point2.setXYZ(7.5f, 8.5f, 9.5f);
        System.out.println(point2);

        float[] coordinates = point2.getXYZ();
        System.out.println("(" + coordinates[0] + ", " + coordinates[1] + ", " + coordinates[2] + ")");
    }
}
