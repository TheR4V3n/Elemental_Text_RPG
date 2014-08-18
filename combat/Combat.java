package combat;

import java.util.Scanner;

import characters.*;
import elemental.Elemental;

public class Combat {
	
	static Scanner scan = new Scanner(System.in);
	static String placeholder;
	
	public static void beginCombat(Player player, Enemy enemy) {
		System.out.println("You are suddenly challenged to a Elemental Match by " + enemy.getCharacterName());
		
		placeholder = scan.next();
		
		printBattleStats(player, enemy);
	}
	
	public void turnChoices(Player player, Enemy enemy) {
		printBattleStats(player, enemy);
	}
	
	//Prints Stats of both Enemy and Player
	public static void printBattleStats(Player player, Enemy enemy) {
		Elemental playerElemental = player.getActiveElemental();
		Elemental enemyElemental = enemy.getActiveElemental();
		
		//Prints Enemy stats
		System.out.println(enemy.getCharacterName());
		System.out.println("Life " + enemy.getCurHealth());
		System.out.println();
		System.out.println(enemyElemental.getElementalName());
		System.out.println("Health  " + enemyElemental.getCurHealth());
		System.out.println("Attack  " + enemyElemental.getCurAttack());
		System.out.println("Defense " + enemyElemental.getCurDefense());
		
		System.out.println();
		System.out.println();
		
		//Prints Player Stats
		System.out.println(player.getCharacterName());
		System.out.println("Life " + player.getCurHealth());
		System.out.println();
		System.out.println(playerElemental.getElementalName());
		System.out.println("Health  " + playerElemental.getCurHealth());
		System.out.println("Attack  " + playerElemental.getCurAttack());
		System.out.println("Defense " + playerElemental.getCurDefense());
	}
	
}
