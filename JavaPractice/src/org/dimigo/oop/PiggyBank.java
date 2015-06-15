package org.dimigo.oop;

public class PiggyBank {
	private static int balance;
	public static void putMoney(FamilyMember member, int amount){
		System.out.println(member.getMemberName() + "가 " + amount + "원을 넣음");
		balance += amount;
	}
	public static void printBalance(){
		System.out.println("돼지 저금통 총 금액 : " + balance + "원");
	}
}
