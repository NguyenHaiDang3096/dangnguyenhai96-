package lab_sumary;

public class KySu extends CanBo {
    private static String NganhDaotao;
    public KySu() {
        super();
    }
 public KySu (String NganhDaoTao) {
	 super();
	this.NganhDaotao= NganhDaoTao;
	
	 
 }

public String getNganhDaotao() {
	return NganhDaotao;
}
public void setNganhDaotao(String nganhDaotao) {
	NganhDaotao = nganhDaotao;
}
@Override
public void nhap() {
	super.nhap();
	System.out.print("Nhập vào Ngành đào tạo");
	NganhDaotao = scanner.nextLine();
}
@Override
public String toString() {
    return super.toString() + ", Nhành Đào tạo : " + this.NganhDaotao;
}

}
