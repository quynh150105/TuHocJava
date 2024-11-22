package TX2_1;
import java.util.*;
public class CongNhan extends CanBo{
	private int Bac;

	public int getBac() {
		return Bac;
	}

	public void setBac(int bac) {
		Bac = bac;
	}

	public CongNhan(String name, int tuoi, String gioiTinh, String address, int bac) {
		super(name, tuoi, gioiTinh, address);
		Bac = bac;
	}

	public CongNhan() {
//		super(name, tuoi, gioiTinh, address);
	}

	@Override
	public void display() {
		super.display();
		System.out.printf("%-15d \n", Bac);
	}
	
	@Override
	public void InTieuDe() {
		super.InTieuDe();
		System.out.printf("%-15s \n","Bac");
	}
	
	@Override
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.print("Bac: ");
		Bac = sc.nextInt();
		sc.nextLine();
	}
	
	
	

}
