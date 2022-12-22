package chapter1.program4;

import java.util.Scanner;

public class Change {
    public static final int[] CURRENCIES = { 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
	public static void main(String[] args) {
		try(
		Scanner a = new Scanner(System.in)){
			System.out.print("あなたは何円所持していますか？");
			
//			所持金確認
			int i = a.nextInt();
			
//			try(
//			Scanner b = new Scanner(System.in)){
//			↑いらなかったけど最初書いてしまっていた文
				System.out.print("購入商品の代金はいくらですか？");
				
//			購入代金確認
			int f = a.nextInt();
			
			int result;
			result = i - f ;
			System.out.println("お釣りの金額は"+result+"円です"); 
			
			for ( i = 0; i < CURRENCIES.length; i++) {
				int count = result / CURRENCIES[i];
				result %= CURRENCIES[i];
			
			if ( count != 0) {
			System.out.println( CURRENCIES[i] + "円 : " + count + "枚" );
			
			}
	}
  }
}}