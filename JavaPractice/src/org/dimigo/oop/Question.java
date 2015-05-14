package org.dimigo.oop;

import java.util.Scanner;

public class Question {
	public static void main(String[] args) {
		System.out.println("가장 좋아하는 가수는?");
		Scanner scanner = new Scanner(System.in);
		String answer = scanner.nextLine();
		if(answer.equals("빅뱅")){
			System.out.println("정답입니다.");
		} else {
			System.out.println("틀렸습니다.");
		}
		System.out.println();
		
		System.out.println("가장 좋아하는 배우는?");
		scanner = new Scanner(System.in);
		answer = scanner.nextLine();
		if(answer.equals("없어")){
			System.out.println("정답입니다.");
		} else {
			System.out.println("틀렸습니다.");
		}
		System.out.println();
		
		System.out.println("가장 좋아하는 과목은?");
		scanner = new Scanner(System.in);
		answer = scanner.nextLine();
		if(answer.equals("자바")){
			System.out.println("정답입니다.");
		} else {
			System.out.println("틀렸습니다.");
		}
		System.out.println();
	}
}
