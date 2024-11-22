package TX2_1;
import java.util.*;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	static ArrayList<CanBo> ds = new ArrayList<CanBo>();	
	static int n;
	
	static public void ThemCanBo() {
		
		while(true) {
			System.out.print("Nhap so can bo muon them: ");
			try {
				n = sc.nextInt();
				if (n <= 0) {
					throw new Exception("So can bo phai > 0!");
				}
				break;
			}
			catch(Exception e) {
				System.out.println("Khong hop le! Nhap lai: ");
				sc.nextLine();
			}
			
		}
		
		int choice;
		
		while(true) {
			System.out.println("1, Them Nhan Vien! ");
			System.out.println("2, Them Cong Nhan!");
			System.out.println("3, Them Ky Su!");
			System.out.println("Lua chon cua ban la: ");
			try {
				choice = sc.nextInt();
				if(choice <1 || choice > 3)
					throw new Exception("Chon 1 hoac 2 hoac 3!");
				break;
			}
			catch(Exception e) {
				System.out.println("Khong hop le! Nhap lai: ");
				sc.nextLine();
			}
			
		}
		
		switch (choice) {
		case 1: 
			for(int i = 0; i< n; i++) {
				CanBo cb = new NhanVien();
				System.out.println("Nhap nhan vien: ");
				cb.nhap();
				ds.add(cb);
			}
			break;
		case 2: 
			for(int i = 0; i< n; i++) {
				CanBo cb = new CongNhan();
				System.out.println("Nhap Cong Nhan: ");
				cb.nhap();
				ds.add(cb);
			}
			break;
		case 3:
			for(int i = 0; i< n; i++) {
				CanBo cb = new KySu();
				System.out.println("Nhap ky su: ");
				cb.nhap();
				ds.add(cb);
			}
			break;
		default:
			break;
		}
		
	}
	
	static public void SearchByName() {
		System.out.print("Nhap ten can bo can tim: ");
		String name = sc.nextLine();
		boolean check = false;
		
		for(CanBo i : ds) {
			if(i.getName().equals(name)) {
				i.display();
				check = true;
			}
		}
		if (!check) {
			System.out.println("Khong tim thay!");
		}
		
	}
	
	
	static public void InDanhSach() {
		for(CanBo i : ds) {
			i.display();
		}
	}
	
	static public void Menu() {
		while(true) {
			System.out.println("1, Them can bo!");
			System.out.println("2, Tim kiem theo ho ten!");
			System.out.println("3, Hien thi thong tin danh sach cac can bo!");
			System.out.println("4, Exit");
			System.out.print("Lua chon cua ban: ");
			int choice = sc.nextInt();	
			sc.nextLine();
			
			switch(choice) {
			case 1: 
				ThemCanBo();
				break;
			
			case 2: 
				SearchByName();
				break;
				
			case 3:
				InDanhSach();
				break;
			case 4:
				System.exit(0);
				sc.close();
				break;
			default:
				System.exit(0);				
			}
		}
	}
	
	
	public static void main(String[] args) {
		Menu();
		sc.close();
	}

}
