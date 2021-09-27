package com.ltts;

import java.util.Scanner;

abstract class Match{
	protected int currentScore;
	protected int currentOver;
	protected int target;
	public int getCurrentScore() {
		return currentScore;
	}
	public void setCurrentScore(int currentScore) {
		this.currentScore = currentScore;
	}
	public float getCurrentOver() {
		return currentOver;
	}
	public void setCurrentOver(int currentOver) {
		this.currentOver = currentOver;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
	abstract float calculateRunRate();
	abstract int calculateBalls();
	abstract void display(double reqRunrate, int balls);
}
class ODImatch extends Match{

	@Override
	float calculateRunRate() {
		float res = this.currentScore/this.currentOver;
		return res;
	}

	@Override
	int calculateBalls() {
		int res = this.currentOver * 6;
		return res;
	}

	@Override
	void display(double reqRunrate, int balls) {
		System.out.println("Requirements\nNeed "+(this.target-this.currentScore)+" runs in "+balls+" balls");
		System.out.println("Required Runrate is "+reqRunrate);
	}
	
}
class T20Match extends Match{
	
	@Override
	float calculateRunRate() {
		float res = this.currentScore/this.currentOver;
		return res;
	}

	@Override
	int calculateBalls() {
		int res = this.currentOver * 6;
		return res;
	}

	@Override
	void display(double reqRunrate, int balls) {
		System.out.println("Requirements\nNeed "+(this.target-this.currentScore)+" runs in "+balls+" balls");
		System.out.println("Required Runrate is "+reqRunrate);
	}
}
class TestMatch extends Match{
	@Override
	float calculateRunRate() {
		float res = this.currentScore/this.currentOver;
		return res;
	}

	@Override
	int calculateBalls() {
		int res = this.currentOver * 6;
		return res;
	}

	@Override
	void display(double reqRunrate, int balls) {
		System.out.println("Requirements\nNeed "+(this.target-this.currentScore)+" runs in "+balls+" balls");
		System.out.println("Required Runrate is "+reqRunrate);
	}
}
public class MatchMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter the match format:\n1.ODI\n2.T20\n3.Test");
	    int n=input.nextInt();
	    if(n==1)
	    {
	    	ODImatch obj = new ODImatch();
			obj.setCurrentScore(256);
			obj.setCurrentOver(30);
			obj.setTarget(400);
			obj.getCurrentOver();
			obj.getCurrentScore();
			obj.getTarget();
			obj.display(7.20, 120);
	    }
	    else if(n==2)
	    {
	    	T20Match obj1 = new T20Match();
			obj1.setCurrentScore(100);
			obj1.setCurrentOver(50);
			obj1.setTarget(500);
			obj1.getCurrentOver();
			obj1.getCurrentScore();
			obj1.getTarget();
			obj1.display(20, 200);
	    }
	    else if(n==3)
	    {
	    	TestMatch obj2 = new TestMatch();
			obj2.setCurrentScore(256);
			obj2.setCurrentOver(30);
			obj2.setTarget(400);
			obj2.getCurrentOver();
			obj2.getCurrentScore();
			obj2.getTarget();
			obj2.display(7.20, 120);
	    }
	    else
	    	System.out.println("Invalid");
		
	}
}