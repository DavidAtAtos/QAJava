
public class FizzBuzz {
	public String fizzbuzz(int input) {
		if(input%5 ==0 && input % 3==0) {
			return "FizzBuzz";
		}
		else if (input%5 ==0) {
			return "Buzz";
		}
		else if(input%3 ==0) {
		return "Fizz";
		}
		else
			return String.valueOf(input);
	}
	public static void main(String[] args) {
		FizzBuzz f = new FizzBuzz();
		System.out.println(f.fizzbuzz(19));
	}

}
