package org.dimigo.basic;

public class PrimitiveDataType {

	public static void main(String[] args) {
		String name = "������";
		boolean female = true;
		int age = 23;
		double height = 161.8;
		float weight = 44.3f;
		char btype = 'A';
		
		System.out.println("<< ������ ������ >>");
		System.out.printf("�̸� : %s\n", name);
		if(female) {
			System.out.println("���� : ����");
		} else {
			System.out.println("����  : ����");
		}
		System.out.printf("���� : %d ��\n", age);
		System.out.printf("Ű : %.1f cm\n", height);
		System.out.printf("������ : %.1f kg\n", weight);
		System.out.printf("������ : %c ��\n", btype);
	}

}
