package org.dimigo.basic;

public class Operator {
	public static void main(String[] args) {
		int s1 = 9, s2 = 10, p1 = 9;
		Double h1 = 5.8, h2 = 5.4;
		Double S1 = ((s1 + s2)*h1)/2.0;
		Double S2 = (p1 * h2);
		
		System.out.println("<< ���� ���� �� >>");
		System.out.println("��ٸ��� ���� : " +S1);
		System.out.println("����纯�� ���� : " +S2);
		
		if(S1>S2) {
			System.out.printf("\n\n��ٸ����� ����纯������ %.1f �� Ů�ϴ�.", S1-S2);
		}
		else if(S1<S2) {
			System.out.printf("\n\n����纯���� ��ٸ��ú��� %.1f �� Ů�ϴ�.", S2-S1);
		} else {
			System.out.println("\n\n���� ���̴� �����ϴ�");
		}
	}
}
