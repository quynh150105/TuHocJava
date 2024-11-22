package TX2_1;
import java.util.*;

public class CanBo {
	protected String name;
	protected int tuoi;
	protected String gioiTinh;
	protected String address;
	
	public CanBo(String name, int tuoi, String gioiTinh, String address) {
		this.name = name;
		this.tuoi = tuoi;
		this.gioiTinh = gioiTinh;
		this.address = address;
	}
	public CanBo() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Name: ");
		name = sc.nextLine();
		System.out.print("Age: ");
		tuoi = sc.nextInt();
		sc.nextLine();
		System.out.print("Gioi Tinh: ");
		gioiTinh = sc.nextLine();
		System.out.print("Dia Chi: ");
		address = sc.nextLine();
		
		
	}
	
	public void InTieuDe() {
		System.out.printf("%-15s %-15s %-15s %-15s","Ten","Tuoi","GioiTinh","DiaChi");
	}
	
	public void display() {
		System.out.printf("%-15s %-15d %-15s %-15s ",name, tuoi,gioiTinh, address);
	}

}
