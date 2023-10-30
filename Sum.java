package proekt_7;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		int a,b,c,d,e;
		int sumpa=0,sumnep=0;
		Scanner tastatura= new Scanner(System.in);
		System.out.println("Vnesete go prviot broj");
		a=tastatura.nextInt();
		System.out.println ("Vnesete go vtoriot broj");
		b=tastatura.nextInt();
		System.out.println ("Vnesete go tretiot broj");
		c=tastatura.nextInt();
		System.out.println ("Vnesete go cetvrtiot broj");
		d=tastatura.nextInt();
		System.out.println ("Vnesete go petiot broj");
		e=tastatura.nextInt();
		if(a%2==0) {
		sumpa=sumpa+a;
		}else {
			sumnep=sumnep+a;
			}
		if(b%2==0) {
			sumpa=sumpa+b;
			}else {
				sumnep=sumnep+b;
				}
		if(c%2==0) {
			sumpa=sumpa+c;
			}else {
				sumnep=sumnep+c;
				}
		if(d%2==0) {
			sumpa=sumpa+d;
			}else {
				sumnep=sumnep+d;
				}
		if(e%2==0) {
			sumpa=sumpa+e;
			}else {
				sumnep=sumnep+e;
				}
		System.out.println ("Sumata na parnite broevi iznesuva="+sumpa);
		System.out.println ("Sumata na neparnite broevi iznesuva="+sumnep);
		
		
		}
		
		
				

		

	}


