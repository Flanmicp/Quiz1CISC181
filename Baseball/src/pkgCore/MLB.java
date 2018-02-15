package pkgCore;

import java.util.Scanner;

public class MLB {
	
	private int H;
	private int AB;
	private int SF;
	private int HBP;
	private int BB;
	private int Dble;
	private int Trpl;
	private int HR;
	private int R;
	
	public MLB() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Hits:");//prompt
		H = input.nextInt();//reads hits from the user
		
		System.out.print("Enter at Bats:"); //prompt
		AB = input.nextInt();// reads the at bats from the user
		
		System.out.print("Enter Sacrifice flies:"); 
		SF = input.nextInt();
		
		System.out.print("Enter Hit by pitch:");
		HBP = input.nextInt();
	
		System.out.print("Enter Walks:");
		BB = input.nextInt();
		
		System.out.print("Enter Doubles:");
		Dble = input.nextInt();
		
		System.out.print("Enter Triples:");
		Trpl = input.nextInt();
		
		System.out.print("Enter Home Runs:"); 
		HR = input.nextInt();
		
		System.out.print("Enter Runs:");
		R = input.nextInt();
		
		System.out.printf("OBP: %f%n", OBP());//Prints calculations
		System.out.printf("SLG: %f%n", SLG());
		System.out.printf("BA: %f%n", BA());
		System.out.printf("OBS: %f%n", OBS());
		System.out.printf("TB: %f%n", TB());
		
	}

	public double OBP() {
		return ((double)H+(double)BB+(double)HBP)/((double)AB+(double)BB+(double)SF+(double)HBP);//Calculates the OBP with the numbers given from the user 
	} 
			
	public double BA() {
		return (double)H/(double)AB;//this casts the integers in L:18 and 21 as doubles
	}
	
	public double SLG() {
		return (double)TB() /(double)AB;
	}
			
	public double OBS() {
		return (double)OBP() + (double)SLG();
	}
	
	public double TB() {
		return 1*((double)H-(double)Dble-(double)Trpl-(double)HR)+ 2 *(double)Dble + 3 *(double)Trpl + 4 *(double)HR;
	}
	
	
	public int getH() {
		return H;
	}

	public void setH(int h) {
		H = h;
	}

	public int getAB() {
		return AB;
	}

	public void setAB(int aB) {
		AB = aB;
	}

	public int getHBP() {
		return HBP;
	}

	public void setHBP(int hBP) {
		HBP = hBP;
	}

	public int getBB() {
		return BB;
	}

	public void setBB(int bB) {
		BB = bB;
	}

	public int getDble() {
		return Dble;
	}

	public void setDble(int dble) {
		Dble = dble;
	}

	public int getTrpl() {
		return Trpl;
	}

	public void setTrpl(int trpl) {
		Trpl = trpl;
	}

	public int getHR() {
		return HR;
	}

	public void setHR(int hR) {
		HR = hR;
	}

	public int getR() {
		return R;
	}

	public void setR(int r) {
		R = r;
	}
	
	public int getSF() {
		return SF;
	}

	public void setSF(int sF) {
		SF = sF;
	}



}
