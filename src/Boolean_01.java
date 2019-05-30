
public class Boolean_01 {
	public static void main(String[] args) {

		boolean bYes = true;
		boolean bNo = false;
		
		// boolean에서는 연산기호(operator)를 사용할 수 없다.
		// bYes = bYes + true;
		bYes = 1 == 2;
		// (==)는 양쪽이 같은지를 물어보는 논리연산자
		
		System.out.println(bYes);
		
		// 1. = 기호를 중심으로 항상 오른쪽이 먼저 명령실행
		// 2. ==과 - 연산기호는 연산순서가 -가 먼저 실행
		// 3. 결국 2-1이 계산되어 결과가 1이되고
		// 4. 1과1이 같냐고 물어보는 식이된다.
		bYes = 1 == 2 - 1;
		System.out.println(bYes);
		
		bYes = 1 == (2 - 1);
		
	}
}
