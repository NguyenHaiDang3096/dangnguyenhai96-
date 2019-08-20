package lab3;

public abstract class Rectangle extends Shape {
	 public String color;
	    public double length;
	    public double width;
	    public double area;
	    public Rectangle ( String color) {
	    	super(color);
	    	}
	    public String toString() {//Ghi đè phương thức toString()
	        return color ;
	    }
	    public double getArea(double area) {
	    	this.area= area;
	    	return area= length*width;
		
	    }
}
