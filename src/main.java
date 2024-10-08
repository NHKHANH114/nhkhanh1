public class main {
    public static void main(String[] args) {
        circle c1 = new circle();
        System.out.println("The radius of c1 is: " + c1.getRadius() + ','+ c1.getArea());
        circle c2 = new circle(2.0);
        System.out.println("The radius of c2 is: " + c2.getRadius() + ','+ c2.getArea());
        circle c4 = new circle();
        c4.setRadius(5.5);
        System.out.println("radius is: " + c4.getRadius());
        c4.setColor("green");
        System.out.println("color is: " + c4.getColor());
        System.out.println(c4.getRadius());


    }
}
