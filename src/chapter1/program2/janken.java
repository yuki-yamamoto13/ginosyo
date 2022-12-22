package chapter1.program2;

import java.util.Random;
import java.util.Scanner;

public class janken {
	public static void main(String[] args) {
//		入力してもらう
		int user = getUser();
		
//		乱数で自動的に入力
		int pc = getPc();
		
//		勝敗判定表示
		String result = judgeJanken(user,pc);
				
//		結果表示
		showResult(user,pc,result);
	}
		
		public static int getUser() {
			try (Scanner scanner = new Scanner(System.in)) {
				while(true) {
					System.out.println("じゃんけんの手を選んでください	");
					System.out.println("0:グー  1:チョキ　　2:パー");
					
					int i = scanner.nextInt();
					
					if(i<0 || i >2) {
						System.out.println("入力できるのは0~2のみです");
					}
					else {
						return i ;}
					}
			}
		}
		public static int getPc() {
//			乱数準備
			Random rand = new Random();
			return rand.nextInt(3);
		}
		public static String judgeJanken(int user,int pc) {
			String result="";
			
			if(user==pc) {
				result = "結果はあいこです";
			}else if ( (user==0 && pc==1) || (user==1 && pc==2) || (user==2 && pc==0)) {
				result = "結果は、勝ちです";
			}else if((user==0 && pc==2) || (user==1 && pc==0) || (user==2 && pc==1)) {
				result = "結果は、負けです";
			};
			
//			if((user==0 && pc==1) || (user==1 && pc==2) || (user==2 && pc==0)) {
//				result = "結果は、勝ちです";
//			}else if ((user==0 && pc==2) || (user==1 && pc==0) || (user==2 && pc==1)) {
//				result = "結果は、負けです";
//			}else{
//				result = "結果は、あいこです";
//			}
//			
//			勝敗結果を返す
			return result;
			}
			public static void showResult(int user,int pc,String result) {
				
				String[] janken = {"グー","チョキ","パー"};
				// 結果の表示
				System.out.println("あなたのは:"+janken[user]+"を出しました。相手は:"+janken[pc]+"を出しました");
				System.out.println(result);
			}
	}