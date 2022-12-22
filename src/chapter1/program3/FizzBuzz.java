package chapter1.program3;

import java.util.Scanner;

public class FizzBuzz{
	public static void main (String[] args) {
		try (//		iに数値を半角で入力してください
		Scanner scanner = new Scanner(System.in)) {
			System.out.print("数値を半角で入力してください : ");
			
			int i = scanner.nextInt();

				if(i % 3 == 0 && i % 5 == 0) {
					System.out.println(i+"は15の倍数です");
//		３の倍数かつ５の倍数でないの時のコード
				}else if (i % 3 == 0 && (i % 5 != 0)){
					System.out.println(i+"は3の倍数です");
//		５の倍数かつ３の倍数でないと時のコード
				}else if (i % 5 == 0 &&(i % 3 != 0))
					System.out.println(i+"は5の倍数です");
//	　　　　３の倍数かつ５の倍数（１５の倍数）の時のコード
        scanner.close();
		}
	}
}