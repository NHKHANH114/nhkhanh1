public class circle {

    private double radius;
    private String color;

    public circle() {
        radius = 1.0;
        color = "red";
    }

    public circle(double r) {
        radius = r;
        color = "red";
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius*radius*Math.PI;
    }
        public void setRadius(double newRadius) {
            radius = newRadius;
        }
        public void setColor(String newColor){}
    public String getColor() {return color;}

}
