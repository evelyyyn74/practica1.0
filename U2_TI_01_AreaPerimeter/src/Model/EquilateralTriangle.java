package Model;

public class EquilateralTriangle extends FigureAbs{

    private double side;
    private double height;
    private double base;
    
    
    public void setSide(double side) {
        this.side = side;
    }
    public EquilateralTriangle(double side, double height, double base) {
        this.side = side;
        this.height = height;
        this.base = base;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double getArea(){
        return (base * height) / 2;
    }
    @Override
    public double getPerimeter(){
        return 3 * side;
    }


}
