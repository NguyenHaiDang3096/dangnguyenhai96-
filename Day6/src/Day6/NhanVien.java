package lab_sumary;

public class NhanVien extends CanBo {
    private String CongViec;
    public NhanVien() {
        super();
    }
 public NhanVien(String CongViec) {
	 super();
	 this.CongViec= CongViec;
	
	 
 }

public String getCongViec() {
	return CongViec;
}
public void setCongViec(String congViec) {
	CongViec = congViec;
}
@Override
public void nhap() {
	super.nhap();
	System.out.print("Nhập vào Công Việc");
	CongViec = scanner.nextLine();
}
@Override
public String toString() {
    return super.toString() + ", Bậc công Nhân: " + this.CongViec;
}
}
