package lab_sumary;

public class CongNhan extends CanBo {
    private double Bac;
    public CongNhan() {
        super();
    }
 public CongNhan (double Bac) {
	 super();
	this.Bac=Bac;
	 
 }


public double getBac() {
	return Bac;
}
public void setBac(double bac) {
	Bac = bac;
}
@Override
public void nhap() {
	super.nhap();
	System.out.print("Nhập vào Bậc Công Nhân");
	Bac = scanner.nextDouble();
}
@Override
public String toString() {
    return super.toString() + ", Bậc công Nhân: " + this.Bac;
}
}
