package week3.day2;

import junit.framework.TestResult;

public class Automation extends MultipleLangauge{


	public void Selenium() {
		System.out.println("selenium");

	}

	public void Java() {
		System.out.println("java");

	}

	public void python() {
		System.out.println("python");

	}

	public static void main(String[] args) {

		Automation a=new Automation();
		a.Java();
		a.Selenium();
		a.python();
		a.ruby();
	}

	public int countTestCases() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void run(TestResult arg0) {
		// TODO Auto-generated method stub
		
	}
}