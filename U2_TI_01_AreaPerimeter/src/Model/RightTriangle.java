package Model;

public class RightTriangle  extends FigureAbs {
    private double base;
    private double height;
    private double hypotenuse;

    
    public double getBase() {
        return base;
    }
    public RightTriangle(double base, double height, double hypotenuse) {
        this.base = base;
        this.height = height;
        this.hypotenuse = hypotenuse;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getHypotenuse() {
        return hypotenuse;
    }
    public void setHypotenuse(double hypotenuse) {
        this.hypotenuse = hypotenuse;
    }
    @Override
    public double getArea(){
        return (base * height) / 2;
    }
    @Override
    public double getPerimeter(){
        return base + height + hypotenuse;
    }



    
}
