
public class Boolean_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intNum1 = 30;
		int intNum2 = 50;
		
		boolean bYes = true;
		
		// intNum1의 값과 intNum2의 값이 같냐
		bYes = intNum1 == intNum2;
		
		// intNum1의 값이 intNum2의 값보다  크냐
		bYes = intNum1 > intNum2;
		
		// intNum1에 저장된 값을 복사해서
		// intNum2에 저장한다
		// 변수가 변수에 저장되는게 아닌 값이 변수에 저장되는것
		intNum2 = intNum1;
		bYes = intNum1 > intNum2;  // false
		
		// intNum1의 값이 intNum2의 값보다 크거나 같냐
		bYes = intNum1 >= intNum2; // true
		
		// intNum1의 값이 intNum2의 값보다 작거나 같냐		
		bYes = intNum1 <= intNum2; // true
		
		intNum1 = 100;
		
		bYes = intNum1 == intNum2; // false
		System.out.println(bYes);
		
		
	}

}
