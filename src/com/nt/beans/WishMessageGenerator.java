package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {

	private Date d;
	public WishMessageGenerator(Date dat) {
		// TODO Auto-generated constructor stub
		System.out.println("one param constructor");
		this.d=dat;
	}
	static 
	{
		System.out.println("static block");
	}
	public WishMessageGenerator()
	{
		System.out.println("1-param constructor");
	}
	public void messagegenerator()
	{
		int hour=d.getHours();
		if(hour>5 && hour<12)
			System.out.println("Good Morning");
		else
			if(hour>12&& hour<18)
				System.out.println("Good AfterNoon");
			else
				System.out.println("Good Night");
	}
}
