
public class Boolean_06 {
	public static void main(String[] args) {
		
		int num1 = 15;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		
		boolean bYes = true;
		
		// && -> AND����
		// && �ΰ� �̻��� �� �������� ��� true�϶��� true 
		bYes = (num1 == num2) && (num3 == num4); // f and f : f
		bYes = num1 == num1 && num3 == num4; // t and f : f
		bYes = num1 == num2 && num3 == num3; // f and t : f
		bYes = num1 == num1 && num3 == num3; // t and t : t
		
		
		// || -> OR����
		// || �ΰ� �̻��� �� �������� 1���� true�̸� true
		bYes = num1 == num2 || num3 == num4; // f or f : f
		bYes = num1 == num1 || num3 == num4; // t or f : t
		bYes = num1 == num2 || num3 == num3; // f or t : t
		bYes = num1 == num1 || num3 == num3; // t or t : t
		
		// (f or t) and f >> t and f
		bYes = (num1 == num2 || num3 == num3) && num4 == num3; 
		System.out.println(bYes);
		
		num4 = 3 + (4 * ((5 - 2) % 3));
		System.out.println(num4);
	}
}
