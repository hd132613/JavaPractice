package org.dimigo.inheritance;

public class Figure {
	int centerX=0;
	int centerY=0;
	
	public Figure(int centerX, int centerY){
		this.centerX=centerX;
		this.centerY=centerY;
	}
	
	protected void printCenter(){
		System.out.println("중심좌표 : ("+centerX+", "+centerY+")");
	}
	
	protected void moveFigure(int x, int y){
		this.centerX += x;
		this.centerY += y;
	}
}