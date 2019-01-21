package demineur;

public class Display {
	
	/**
	 * Show the end world
	 * @param t
	 * @param t2
	 */
	public static String showWorldBeginning (int t, int t2) {
		String s = "";
		if(t2>10){
			s +=("    ");
		}else{
			s +=("  ");
		}
		for (int i =0; i < t;i++){ //largeur
			if(t>10&&i<10)
				s +=("   "+(i));
				else
					s +=(" "+(i));
		}
		s += "\n";
		for (int i = 0 ; i< t2;i++){ //hauteur
			if(t2>10 && i<10)
				s +=(i+"  ");
			else
				s +=(i);
			for(int j = 0; j<t; j++)  {// largeur 
				if(t>10){
					s +=("   X");
				}else{
						s +=(" X");
					}
				
				}
				s += "\n";
			}
		return s;
	}
	
	/**
	 * Show the world
	 * @param P
	 */
	public static String showWorld (Plate P) {
		String s = "";
		if(P.getHeight()>10){
			s +=("    ");
		}else{
			s +=("  ");
		}
		for (int i =0; i <P.getLength();i++){ //largeur
			if(P.getLength()>10&&i<10)
				s +=("   "+(i));
				else
					s +=(" "+(i));
		}
		s += "\n";
		for (int i = 0 ; i< P.getHeight();i++){ //hauteur
			if(P.getLength()>10 && i<10)
				s +=(i+"  ");
			else
				s +=(i);
			for(int j = 0; j<P.getLength(); j++)  {// largeur 
				if(P.getLength()>10){
					if(P.getWorld()[i][j].isHidden()){
						s +=("   X");
					}else if(P.getWorld()[i][j].isBombe()){
						s +=("   B");
					}else{
						s +=("   " + P.getWorld()[i][j].getNbBombsNear());
					}
					}else{
						if(P.getWorld()[i][j].isHidden()){
							s +=(" X");
						}else if(P.getWorld()[i][j].isBombe()){
							s +=(" B");
						}else{
							s +=(" " + P.getWorld()[i][j].getNbBombsNear());
						}
					}
				
				}
				s += "\n";
			}
		return s;
		}
	
	/**
	 * Show the end world
	 * @param P
	 */
	public static String showEndWorld (Plate P) {
		String s = "";
		if(P.getHeight()>10){
			s +=("    ");
		}else{
			s +=("  ");
		}
		for (int i =0; i <P.getLength();i++){ //largeur
			if(P.getLength()>10&&i<10)
				s +=("   "+(i));
				else
					s +=(" "+(i));
		}
		s += "\n";
		for (int i = 0 ; i< P.getHeight();i++){ //hauteur
			if(P.getLength()>10 && i<10)
				s +=(i+"  ");
			else
				s +=(i);
			for(int j = 0; j<P.getLength(); j++)  {// largeur 
				if(P.getLength()>10){
					if(P.getWorld()[i][j].isBombe()){
						s +=("   B");
					}else{
						s +=("   " + P.getWorld()[i][j].getNbBombsNear());
					}
					}else{
						if(P.getWorld()[i][j].isBombe()){
							s +=(" B");
						}else{
							s +=(" " + P.getWorld()[i][j].getNbBombsNear());
						}
					}
				
				}
				s += "\n";
			}
		return s;
		}
}
