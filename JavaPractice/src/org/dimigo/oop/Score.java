package org.dimigo.oop;

import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
		System.out.printf("국어 점수 입력 => ");
		Scanner scanner = new Scanner(System.in);
		int kor = scanner.nextInt();
		
		System.out.printf("수학 점수 입력 => ");
		int math = scanner.nextInt();
		
		System.out.printf("영어 점수 입력 => ");
		int eng = scanner.nextInt();
		
		System.out.printf("\n\n");
		
		int sum = kor+math+eng;
		double a = sum/3.0;
		
		String sb = new StringBuilder("<<점수출력>>\n")
			.append("국어점수 : ").append(kor).append("점\n")
			.append("수학점수 : ").append(math).append("점\n")
			.append("영어점수 : ")	.append(eng).append("점\n")
			.append("총점 : ").append(sum).append("점\n")
			.append("평균 : ").append(String.format("%.1f",a)).append("점\n").toString();
		System.out.printf(sb);
	}
}
