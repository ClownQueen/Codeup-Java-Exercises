package shapes;

import util.*;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();

        while(true){
            doACircle(input);

            boolean moreCircles = input.yesNo("More Circles? (y/n)");
            if (!moreCircles){
                break;
            }
        }
    }

    private static void doACircle(Input input) {
        double radius = input.getDouble("Enter circle Radius: ");
        Circle circle = new Circle(radius);

        System.out.printf("Area of the circle with radius %f is %f\n", radius, circle.getCircumference());
    }
}


