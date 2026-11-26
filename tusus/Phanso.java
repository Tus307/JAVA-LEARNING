package tusus;

import java.util.Scanner;

public class Phanso {

	private int tuso;
	private int mauso;
	
	public Phanso () {
		tuso = 0;
		mauso = 1;
	}
	
	public Phanso(int tuso, int mauso) {
		this.mauso = mauso;
		this.tuso = tuso;
	}
	
	public int Gettuso () {
		return tuso;
	}
	
	public void Settuso(int tuso) {
		this.tuso = tuso;
	}
	
	public int Getmauso() {
		return mauso;
	}
	
	public void Setmauso(int mauso) {
		this.mauso = mauso;
	}
	
	public void nhap (Scanner tu) {
		System.out.println("Nhap tu so = ");
		tuso = tu.nextInt();
		
		System.out.println ("Nhap mau so = ");
		mauso = tu.nextInt();
	}
	
	
	public void xuat () {
		System.out.println("Phan so vua nhap la: " + tuso + "/" + mauso);
	}
	
	public int ucln(int a, int b)
	{
		int r = 0;
		
		while (b!= 0) {
			r = a % b;
			a = b;
			b = r;
		}
		return Math.abs(a);
	}
	
	public void rutgon (int a, int b) {
		 int u = ucln(a,b);
		 int tu = 0, mau = 1;
		  tu = a / u;
		  mau = b / u;
		 
		System.out.println(tu + "/" + mau);
	}
	
	public void tong(int tu1, int tu2, int mau1, int mau2) {
		int tu = 0, mau = 1;
		if(mau1 == mau2) {
			tu = tu1 + tu2;
			mau = mau1;
		}
		else {
			tu = tu1 * mau2 + tu2 * mau1;
			mau = mau1 * mau2;
		}
		
		System.out.print("Tong 2 phan so = ");
		rutgon(tu, mau);
	}
	
	public void hieu(int tu1, int tu2, int mau1, int mau2) {
	    int tu = (mau1 == mau2) ? (tu1 - tu2) : (tu1 * mau2 - tu2 * mau1);
	    int mau = (mau1 == mau2) ? mau1 : (mau1 * mau2);
	    
	    System.out.print("Hieu 2 phan so = ");
	    rutgon(tu, mau);
	}

	public void tich(int tu1, int tu2, int mau1, int mau2) {
	    System.out.print("Tich 2 phan so = ");
	    rutgon(tu1 * tu2, mau1 * mau2);
	}

	public void thuong(int tu1, int tu2, int mau1, int mau2) {
	    if (tu2 == 0) {
	        System.out.println("Khong the chia cho 0!");
	        return;
	    }
	    System.out.print("Thuong 2 phan so = ");
	    rutgon(tu1 * mau2, tu2 * mau1);
	}

}
