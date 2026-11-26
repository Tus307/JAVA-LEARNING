package tusus;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner tu = new Scanner(System.in);
		 Phanso p = new Phanso();
		 Phanso p1 = new Phanso();
		 Phanso p2 = new Phanso();
		 
		 p1.nhap(tu);
		 p1.xuat();
		 
		 p2.nhap(tu);
		 p2.xuat();
		 
		 p.tong(p1.Gettuso(), p2.Gettuso(), p1.Getmauso(), p2.Getmauso());
		 p.hieu(p1.Gettuso(), p2.Gettuso(), p1.Getmauso(), p2.Getmauso());
		 p.tich(p1.Gettuso(), p2.Gettuso(), p1.Getmauso(), p2.Getmauso());
		 p.thuong(p1.Gettuso(), p2.Gettuso(), p1.Getmauso(), p2.Getmauso());
	}
}
