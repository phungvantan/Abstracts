package tan.dev;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class MainApp {
	public static void input(Shape[] shapes) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3 ; i++) {
			System.out.println("Nhap ban kinh hinh tron: ");
			double banKinh = sc.nextDouble();
			Shape circle = new Circle(banKinh);
			shapes[i] = circle;
		}
		for (int i = 3; i < 6 ; i++) {
			System.out.println("Nhap chieu dai, chieu rong hinh chu nhat");
			double chieuDai = sc.nextDouble();
			double chieuRong =sc.nextDouble();
			Shape rectangle = new Rectangle(chieuDai, chieuRong);
			shapes[i] = rectangle;
		}
		for (int i = 6; i < 10; i++) {
			System.out.println("Nhap do dai ba canh cua tam giac: ");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			double z = sc.nextDouble();
			Shape triangle = new Triangle(x, y, z);
			shapes[i] = triangle;
		}
		
	}
	public static void print(Shape[] shapes) {
		for (int i = 0; i < shapes.length; i++) {
			System.out.println(shapes[i].toString());
		}
	}
	public static void findDienTich(Shape[] shapes) {
		Shape preMax = shapes[0];
		for (int i = 0; i < shapes.length; i++) {
			if (preMax.dienTich() < shapes[i].dienTich()) {
				preMax = shapes[i];
			}
		}
		System.out.println("Hinh co Dien Tich lon nhat la:" + preMax.toString());
		System.out.println("Dien tich lon nhat la: "+preMax.dienTich());
	}
	public static void findMoiLoai(Shape[] shapes) {
		Shape prehinhTron = shapes[0];
		Shape preHCN = shapes[0];
		Shape preHTG = shapes[0];
		for (int i = 0; i < 3; i++) {
			if (prehinhTron.dienTich() < shapes[i].dienTich()) {
				prehinhTron = shapes[i];
			}
		}
		System.out.println("Hinh tron lon nhat la: " + prehinhTron.dienTich());
		for (int i = 3; i < 6 ; i++) {
			if (preHCN.dienTich() < shapes[i].dienTich() ) {
				preHCN = shapes[i];
			}
			
		}
		System.out.println("Hinh chu nhat lon nhat la: " + preHCN.dienTich() );
		for (int i = 6; i < 10; i++) {
			if (preHTG.dienTich() < shapes[i].dienTich() ){
				preHTG = shapes[i];
				
			}
			
		}
		System.out.println("Dien tich hinh tam giac lon nhat la: " + preHTG.dienTich() );
	}
	
	public static void main(String[] args) {	
		// TODO Auto-generated method stub
		Shape[] shapes = new Shape[10];
		input(shapes);
		print(shapes);
		findDienTich(shapes);
		findMoiLoai(shapes);
		
	}

}
