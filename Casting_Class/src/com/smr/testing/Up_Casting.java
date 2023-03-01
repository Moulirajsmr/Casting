package com.smr.testing;

public class Up_Casting {

	public void bike() {
		System.out.println("pulsar");

	}
	
	public void car() {
		System.out.println("honda");

	}
	
	public static void main(String[] args) {
		Up_Casting k = new Down_Casting();
		k.bike();
		k.car();
		
	}
	
}
