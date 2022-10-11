package taksimetreHesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double kilometre;
		System.out.print("Gidilen Kilometreyi Giriniz: ");
		kilometre=input.nextDouble();
		double hesap;
		hesap=10+(2.20*kilometre);
		System.out.println("Tutar: "+(hesap<20?20:hesap));
	}

}
