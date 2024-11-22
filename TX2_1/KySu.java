package TX2_1;
import java.util.*;
public class KySu extends CanBo {
	private String nganhDaoTao;
	
	public void setNganhDaoTao(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}
	
	public String getNganhDaoTao() {
		return nganhDaoTao;
	}
	
	public KySu() {
		
	}

	public KySu(String name, int tuoi, String gioiTinh, String address, String nganhDaoTao) {
		super(name, tuoi, gioiTinh, address);
		this.nganhDaoTao = nganhDaoTao;
	}

	@Override 
	public void display() {
		super.display();
		System.out.printf("%-15s \n", nganhDaoTao);
	}
	
	@Override
	public void InTieuDe() {
		super.InTieuDe();
		System.out.printf("%-15s \n","NganhDaoTao");
	}
	
	@Override
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.print("Nganh dao tao: ");
		nganhDaoTao = sc.nextLine();
	}
	
	
}
