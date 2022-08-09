
public class UniqueSum {
	public static int input(int one,int two,int three) {
		if(one == two && two == three)
			return 0;
		if (one == two) {
			return three;
		}
		if(two == three) {
			return one;
		}
		if (three == one) {
			return two;
		}
		if (one != two && one != three  && two != three) {
			return one + two + three;
		}
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(input(7,5,2));
		// TODO Auto-generated method stub

	}

}
