package shapes;

abstract class Quadrilateral extends shape implements Measurable {
    protected double length;
    protected double width;

    public Quadrilateral(double length, double width){
        this.length = length;
        this.width = width;
    }
}
