public class Main {
	public static void main(String[] args) {

		System.out.println("---------------------------------------");
		System.out.println("Programs on For Loop ....!!!!!");
		System.out.println("---------------------------------------");

		// 1) Write a Program To print 1 to 25 nos.

		System.out.println("1. Print number from 1 to 25 : ");
		for (int i = 1; i <= 25; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 2) Write a Program To print 25 to 1 nos.

		System.out.println("2. Print 1 to 25 nos :");
		for (int i = 25; i >= 1; i--) {
			System.out.print(i + " ");

		}
		System.out.println();

		// 3) Write a Program To print 1 to 100 Odd nos.

		System.out.println("3. Print 1 to 100 Odd nos :");
		for (int i = 1; i < 100; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		// 4) Write a Program To print 1 to 100 even nos.

		System.out.println("4. Print 1 to 100 even nos :");
		for (int i = 1; i < 100; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		// 5) Write a Program To print sum of 1 to 50 Odd nos.

		System.out.println("5. Print 1 to 50 odd nos :");
		int a = 0;
		for (int i = 1; i < 50; i++) {
			if (i % 2 != 0) {
				a = a + i;
			}
		}
		System.out.println("sum of 1 to 50 Odd nos " + a);

		// 6) Write a Program To print sum of 1 to 50 EVEN nos.

		System.out.println("6. Print 1 to 50 even nos :");
		int b = 0;
		for (int i = 1; i < 50; i++) {
			if (i % 2 == 0) {
				b = b + i;
			}
		}
		System.out.println("sum of 1 to 50 Odd nos " + b);

		// 7) Write a Program To print -45 to +45 nos.

		System.out.println("7. Print -45 to +45 nos :");
		for (int i = -45; i <= 45; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 8) Write a Program To print 50 to 100 nos.

		System.out.println("8. Print 50 to 100 nos :");
		for (int i = 50; i <= 100; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 9) Write a Program To print sum of odd and even no.

		System.out.println("9. Print sum of odd and even no :");
		int c = 0;
		for (int i = 1; i < 50; i++) {
			if (i % 2 != 0) {
				c = c + i;
			} else if (i % 2 == 0) {
				c = c + i;
			}
		}
		System.out.println("Sum of odd and even " + c);

		// 10) Write a Program To print even and odd No

		System.out.println("10. Print even and odd no :");
		for (int i = 1; i < 100; i++) {
			if (i % 2 == 0) {
				System.out.print("Even " + i + " ");
			} else {
				System.out.print("Odd " + i + " ");
			}
		}
		System.out.println();

		// 11) Write a Program To print 1 to 100 no.

		System.out.println("11. Print 1 to 100 no :");
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 12) Write a Program To print 100 to 1 no.

		System.out.println("12. Print 100 to 1 no :");
		for (int i = 100; i >= 1; i--) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 13) Write a Program To print 30 to 50 no.

		System.out.println("13. Print 30 to 50 no :");
		for (int i = 30; i <= 50; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 14) Write a Program To print count of even No 1 to 25 no.

		System.out.println("14. Print count of even No 1 to 25 no :");
		int d = 0;
		for (int i = 1; i <= 25; i++) {
			if (i % 2 == 0) {
				d = d + 1;
			}
		}
		System.out.println("count of even No 1 to 25 no " + d);

		// 15) Write a Program To print count of odd No 1 to 25 no.

		System.out.println("15. Print count of odd No 1 to 25 no :");
		int e = 0;
		for (int i = 1; i <= 25; i++) {
			if (i % 2 != 0) {
				e = e + 1;
			}
		}
		System.out.println("count of odd No 1 to 25 no " + e);

		////// Series

		System.out.println();
		System.out.println("---------SERIES-----------------");
		System.out.println();

		// 16) Generate the Series... 2 4 6 8 10 12 14 16 18 20.

		System.out.println("16. Print.... 2 4 6 8 10 12 14 16 18 20 :");
		for (int i = 2; i <= 20; i += 2) {
			System.out.print(i + " ");

		}
		System.out.println();
		// 17) Generate the Series... 9 18 27 36 45 54 63 72 81 90.

		System.out.println("17. Print.... 9 18 27 36 45 54 63 72 81 90 :");
		for (int i = 9; i <= 90; i += 9) {
			System.out.print(i + " ");

		}
		System.out.println();

		// 18) Generate the Series... 1 -2 3 -4 5 -6 7 -8 9 -10.

		System.out.println("18. Print.... 1 -2 3 -4 5 -6 7 -8 9 -10 :");
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			} else {
				System.out.print("-" + i + " ");

			}
		}
		System.out.println();

		// 19) Generate the Series... 5 10 15 20 25 30 35 40 45 50.

		System.out.println("19. Print.... 5 10 15 20 25 30 35 40 45 50 :");
		for (int i = 1; i <= 50; i++) {
			if (i % 5 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		// 20) Generate the Series... 1 10 100 1000.

		System.out.println("20. Print.... 1 10 100 1000 :");
		for (int i = 1; i <= 1000; i *= 10) {
			System.out.print(i + " ");

		}
		System.out.println();

		// 21) Generate the Series... 1 3 6 10 15 21 28 36 45

		System.out.println("21. Print.... 1  3  6  10  15  21  28  36  45 :");
		int f = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.print(f + " ");
			f = i + f;

		}
		System.out.println();

		// 22) Generate the Series... 8 16 24 32 40 48 56 64 72 80.

		System.out.println("22. Print.... 8 16 24 32 40 48 56 64 72 80 :");
		for (int i = 8; i <= 80; i += 8) {
			System.out.print(i + " ");

		}
		System.out.println();

		// 23) Generate the Series... 0 1 1 2 3 5 8 13 21.

		System.out.println("23. Print.... 0 1 1 2 3 5 8 13 21 :");
		int g = 0;
		int x = 1;
		for (int i = 1; i <= 10; i++) {
			System.out.print(g + " ");
			int z = g + x;
			g = x;
			x = z;
		}
		System.out.println();

		// 24) Generate the series... 1 4 9 16 25 36 49 64 81 100.

		System.out.println("24. Print.... 1 4 9 16 25 36 49 64 81 100 :");

		for (int i = 1; i <= 10; i++) {
			System.out.print(i * i + " ");
		}
		System.out.println();

		// 25) Generate the series... 3 6 9 12 15 18 21 24 27 30.

		System.out.println("25. Print.... 3 6 9 12 15 18 21 24 27 30 :");
		for (int i = 1; i <= 10; i++) {
			System.out.print(i * 3 + " ");
		}
		System.out.println();

		// 26) Generate the Series... 7 14 21 28 35 42 49 56 63 70.

		System.out.println("26. Print.... 7 14 21 28 35 42 49 56 63 70 :");
		for (int i = 1; i <= 10; i++) {
			System.out.print(i * 7 + " ");
		}
		System.out.println();

		// 27) Generate the Series... 4 8 12 16 20 24 28 32 36 40.

		System.out.println("27. Print....4 8 12 16 20 24 28 32 36 40 :");
		for (int i = 1; i <= 10; i++) {
			System.out.print(i * 4 + " ");
		}
		System.out.println();

		// 28) Generate the Series... 10 20 30 40 50 60 70 80 90 100.

		System.out.println("28. Print....10 20 30 40 50 60 70 80 90 100 :");
		for (int i = 1; i <= 10; i++) {
			System.out.print(i * 10 + " ");
		}
		System.out.println();

		// 29) Generate the Series... 1 2 3 4 5 4 3 2 1.

		System.out.println("29. Print....  1 2 3 4 5 4 3 2 1 :");
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + " ");
		}
		for (int i = 4; i >= 1; i--) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 30) Generate the Series... 6 12 18 24 30 36 42 48 54 60.

		System.out.println("30. Print....  6 12 18 24 30 36 42 48 54 60 :");
		for (int i = 1; i <= 10; i++) {
			System.out.print(i * 6 + " ");
		}
		System.out.println(" ");
		System.out.println("---------------------------------------");
		System.out.println("For Loop Practice Completed....!!!!!");
		System.out.println("---------------------------------------");
	}

}
