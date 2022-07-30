package week3.day2;

import org.openqa.selenium.BuildInfo;

public class AxisBank extends BuildInfo {
	
	public void deposit()

	{

		System.out.println("My deposit account");
	}

	public static void main(String[] args) {
		
	
		AxisBank money = new AxisBank();
		money.deposit();
		money.saving();
		money.fixed();
		
		}

	private void fixed() {
		// TODO Auto-generated method stub
		
	}

	private void saving() {
		// TODO Auto-generated method stub
		
	}
		
		
	}