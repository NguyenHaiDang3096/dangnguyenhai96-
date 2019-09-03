package lab_sumary;


	import java.util.Scanner;
	 
	public class CanBo {
	    private String hoTen;
	    private int namSinh;
	    private String gioiTinh;
	    protected String diaChi;
	    protected int choose;
	    Scanner scanner = new Scanner(System.in);
	    CanBo canBo;
	     
	    public CanBo() {
	        super();
	    }
	 
	    public CanBo(String hoTen, String diaChi, String gioiTinh, int namSinh) {
	        super();
	        this.hoTen = hoTen;
	        this.diaChi= diaChi;
	        this.gioiTinh= gioiTinh;
	        this.namSinh= namSinh;
	    }

		public String getHoTen() {
			return hoTen;
		}

		public void setHoTen(String hoTen) {
			this.hoTen = hoTen;
		}

		public int getNamSinh() {
			return namSinh;
		}

		public void setNamSinh(int namSinh) {
			this.namSinh = namSinh;
		}

		public String getGioiTinh() {
			return gioiTinh;
		}

		public void setGioiTinh(String gioiTinh) {
			this.gioiTinh = gioiTinh;
		}

		public String getDiaChi() {
			return diaChi;
		}

		public void setDiaChi(String diaChi) {
			this.diaChi = diaChi;
		}

		public Scanner getScanner() {
			return scanner;
		}

		public void setScanner(Scanner scanner) {
			this.scanner = scanner;
		}

		public CanBo getCanBo() {
			return canBo;
		}

		public void setCanBo(CanBo canBo) {
			this.canBo = canBo;
		}
		public void nhap() {
			System.out.print("Nhập họ tên: ");
	        hoTen = scanner.nextLine();
	    	System.out.print("Nhập họ địa chỉ: ");
	        diaChi = scanner.nextLine();
	        
	        System.out.print("Nhập tuổi: ");
	        namSinh = scanner.nextInt();
	        System.out.print("Giới Tính: ");
	        gioiTinh = scanner.next();
		}
		@Override
		public String toString() {
	        return "Tên: " + this.hoTen + ", diachi: " + this.diaChi + ", Giới Tính: " + this.gioiTinh +	", Năm sinh: " + this.namSinh;
	    }
	  
	}

