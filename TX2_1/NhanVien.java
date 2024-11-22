package TX2_1;
import java.util.*;
public class NhanVien extends CanBo {
	
	private String congViec;
	
	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}
	
	public String getCongViec() {
		return congViec;
	}
	
	public NhanVien() {
		
	}

	public NhanVien(String name, int tuoi, String gioiTinh, String address, String congViec) {
		super(name, tuoi, gioiTinh, address);
		this.congViec = congViec;
	}
	
	@Override
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.print("Cong Viec: ");
		congViec = sc.nextLine();
	}
	
	@Override
	public void InTieuDe() {
		super.InTieuDe();
		System.out.printf("%-15s \n","Cong Viec");
	}
	
	@Override
	public void display() {
		super.display();
		System.out.printf("%-15s \n", congViec);
	}
	

}
