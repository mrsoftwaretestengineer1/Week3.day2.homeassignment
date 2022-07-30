package week3.day2;

import junit.framework.Test;

public abstract class MultipleLangauge implements Test {

	public  abstract void python();
	
	/*Assignment 5 on Abstraction
	===========
	Interface :Language
	     Methods   :Java()
	     Interface :TestTool
	     Methods   :Selenium()
	     AbstractClass :MultipleLangauge
	     Methods   :python() and un implemented method as ruby()
	  Execution class: Automation 
	Implement all the methods of interface and abstract class in Automation class*/
	public interface Language {

		public void Java();
		
	}
	
	public void ruby()
	{
		System.out.println("Ruby");
	}
	
	
}