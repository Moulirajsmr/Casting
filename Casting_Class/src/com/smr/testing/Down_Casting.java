package com.smr.testing;

public class Down_Casting extends Up_Casting {
	@Override
	public void bike() {
		super.bike();
	}
	@Override
	public void car() {
		super.car();
	}
	public void bus() {
		System.out.println("tata");
	}
	public static void main(String[] args) {
		Down_Casting l = (Down_Casting) new Up_Casting();
		l.bike();
		l.car();
		l.bus();

	}
}
