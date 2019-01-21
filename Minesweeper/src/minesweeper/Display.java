package minesweeper;

public abstract class Display {
	
	/**
	 * Show the world
	 * @param P
	 */
	public static void showWorld (Plate P) {
		if(P.getLength()>10)
			System.out.print("  ");
		else
			System.out.print(" ");
		for (int i =0; i <P.getLength();i++){ //largeur
			if(P.getLength()>10&&i<10)
				System.out.print("  "+(i));
				else
					System.out.print(" "+(i));
		}
		System.out.println();
		for (int i = 0 ; i< P.getLength();i++){ //hauteur
			if(P.getLength()>10 && i<10)
				System.out.print(i+" ");
			else 
				System.out.print(i);
			for(int j = 0; j<P.getLength(); j++)  {// largeur 
				if(P.getLength()>10){
				if(P.getWorld()[i][j].isHidden()){
					System.out.print("  C");
				}else if(P.getWorld()[i][j].isBombe()){
					System.out.print("  X");
				}else{
					System.out.print("  " + P.getWorld()[i][j].getNbBombsNear());
				}
				}else{
					if(P.getWorld()[i][j].isHidden()){
						System.out.print(" C");
					}else if(P.getWorld()[i][j].isBombe()){
						System.out.print(" X");
					}else{
						System.out.print(" " + P.getWorld()[i][j].getNbBombsNear());
					}
				}
			
			}
		System.out.println();
		
		}
	}
	
	/**
	 * Show the end world
	 * @param P
	 */
	public static void showEndWorld (Plate P) {
		System.out.print(" ");
		for (int i =0; i <P.getLength();i++){
			System.out.print(" "+(i));
		}
		System.out.println();
		for (int i = 0 ; i< P.getLength();i++){
			System.out.print(i);
			for(int j = 0; j<P.getLength(); j++)  {
				if(P.getWorld()[i][j].isBombe()){
					System.out.print(" X");
				}else{
					System.out.print(" " + P.getWorld()[i][j].getNbBombsNear());
				}
			
			}
		System.out.println();
		
		}
	}
	
	/**
	 * Show the beginning world
	 * @param Length
	 */
	public static void showWorldBeginning (int Length) {
		if(Length>10)
			System.out.print("  ");
		else
			System.out.print(" ");
			
		for (int i =0; i <Length;i++){
			if(Length>10&&i<10)
			System.out.print("  "+(i));
			else
				System.out.print(" "+(i));
		}
		System.out.println();
		for (int i = 0 ; i< Length;i++){
			if(Length>10 && i<10)
				System.out.print(i+" ");
			else 
				System.out.print(i);
				
			for(int j = 0; j<Length; j++)  {
				if(Length>10)
				System.out.print("  C");
				else
					System.out.print(" C");
			}
		System.out.println();
		
		}
	}
}
