package com.iqmsoft.model;

import java.io.Serializable;
import java.util.Random;

public class Info implements Serializable {

	private static final long serialVersionUID = -7984032536291170146L;

	private double valueA;
	private double valueB;
	private double valueC;
	private double valueD;
	private double valueE;
	private double valueF;
	private double valueG;
	private double valueH;
	private double valueI;

	public double getValueA() {
		return valueA;
	}

	public double getValueB() {
		return valueB;
	}
	
	public double getValueC() {
		return valueC;
	}
	
	public double getValueD() {
		return valueD;
	}
	
	public double getValueE() {
		return valueE;
	}
	
	public double getValueF() {
		return valueF;
	}
	
	public double getValueG() {
		return valueG;
	}
	
	public double getValueH() {
		return valueH;
	}
	
	public double getValueI() {
		return valueI;
	}

	public void changeValues() {
		this.valueA = random(-2, 2);
        this.valueB = random(-4, 4);
        this.valueC = random(-6, 6);
        this.valueD = random(-8, 8);
        this.valueE = random(-10, 10);
        this.valueF = random(-12, 12);
        this.valueG = random(-14, 14);
        this.valueH = random(-16, 16);
        this.valueI = random(-18, 18);
	}
	
	public static int random(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(max) + min;
	}
	
}
