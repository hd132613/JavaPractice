package org.dimigo.basic;

public class Condition {
	public static void main(String[] args) {
		int bus = 850;
		int car = 300;
		int soon = 600;
		int far = 25;
		int num = 1;
		int price = 0;
		
		switch(num){
		case 1:
			System.out.println("<< ��ӵ��� ����� ��� >>");
			System.out.println("�Ÿ� : " +far +"km");
			System.out.println("���� : " +"��ӹ���");
			if(far>=0 && far <=10)
				System.out.println("����� : " +bus +"��");
			else if(far > 10)
			{
				if(far % 10 != 0){
					price = (far/10)*300+850;
					System.out.println("����� : " +price +"��");
				}
				else{
					price = (far/10-1)*300+850;
					System.out.println("����� : " +price +"��");
				}
			}
			break;
		case 2:
			System.out.println("<< ��ӵ��� ����� ��� >>");
			System.out.println("�Ÿ� : " +far +"km");
			System.out.println("���� : " +"����");
			if(far>=0 && far <=10)
				System.out.println("����� : " +car +"��");
			else if(far > 10)
			{
				if(far % 10 != 0){
					price = (far/10)*200+300;
					System.out.println("����� : " +price +"��");
				}
				else{
					price = (far/10-1)*200+300;
					System.out.println("����� : " +price +"��");
				}
			}
			break;
		default:
			System.out.println("<< ��ӵ��� ����� ��� >>");
			System.out.println("�Ÿ� : " +far +"km");
			System.out.println("���� : " +"�� ��");
			if(far>=0 && far <=10)
				System.out.println("����� : " +soon +"��");
			else if(far > 10)
			{
				if(far % 10 != 0){
					price = (far/10)*200+600;
					System.out.println("����� : " +price +"��");
				}
				else{
					price = (far/10-1)*200+600;
					System.out.println("����� : " +price +"��");
				}
			}
			break;
		}
	}
}
