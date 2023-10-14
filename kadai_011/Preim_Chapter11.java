package kadai_011;

public class Preim_Chapter11 {


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		boolean[] num = new boolean[101];
		
		for( int i = 0; i < num.length ; i++) {
			num[i] = true;
		}
		int primeNum = 2;
		while(primeNum < num.length) {
			for(int i = primeNum + 1; i < num.length; i++) {
			if( i % primeNum == 0) {
				num[i] = false;
				continue;
			}
		}
		primeNum += 1;
		}
	for(int i = 2; i < num.length; i++) {
		if(num[i]) {
			System.out.println(i);
		}
	}

	}}
