public class Circle {
    private double radius;
    private double[] centerPoint = new double[2];

    public Circle(){
        radius = 0;
        for (int i = 0; i <= 1; i++){
            centerPoint[i] = 0;
        }
    }

    public void setCenterPoint(double centerPoint, int i) {
        this.centerPoint[i] = centerPoint;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCenterPoint(int i) {
        return centerPoint[i];
    }

    public double getRadius() {
        return radius;
    }
}
