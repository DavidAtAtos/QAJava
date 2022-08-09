
public class BlackJack {
	
	public static int play(int one , int two) {
		if(one <= 21 && two <= 21 ) {
			if(one >= two) {
				return one;
				
			}
			else 
				return two;
		}
		else {
			if(one > 21 && two > 21)
				return 0;
			if(one <= 21) {
				return one;
			}
			else 
				return two;
	}}

	public static void main(String[] args) {
		System.out.println(play(8,7));
		// TODO Auto-generated method stub

	}

}
