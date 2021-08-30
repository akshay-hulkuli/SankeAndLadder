package com.bridgelabz.slgame;

public class SLgame {
	private static final int LADDER = 0;
	private static final int SNAKE = 1;
	private static final int NOPLAY = 2;
	
	public static void main(String[] args) {
		
		System.out.println("Snake and Ladder Game played with single player started at position 0");
		
		int position = 0;
		
		while(position< 100) {
			
			if (position <= 0) {
				position = 0;
				System.out.println("RESTARTING");
			}
		
			int dValue = ((int)Math.floor(Math.random()*100) % 6)+1;
			System.out.println("the value of rolled die is: "+dValue);
			
			int option = ((int) Math.floor(Math.random()*10) % 3);
			
			switch(option) {
			case LADDER :
				System.out.println("The option is : " + option+"-LADDER");
				position += dValue;
				System.out.println("the current position is : "+position);
				break;
			case SNAKE :
				System.out.println("The option is : " + option+ "-SNAKE");
				position -= dValue;
				System.out.println("the current position is : "+ position);
				break;
			default:
				System.out.println("The option is : " + option+"-NOPLAY");
				System.out.println("the current position is : "+ position);
				
			}
			System.out.println();
		}
		
		System.out.println("Hurray Finished game !!");
	
	}

}
