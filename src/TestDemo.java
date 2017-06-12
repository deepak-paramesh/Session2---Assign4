import java.util.Scanner;


public class TestDemo {

	int i;
	
	TestDemo(){
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();
		if(i == 0){
			System.out.println("You have entered zero");
		}
		else if(i>0){
			System.out.println("You have entered positive");
		}
		else{
			System.out.println("You have entered negetive");
		}
	}
	
	public static void main(String[] args) {

		TestDemo id = new TestDemo();
//		new TestDemo();

	}

}
