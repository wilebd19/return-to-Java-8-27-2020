import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //1
        double inch;
        double meter;

        System.out.print("Enter inch(s): ");
        inch = input.nextDouble();

        meter = (inch * 0.0254);
        System.out.println(meter + " meter(s)\n");

        //2
        double[] numbers = new double[5];
        double average;
        double total = 0;
        
        for (int i = 0; i <= 4; i++){
            System.out.print("Enter a number: ");
            numbers[i] = input.nextDouble();
        }
        
        for (int i = 0; i <= 4; i++){
            total = total + numbers[i];
        }

        average = total/5;
        
        System.out.println("Average: " + average + "\nSum: " + total + "\n");

        //3
        System.out.print("How many integers do you want? ");
        int arrayInt = input.nextInt();
        int totalInt = 0;

        int[] array = new int[arrayInt];

        for (int i = 0; i < arrayInt; i++){
            System.out.print("Enter Number: ");
            array[i] = input.nextInt();
        }

        for (int i = 0; i < arrayInt; i++){
            totalInt = totalInt + array[i];
        }

        System.out.println("Sum: " + totalInt + "\n");

        //4
        //Question Doesn't Make Sense.

        //5
        Circle circle = new Circle();
        System.out.print("Enter Circle Radius: ");
        circle.setRadius(input.nextDouble());

        System.out.print("Enter the x center point: ");
        circle.setCenterPoint(input.nextDouble(), 0);

        System.out.print("Enter the y center point: ");
        circle.setCenterPoint(input.nextDouble(), 1);

        computeArea(circle);
    }

    //5
    public static void computeArea(Circle circle){
        double circleArea = (3.14)*(Math.pow(circle.getRadius(),2));
        System.out.println("Circle Area: " + circleArea);

    }
}
