package Ch02;

public class C02음수 {

	public static void main(String[] args) {
		//컴퓨터(CPU)는 가산(+) 처리 가능
		//컴퓨터(CPU)는 감산(-) 처리 불가
		//뺄셈 요청 -> 결과 확인 ?
		//보수 도입 -> 뺄셈과 동일한 결과를 만들어 낸다
		
//		7 - 2 =  5
//		7 + 8 =  5 
//		54 - 13 = 41
//		54 + 87 = 41
		
//		5  + (-5) = 0
//				
//		00000101 = 5
//		11111010 = -6  (1의보수) 
//		
//	+	11111011 = -5  (2의보수)
//		-------------
//	    00000000  = 0
		
//		00000000 = 0
//		00000001 = 1
//		00000010 = 2
//		00000011 = 3
//		...
//		01111111 = 127
//		10000000 = -128
//		10000001 = -128+1 = -127
//		10000010 = -128+2 = -126
//		10000011 = -128+3 = -125
//		..
//		11111111 = -128+127 = -1
//		00000001 = 1
//		--------------

		//--------------------------------------------------
		//문제 1) 다음 10진수의 양 / 음의 값 구하기
		//--------------------------------------------------
		//--------		--------
		//10진수			2진수
		//--------		--------
		//10	->		00001010
		//- 10	->		11110110
		//
		//111	->		01101111
		//- 111	->		10010001
		//
		//96	->
		//- 96	->
		//
		//48	->
		//- 48	->
		//
		//--------------------------------------------------
		//문제 2) 다음 이진 비트의 10진 값을 구하기
		//--------------------------------------------------
		//10001010	-> 	-128+8+2
		//01000111	-> 	64+7
		//
		//11100000	-> -128+64+32
		//11110000	-> -128+64+32+16
		//
		//10001011	-> -128+8+2+1
		//11010001	-> -128+64+16+1
		//
		//11111100 -> -128+64+32+16+8+4
		//10101010 ->
		 
	
		
	}

}
