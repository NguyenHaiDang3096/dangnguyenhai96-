package lab3;

public  abstract class Triangle extends Shape {
    public String color;
    public double height;
    public double base;
    public double area;
    public Triangle ( String color) {
    	super(color);
    	}
    public String toString() {//Ghi đè phương thức toString()
        return color ;
    }
    public double getArea(double area) {
    	this.area= area;
    	return area= 0.5*base*height;
	
    }
}

