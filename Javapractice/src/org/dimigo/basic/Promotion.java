package org.dimigo.basic;

public class Promotion {
	public static void main(String[] args) {
		long salary = 1700000;
		int people = 3;
		int store = 1500;
		long expenses = salary*12*people*store;
		
		System.out.println("<< ��̺��� ���� �ΰǺ� >>");
		System.out.println("�� ��� �޿� : " +String.format("%,d", salary) +"��");
		System.out.println("���� �� ���� �� : " +people +"��");
		System.out.println("���� �� : " +String.format("%,d", store) +"��");
		System.out.println("���� �ΰǺ� : " +String.format("%,d", expenses) +"��");
		
	}
}
