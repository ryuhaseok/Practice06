package com.javaex.ex03;

public class Shape {
	//private -> protected로 수정
	protected String fillColor;
	protected String lineColor;
	//default 생성자 추가
	public Shape() {
	}

	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	
}

