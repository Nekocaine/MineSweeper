package minesweeper;

public class Plate {
	private int length;
	private int nbBombs;
	private int nbHiddenCases;
	private Case[][] world;
	

	/**
	 * 
	 */
	public Plate() {
		this.length = 9;
		this.nbBombs = 10;
		this.world = new Case[length][length];
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				world[j][i] = new Case();
			}
		}
		this.nbHiddenCases = length * length;
		int xr,yr;
		for (int i = 0; i < nbBombs; i++) {
			do {
				xr = (int)(Math.random()*(length));
				yr = (int)(Math.random()*(length));
			} while (world[yr][xr].isBombe());
			world[yr][xr].setBombe(true);
		}
		iniNbBombsNear();
	}
	
	/**
	 * @param length
	 */
	public Plate(int length) {
		this.length = length;
		this.nbBombs = (int)(length*length/(6.4));
		this.world = new Case[length][length];
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				world[j][i] = new Case();
			}
		}
		this.nbHiddenCases = length * length;
		int xr,yr;
		for (int i = 0; i < nbBombs; i++) {
			do {
				xr = (int)(Math.random()*(length));
				yr = (int)(Math.random()*(length));
			} while (world[yr][xr].isBombe());
			world[yr][xr].setBombe(true);
		}
		iniNbBombsNear();
	}

	/**
	 * @param length
	 * @param nbBombs
	 */
	public Plate(int length, int nbBombs) {
		this.length = length;
		this.nbBombs = nbBombs;
		this.world = new Case[length][length];
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				world[j][i] = new Case();
			}
		}
		this.nbHiddenCases = length * length;
		int xr,yr;
		for (int i = 0; i < nbBombs; i++) {
			do {
				xr = (int)(Math.random()*(length));
				yr = (int)(Math.random()*(length));
			} while (world[yr][xr].isBombe());
			world[yr][xr].setBombe(true);
		}
		iniNbBombsNear();
	}
	
	/**
	 * @param length
	 * @param nbBombs
	 */
	public Plate(int length, int nbBombs, int x, int y) {
		this.length = length;
		this.nbBombs = nbBombs;
		this.world = new Case[length][length];
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				world[j][i] = new Case();
			}
		}
		this.nbHiddenCases = length * length;
		int xr,yr;
		for (int i = 0; i < nbBombs; i++) {
			do {
				xr = (int)(Math.random()*(length));
				yr = (int)(Math.random()*(length));
			} while (xr>=x-1 && xr<=x+1 && yr>=y-1 && yr<=y+1 || world[yr][xr].isBombe());
			world[yr][xr].setBombe(true);
		}
		iniNbBombsNear();
	}

	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * Set the length
	 * @param length
	 */
	public void setLength(int length) {
		this.length = length;
	}

	/**
	 * return the number of bombs
	 * @return nbBombs
	 */
	public int getNbBombs() {
		return nbBombs;
	}

	/**
	 * Set the numner of bombs
	 * @param nbBombs
	 */
	public void setNbBombs(int nbBombs) {
		this.nbBombs = nbBombs;
	}

	/**
	 * @return world
	 */
	public Case[][] getWorld() {
		return world;
	}

	/**
	 * Set the world
	 * @param world
	 */
	public void setWorld(Case[][] world) {
		this.world = world;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Plateau [length=" + length + ", nbBombs=" + nbBombs + "]";
	}
	
	// Set nbBombsNear attribute of each Case
	private void iniNbBombsNear() {
		int c;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				c = 0;
				for (int k = (i-1 < 0)? 0 : i-1; k < ((i+2 > length)? length : i+2); k++) {
					for (int l = (j-1 < 0)? 0 : j-1; l < ((j+2 > length)? length : j+2); l++) {
						if(world[l][k].isBombe()){
							c++;
						}
					}
				}
				world[j][i].setNbBombsNear(c);
			}
		}
	}
	
	// Show the target and return true if it's a bomb
	public boolean update(int x, int y){
		if(world[y][x].isHidden()){
			world[y][x].setHidden(false);
			nbHiddenCases--;
			if(world[y][x].isBombe()){
				return true;
			}else{
				decouvrir(x,y);
			}
		}
		return false;
	}
	
	// Shows empty cases around the target
	private void decouvrir(int x, int y){
		if(world[y][x].isHidden()){
			world[y][x].setHidden(false);
			nbHiddenCases--;
		}
		if(world[y][x].getNbBombsNear() == 0){
			for (int i = (x-1 < 0)? 0 : x-1; i < ((x+2 > length)? length : x+2); i++) {
				for (int j = (y-1 < 0)? 0 : y-1; j < ((y+2 > length)? length : y+2); j++) {
					if(world[j][i].isHidden()){
						decouvrir(i,j);
					}
				}
			}
		}
	}
	
	// Return true if you have won
	public boolean isWon(){
		return (nbHiddenCases == nbBombs)? true : false;
	}
	
}

