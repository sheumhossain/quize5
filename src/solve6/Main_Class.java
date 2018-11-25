package solve6;
import java.lang.Math; 

import java.util.Scanner;

public class Main_Class {
	public static void main(String args[]) {
		int[] speed = {1,10,20,40};
		double mass;
		int r = 3;
		int i=0;
		double T = 0;
		Scanner in = new Scanner(System.in);
		while(i<4) {
			int v = speed[i]*speed[i];
			double m = in.nextInt();
			 T = (m*v)/r;
			//T = tension(m,v);
			if(T>=60) {
				break;
			}
			i++;
		}
		System.out.println(speed[i-1]);
	}
	/*tension(int m,int v){
		T=
	}*/
}