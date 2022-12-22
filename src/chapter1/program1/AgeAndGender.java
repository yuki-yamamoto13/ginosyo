package chapter1.program1;

public class AgeAndGender {
	public static void main(String[] args) {
		
		int gender = 0;		//　性別　0は女性　1以上は男性
		int age = 10;       //　年齢　実際の年齢をそのまま入力
		
		String result = gender > 0 ?"男性":"女性";
//		genderが１未満の時女性、１以上の時男性と定義
		if(age>=20)	{
			System.out.println("成人の"+result+"です");
//			ageが20以上の時の結果
		}else {
			System.out.println("未成年の"+result+"です");
//			ageが20未満の時の結果
		}
		
	}
}