package PointMoveablePoint;

public class Point {
    private float x;
    private float y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(0.0f, 0.0f);
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
        return new float[] {x, y};
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
 class testPoint{
     public static void main(String[] args) {
         Point point1 = new Point(2.5f, 3.0f);
         System.out.println(point1);
         point1.setXY(4.0f, 5.5f);
         System.out.println(point1);
     }
 }
