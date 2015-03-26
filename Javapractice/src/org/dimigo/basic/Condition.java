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
			System.out.println("<< 고속도로 통행료 계산 >>");
			System.out.println("거리 : " +far +"km");
			System.out.println("차종 : " +"고속버스");
			if(far>=0 && far <=10)
				System.out.println("통행료 : " +bus +"원");
			else if(far > 10)
			{
				if(far % 10 != 0){
					price = (far/10)*300+850;
					System.out.println("통행료 : " +price +"원");
				}
				else{
					price = (far/10-1)*300+850;
					System.out.println("통행료 : " +price +"원");
				}
			}
			break;
		case 2:
			System.out.println("<< 고속도로 통행료 계산 >>");
			System.out.println("거리 : " +far +"km");
			System.out.println("차종 : " +"경차");
			if(far>=0 && far <=10)
				System.out.println("통행료 : " +car +"원");
			else if(far > 10)
			{
				if(far % 10 != 0){
					price = (far/10)*200+300;
					System.out.println("통행료 : " +price +"원");
				}
				else{
					price = (far/10-1)*200+300;
					System.out.println("통행료 : " +price +"원");
				}
			}
			break;
		default:
			System.out.println("<< 고속도로 통행료 계산 >>");
			System.out.println("거리 : " +far +"km");
			System.out.println("차종 : " +"그 외");
			if(far>=0 && far <=10)
				System.out.println("통행료 : " +soon +"원");
			else if(far > 10)
			{
				if(far % 10 != 0){
					price = (far/10)*200+600;
					System.out.println("통행료 : " +price +"원");
				}
				else{
					price = (far/10-1)*200+600;
					System.out.println("통행료 : " +price +"원");
				}
			}
			break;
		}
	}
}
