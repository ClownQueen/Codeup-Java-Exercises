package shapes;

public class Square extends Rectangle {

    public Square(double length, double width){
        super(length, width);
    }

    public Square(double side) {
        super(side, side);
        System.out.println("In the square constructor:");
    }

    @Override
    public double getArea(){
        return this.length * this.width;
    }

    public double getPerimeter(){
        return 4 * this.length;
    }
}
