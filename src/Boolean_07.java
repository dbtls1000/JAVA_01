
public class Boolean_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		
		boolean bYes = true;
								
		bYes = num1 > num2 && num3 > num4; // f and f : f 
		System.out.println(bYes);
		bYes = num1 < num2 && num3 < num4; // t and t : t
		System.out.println(bYes);
		bYes = num1 > num2 || num3 < num4; // f or t : t
		System.out.println(bYes);
		bYes = num1 < num2 || num3 > num4; // t or f : t
		System.out.println(bYes);
		
		
	}

}
