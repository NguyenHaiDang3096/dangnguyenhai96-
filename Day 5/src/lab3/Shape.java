package lab3;

public abstract class Shape {
   public String color;
   
    Shape ( String color) {
    	this.color= color;
    	    
    }
 
    public String toString() {//Ghi đè phương thức toString()
        return color ;
    }
    public abstract float getArea();
    
}
