package com.bridgelabz.slgame;

public class SLgame {
	public static void main(String[] args) {
		
		System.out.println("Snake and Ladder Game played with single player started at position 0");
		
		int dValue = ((int)Math.floor(Math.random()*100) % 6)+1;
		System.out.println("the value of rolled die is: "+dValue);
		
	}
}
