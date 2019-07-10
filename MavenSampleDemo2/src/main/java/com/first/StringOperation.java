package com.first;

public class StringOperation {

	public String concat(String a, String b) {
		return (a + b);
	}

	public int howLong(String a) {
		return (a.length());
	}

	public boolean containsSomething(String a) {
		return (a.contains("a"));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringOperation so = new StringOperation();
		System.out.println("" + so.concat("this is supposed to be a", " really long sentence that is concatenated"));

		System.out.println("" + so.howLong("this should be like 22"));

		System.out.println("" + so.containsSomething("This sentence should contain an a"));

	}

}
