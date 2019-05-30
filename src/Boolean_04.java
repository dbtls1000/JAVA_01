
public class Boolean_04 {
	public static void main(String[] args) {
		
		// intNum1과 intNum2를 사용 할 준비를 하는 선언문
		int intNum1 = 0;
		int intNum2 = 0;
		System.out.println(intNum1);
		
		// 변수를 선언할때
		// 값을 아무것도 대입하지 않으면
		// 변수는 사용할 준비가 되지 않음
		// 그런데 변수내용 읽기를 시도하면
		// 오류가 난다.
		int intNum3;
		//System.out.println(intNum3); 문법오류 발생
		
		intNum3 = 30; 
		System.out.println(intNum3);
		
		int intNum4;
		intNum4 = 0;
		
		boolean bYes = true;
		
		intNum1 = 40;
		intNum2 = 50;
		
		bYes = intNum1 == intNum2; // false
		bYes = intNum1 > intNum2; // false
		bYes = intNum1 < intNum2; // true
		bYes = intNum1 >= intNum2; // false
		bYes = intNum1 <= intNum2; // true
		
		// !=는 두 값이 다르냐고 물어보는 not연산자
		bYes = intNum1 != intNum2; // true
		
		intNum1 = intNum2;
		bYes = intNum1 != intNum2; // false
		
		
		
		
	}
}
