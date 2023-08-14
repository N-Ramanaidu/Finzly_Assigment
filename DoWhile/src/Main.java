
public class Main {
	

	public static void main(String[] args) {
	
		System.out.println("---------------------------------------");
		System.out.println("Programs on Do While ....!!!!!");
		System.out.println("---------------------------------------");
		//	1) Write a Program To print 1 to 25 nos.	
		
		System.out.println("1. Print number from 1 to 25 : ");
		int i = 1;
		do {
			System.out.print(i+" ");
			i++;
		}while(i<=25);
		
		System.out.println();
		// 2) Write a Program To print 25 to 1 nos.
		
		System.out.println("2. Print 1 to 25 nos :");
		int j = 25;
		do {
			System.out.print(j+" ");
			j--;
		}while(j>0);
		System.out.println();
		// 3) Write a Program To print 1 to 100 Odd nos.
		
		System.out.println("3. Print 1 to 100 Odd nos :");
		int k = 1;
		do {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
			k++;
		}while(k<100);
		
		System.out.println();
		// 4) Write a Program To print 1 to 100 even nos.

		System.out.println("4. Print 1 to 100 even nos :");
		int l = 2;
		do {
			if(i%2==0) {
			System.out.print(l+" ");
			}
			l++;
		}while(l<=100);
		
		System.out.println();
		// 5) Write a Program To print sum of 1 to 50 Odd nos.
		
		System.out.println("5. Print 1 to 50 odd nos :");
		int m = 1;
		do {
			if(m%2!=0) {
			System.out.print(m+" ");
			}
			m++;
		}while(m<=50);
		
		System.out.println();
		// 6) Write a Program To print sum of 1 to 50 EVEN nos.
		
		System.out.println("6. Print 1 to 50 even nos :");
		int n = 2;
		do {
			if(i%2==0) {
			System.out.print(n+" ");
			}
			n++;
		}while(n<=50);
		
		System.out.println();
		// 7) Write a Program To print -45 to +45 nos.
		
		System.out.println("7. Print -45 to +45 nos :");
		int o = -45;
		do {
			System.out.print(o+" ");
			o++;
		}while(o<= 45);
		
		System.out.println();
		// 8) Write a Program To print 50 to 100 nos.
		
		System.out.println("8. Print 50 to 100 nos :");
		int p = 50;
		do {
			System.out.print(p+" ");
			p++;
		}while(p<= 100);
		
		System.out.println();
		// 9) Write a Program To print sum of odd and even no.
		
		System.out.println("9. Print sum of odd and even no :");
		int q = 0;
		int oddSum = 0;
		int evenSum = 0;
		do {
			if(q%2==0) {
				evenSum +=1;
			}else {
				oddSum +=1;
			}
			q++;
		}while(q< 100);
		System.out.println("Odd Sum : "+oddSum+" Even Sum : "+ evenSum);
		
		// 10) Write a Program To print even and odd No
		
		System.out.println("10. Print even and odd no :");
		int r = 0;
		do {
			if(r%2==0) {
				System.out.println(r+ " even");
			}else {
				System.out.println(r+ " odd");
			}
			r++;
		}while(r<=100);
		
		// 11) Write a Program To print 1 to 100 no.
		
		System.out.println("11. Print 1 to 100 no :");
		int s = 1;
		do {
			System.out.print(s+" ");
			s++;
		}while(s<=100);
		
		System.out.println();
		// 12) Write a Program To print 100 to 1 no.
		
		System.out.println("12. Print 100 to 1 no :");
		int t = 100;
		do {
			System.out.print(t+" ");
			t--;
		}while(t>0);

		System.out.println();
		// 13) Write a Program To print 30 to 50 no.
		
		System.out.println("13. Print 30 to 50 no :");
		int u =  30;
		do {
			System.out.println(u+" ");
			u++;
		}while(u<=50);
	
		System.out.println();
		// 14) Write a Program To print count of even No 1 to 25 no.
		
		System.out.println("14. Print count of even No 1 to 25 no :");
		int v = 1;
		int evenSumSec = 0;
		do {
			if(v%2==0) {
				evenSumSec +=1;
			}
			v++;
		}while(v<=25);
		System.out.println("Even Sum : "+ evenSumSec);
		
		// 15) Write a Program To print count of odd No 1 to 25 no.
		
		System.out.println("15. Print count of odd No 1 to 25 no :");
		int w = 1;
		int oddSumSec = 0;
		do {
			if(w%2!=0) {
				oddSumSec +=1;
			}
			w++;
		}while(w<=25);
		System.out.println("Odd Sum : "+oddSumSec);
		
 //////   Series
        
        System.out.println();
        System.out.println("---------SERIES-----------------");
        System.out.println();


		
		// 16) Generate the Series... 2 4 6 8 10 12 14 16 18 20.
		
		System.out.println("16. Print.... 2 4 6 8 10 12 14 16 18 20 :");
		int x = 2;
		do {
			System.out.print(x+" ");
			x+=2;
		}while(x<=20);
		
		
		System.out.println();

		// 17) Generate the Series... 9 18 27 36 45 54 63 72 81 90. 
		
		System.out.println("17. Print.... 9 18 27 36 45 54 63 72 81 90 :");
		int y = 9;
		do {
			System.out.print(y+" ");
			y+=9;
		}while(y<=90);
		System.out.println();
		
		// 18) Generate the Series... 1 -2 3 -4 5 -6 7 -8 9 -10.
		
		System.out.println("18. Print.... 1 -2 3 -4 5 -6 7 -8 9 -10 :");
		int z = 1;
		int temp = 0;
		do {
			if(z%2 == 0) {
				temp = z;
				temp = z *-1;
				System.out.print(temp+" ");
			}else{
				System.out.print(z+" ");
			}
			z++;
		}while(z<=10);
		System.out.println();
		
		// 19) Generate the Series... 5 10 15 20 25 30 35 40 45 50.
		
		System.out.println("19. Print.... 5 10 15 20 25 30 35 40 45 50 :");
		int a = 5;
		do {
			System.out.print(a+" ");
			a+=5;
		}while(a<=50);
		System.out.println();
		
       // 20) Generate the Series... 1 10 100 1000.
		
		System.out.println("20. Print.... 1 10 100 1000 :");
		int b = 1;
		do {
			System.out.print(b+" ");
			b = b*10;
		}while(b<=1000);
		System.out.println();
		
		// 21) Generate the Series... 1  3  6  10  15  21  28  36  45
		
		System.out.println("21. Print.... 1  3  6  10  15  21  28  36  45 :");
		int c = 1;
		int tem = 1;
		do {
			System.out.print(c+" ");
			tem++;
			c += tem;
		}while(c <=45);
		System.out.println();
		
		//22) Generate the Series... 8 16 24 32 40 48 56 64 72 80.
		
		System.out.println("22. Print.... 8 16 24 32 40 48 56 64 72 80 :");
		int d = 8;
		do {
			System.out.print(d+" ");
			d+=8;
		}while(d<=80);
		System.out.println();
		
		// 23) Generate the Series... 0 1 1 2 3 5 8 13 21.
		
		System.out.println("23. Print.... 0 1 1 2 3 5 8 13 21 :");
		int count = 0;
		int firstTerm = 0;
		int secTerm = 1;
		int nextTerm = 0;
		 	
		do {
			System.out.print(firstTerm+" ");
			nextTerm = firstTerm + secTerm;
			firstTerm = secTerm;
			secTerm = nextTerm;
			count++;
		
		}while(count<9);
		System.out.println();
		
		// 24) Generate the series... 1 4 9 16 25 36 49 64 81 100.
		
		System.out.println("24. Print.... 1 4 9 16 25 36 49 64 81 100 :");
		int g = 1;
		do {
			System.out.print(g*g+" ");
			g++;
		}while(g<=10);
		System.out.println();
		
		// 25) Generate the series... 3 6 9 12 15 18 21 24 27 30.
		
		System.out.println("25. Print.... 3 6 9 12 15 18 21 24 27 30 :");
		int h = 3;
		do {
			System.out.print(h+" ");
			h+=3;
		}while(h<=30);
		System.out.println();
		
		// 26) Generate the Series... 7 14 21 28 35 42 49 56 63 70. 
		
		System.out.println("26. Print.... 7 14 21 28 35 42 49 56 63 70 :");
		int aa = 7;
		do {
			System.out.print(aa+" ");
			aa+=7;
		}while(aa<=70);
		System.out.println();
		
		// 27) Generate the Series... 4 8 12 16 20 24 28 32 36 40.
		
		System.out.println("27. Print....4 8 12 16 20 24 28 32 36 40 :");
		int bb = 4;
		do {
			System.out.print(bb+" ");
			bb+=4;
		}while(bb<=40);
		System.out.println();

		// 28) Generate the Series... 10 20 30 40 50 60 70 80 90 100.
		
		System.out.println("28. Print....10 20 30 40 50 60 70 80 90 100 :");
		int cc = 1;
		do {
			System.out.print(cc*10+" ");
			cc++;
		}while(cc<=10);
		System.out.println();
		
		// 29) Generate the Series... 1 2 3 4 5 4 3 2 1. 
		
		System.out.println("29. Print....  1 2 3 4 5 4 3 2 1 :");
		int dd = 1;
		int te = 4;
		do {
			if(dd <= 5) {
				System.out.print(dd+" ");
			}
			if(dd>5) {
				System.out.print(te+" ");
				te--;
			}
			dd++;
		}while(dd<10);
		System.out.println();
	
		// 30) Generate the Series... 6 12 18 24 30 36 42 48 54 60.
		
		System.out.println("30. Print....  6 12 18 24 30 36 42 48 54 60 :");
		int ee = 6;
		do {
			System.out.print(ee+" ");
			ee+=6;
		}while(ee<=60);
		
		System.out.println(" ");
		System.out.println("---------------------------------------");
		System.out.println("Do While Practice Completed....!!!!!");
		System.out.println("---------------------------------------");
	}
}
