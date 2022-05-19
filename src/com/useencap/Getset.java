package com.useencap;

public class Getset {
	private long phone;

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		// convert long to string
		String value = String.valueOf(phone);
		if (value.length() == 10) {
			System.out.println("perfect");
		} else {
			System.out.println("not perfect");
		}
	}

	public static void main(String[] args) {
		Getset g = new Getset();
		g.setPhone(123456789l);
		g.setPhone(1234567890l);
	}
}
