package minesweeper;

import java.util.*;


public class Minesweeper {
	
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenue ! Voici le celebre jeu du Demineur ! \n Veuillez entrez la taille du tableau : ");
		int taille = sc.nextInt();
		System.out.println("Veuillez entrer le nombre de mines :");
		int nbBombe = sc.nextInt();		
		System.out.println("\n Voici le tableau : \n \n");
		int x=0,y=0;
		boolean Gg = false, Perdu = false;
		Display.showWorldBeginning(taille);
		System.out.println("Veuillez entrer les coordonnées de la case à decouvrir : ");
		System.out.print("x=");
		x = sc.nextInt();
		System.out.println("y=");
		y = sc.nextInt();
		Plate P = new Plate(taille,nbBombe,x,y);
		Perdu = P.update(x,y);
		Display.showWorld(P);
		Gg=P.isWon();
		while(!Perdu && !Gg){
			System.out.println("Veuillez entrer les coordonnées de la case à decouvrir : ");
			System.out.print("x=");
			x = sc.nextInt();
			System.out.println("y=");
			y = sc.nextInt();
			Perdu = P.update(x,y);
			Display.showWorld(P);
			Gg=P.isWon();
		}
		sc.close();
		if(Gg)
			System.out.println("Bravo");
		if(Perdu)
			System.out.println("Grosse merde");
	}
	
}

