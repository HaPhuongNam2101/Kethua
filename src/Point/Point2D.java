package Point;

public class Point2D {
    private float x;
    private float y;

    public Point2D() {
        this.x = 0.0f;
        this.y = 0.0f;
    }
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        return new float[]{x, y};
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

class Point2DTest {
    public static void main(String[] args) {
        Point2D point1 = new Point2D();
        System.out.println(point1);

        Point2D point2 = new Point2D(3.0f, 4.0f);
        System.out.println(point2);

        point2.setX(5.0f);
        point2.setY(6.0f);
        System.out.println(point2);

        point2.setXY(7.0f, 8.0f);
        System.out.println(point2);

        float[] coordinates = point2.getXY();
        System.out.println("(" + coordinates[0] + ", " + coordinates[1] + ")");
    }
}

