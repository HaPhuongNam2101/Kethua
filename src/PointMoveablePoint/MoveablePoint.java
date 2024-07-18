package PointMoveablePoint;

public class MoveablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this(0.0f, 0.0f, xSpeed, ySpeed);
    }

    public MoveablePoint() {
        this(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[] {xSpeed, ySpeed};
    }

    public MoveablePoint move() {
        float newX = super.getX() + xSpeed;
        float newY = super.getY() + ySpeed;
        super.setX(newX);
        super.setY(newY);
        return this;
    }
    @Override
    public String toString() {
        return "(" + super.getX() + ", " + super.getY() + "), Tốc độ:(" + xSpeed + ", " + ySpeed + ")";
    }
}
    class testMoveablePoint{
        public static void main(String[] args) {
            MoveablePoint moveablePoint1 = new MoveablePoint(1.0f, 2.0f, 0.5f, 1.0f);
            System.out.println(moveablePoint1);
            moveablePoint1.move();
            System.out.println(moveablePoint1);
        }
    }
