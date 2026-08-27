package org.tnsif.acc.c2tc.staticfinaldemo;

class Game{
	
	 static int maxLevel;
	 
	 static {
		 System.out.println("Intializing Game setting");
		 maxLevel=50;
	 }
	 void showLevelInfo()
	 {
		 System.out.println("Game has "+ maxLevel +" Levels");
	 }
}
public class StaticOnBlockDemo {

	public static void main(String[] args) {
		Game game=new Game();
		game.showLevelInfo();

	}

}
