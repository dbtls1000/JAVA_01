
public class Boolean_05 {
	public static void main(String[] args) {
		
		int intnum1 = 0;
		int intnum2 = 0;
		
		boolean bYes = true;
		
		// ������ �տ� -�� ���̸� ���� * -1�� ������ �����Ѵ�.
		intnum1 = 10;
		intnum1 = -intnum1;
		System.out.println(intnum1);
		
		intnum1 = -1 * intnum1;
		
		bYes = intnum1 == -intnum1;
		bYes = intnum1 != -intnum1;
		
		bYes = !bYes; // bYes = not bYes;
		bYes = bYes != bYes; // false
		bYes = bYes == bYes; // true
		bYes = bYes == !bYes; // false 
		bYes = bYes != !bYes; // true
		
		
	}
}
