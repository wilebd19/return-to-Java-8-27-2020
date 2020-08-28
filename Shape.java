import java.util.Scanner;

public class Shape {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Circle circle = new Circle();

        double circleArea = 0;

        System.out.print("Enter the circle radius: ");
        circle.setRadius(input.nextDouble());

        for (int i = 0; i <= 1; i++){
            if(i == 0){
                System.out.print("Enter the Circle center point X coordinate value: ");
            } else {
                System.out.print("Enter the Circle center point Y coordinate value: ");
            }
            circle.setCenterPoint(input.nextDouble(), i);
        }

        circleArea = (3.14)*(Math.pow(circle.getRadius(), 2));

        System.out.println("Circle Area is " + circleArea + " and the center point is (" + circle.getCenterPoint(0) +
                "," + circle.getCenterPoint(1) + ")");

    }
}
