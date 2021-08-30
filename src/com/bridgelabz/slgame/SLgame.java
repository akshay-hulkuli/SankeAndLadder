package com.bridgelabz.slgame;

public class SLgame {
	private static final int LADDER = 0;
	private static final int SNAKE = 1;
	private static final int NOPLAY = 2;
	
	public static void main(String[] args) {
		
		System.out.println("Snake and Ladder Game played with 2 players starting at position 0");
		
		int player1Pos = 0, player1Step=0, player2Pos=0,player2Step =0;
		
		// Using boolean flags to check who's term is to play
		boolean player1 = true, player2 = false;
		
		while(player1Pos< 100 && player2Pos<100) {
			
			if (player1 &&  player1Pos <= 0) {
				player1Pos = 0;
				System.out.println("RESTARTED");
			}
			if (player2 &&  player2Pos <= 0) {
				player2Pos = 0;
				System.out.println("RESTARTED");
			}
			
			if(player1) {
				player1Step++;
				System.out.println("** Player 1 **");
				System.out.println("Step : " + player1Step);
			}
			else {
				player2Step++;
				System.out.println("** Player 2 **");
				System.out.println("Step : " + player2Step);
			}
			
		
			int dValue = ((int)Math.floor(Math.random()*100) % 6)+1;
			System.out.println("value after rolling the die: "+dValue);
			
			int option = ((int) Math.floor(Math.random()*10) % 3);
			
			switch(option) {
			case LADDER :
				System.out.println("The option is : " + option+"-LADDER");
				if(player1) {
					player1Pos= (player1Pos+dValue)>100?player1Pos:player1Pos+dValue;
					System.out.println("new position is : "+player1Pos);
					}
				else {
					player2Pos= (player2Pos+dValue)>100?player2Pos:player2Pos+dValue;
					System.out.println("new position is : "+player2Pos);
				}
				break;
			case SNAKE :
				System.out.println("The option is : " + option+ "-SNAKE");
				if(player1) {
					player1Pos -= dValue;
					System.out.println("new position is : "+ player1Pos);
				}
				else {
					player2Pos -= dValue;
					System.out.println("new position is : "+ player2Pos);
				}
				break;
			default:
				System.out.println("The option is : " + option+"-NOPLAY");
				if(player1) System.out.println("new position is : "+ player1Pos );
				else  System.out.println("new position is : "+ player2Pos);
				
			}
			player1 = !player1;
			player2 = !player2;
			System.out.println();
		}
		
		System.out.println("Hurray "+ (player1Pos==100?"PLAYER1":"PLAYER2")+" has WON the game !!");
		System.out.println("The number of times the die was played : "+(player1Pos==100?player1Step:player2Step));
		System.out.println("*****POSTIONS*****");
		System.out.println("player1 current position :" + player1Pos);
		System.out.println("player2 current position :" + player2Pos);
	
	}

}
