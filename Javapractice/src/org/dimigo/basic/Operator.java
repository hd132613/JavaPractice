package org.dimigo.basic;

public class Operator {
	public static void main(String[] args) {
		int s1 = 9, s2 = 10, p1 = 9;
		Double h1 = 5.8, h2 = 5.4;
		Double S1 = ((s1 + s2)*h1)/2.0;
		Double S2 = (p1 * h2);
		
		System.out.println("<< 도형 넓이 비교 >>");
		System.out.println("사다리꼴 넓이 : " +S1);
		System.out.println("평행사변형 넓이 : " +S2);
		
		if(S1>S2) {
			System.out.printf("\n\n사다리꼴이 평행사변형보다 %.1f 더 큽니다.", S1-S2);
		}
		else if(S1<S2) {
			System.out.printf("\n\n평행사변형이 사다리꼴보다 %.1f 더 큽니다.", S2-S1);
		} else {
			System.out.println("\n\n둘의 넓이는 같습니다");
		}
	}
}
