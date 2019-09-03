package lab_sumary;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	
    public static void main(String[] args) {
	 ArrayList<CanBo> arrCanBo = new ArrayList<>();
     int choose, soCanBo;
     CanBo canBo = null;
   
     Scanner scanner = new Scanner(System.in);
      
     System.out.print("Nhập số lượng cán bộ trong CongTy: ");
     soCanBo = scanner.nextInt();
     for (int i = 0; i < soCanBo; i++) {
    	 
         System.out.println("Nhập thông tin cán bộ thứ " + (i + 1) + ":");
         System.out.print("Nhập thông tin cán bộ trong CongTy: ");
         do {
             System.out.print("Chọn loại cán bộ ");
             System.out.print("1. Công Nhan ");
             System.out.print("2. Kỹ Sư ");
             System.out.print("3. Nhân Viên ");
             choose = scanner.nextInt();
             switch (choose) {
                 case 1:
                     canBo =   new CongNhan();
                     canBo.nhap();
                     arrCanBo.add(canBo);
                     break;
                 case 2:
                     canBo = new KySu();
                     canBo.nhap();
                     arrCanBo.add(canBo);
                     break;
                 case 3:
                	  canBo = new NhanVien();
                      canBo.nhap();
                      arrCanBo.add(canBo);
                      break;
                 default:
                     System.out.println("Chọn không hợp lệ.");
                     break;
                 }
         } while (choose < 1 || choose > 4);
     }
      
     System.out.println("Hiển thị danh sách cán cán bộ trong Công Ty: ");
     for (CanBo cb : arrCanBo) {
         System.out.println(cb.toString());
     }
    }
}
  
    




