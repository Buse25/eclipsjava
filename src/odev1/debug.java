package odev1;

import java.util.Scanner;

public class debug{
		public static void main(String[] args ) {
				int sayi =(int) (Math.random()*100);
				Scanner scan =new Scanner(System.in);
				int a=1;
		
			while(a==1) {
			System.out.println("enter number ");
			int giris=scan.nextInt();
			if(giris==sayi) {
				System.out.println("congratulationss!!!");
				a=0;
			}
			if(giris>sayi)
				System.out.println("Big number ---!!!");
			if(giris<sayi)
				System.out.println("Small number +++!!!");
			
		}
			
		}
	}
	


