
public class FlowChart {

	public int method(int one ,int two,boolean three) {
		int total = 0;
		if(three) 
			total = one + two;
		else
			total = one * two;
		
		return total;
		
	}
	public static void input(int one) {
		if(one > 2000) {
			System.out.println("A");
		if(one > 6000) {
			System.out.println("C");
		}
		else {
			System.out.println("B");
			if(one> 4000) {
				System.out.println("D");
				
			}
			else 
				System.out.println("E");
				
		}
		}
		else {
			System.out.println("1");
			if(one > 100) {
				System.out.println("3");
				if(one>600) {
					System.out.println("5");
					
				}
				else {
					System.out.println("4");
					if(one>500) {
						System.out.println("6");
						
					}
					else {
						System.out.println("7");
					}
				}
			}
			else {
				System.out.println("2");
				
			}
		}
	}
	public static void main(String[] args) {
		input(501);
	}
}
