package Practice01;

public class Nunber07 {
	public static void main(String[] args) {
		int x = 3;
		int y = 7;
		//もう一つ変数が必要
		int n = x;
		
		//入れ替え
		x = y;
		y = n;
		System.out.println("x=" + x + ",y=" + y);
	}
}
