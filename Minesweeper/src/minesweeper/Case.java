package minesweeper;

public class Case {
	private boolean bombe;
	private boolean hidden;
	private int nbBombsNear;
	
	/**
	 * @param bombe
	 * @param hidden
	 * @param nbBombsNear
	 */
	public Case(boolean bombe, boolean hidden, int nbBombsNear) {
		this.bombe = bombe;
		this.hidden = hidden;
		this.nbBombsNear = nbBombsNear;
	}
	
	/**
	 * @param bombe
	 */
	public Case(boolean bombe) {
		this.bombe = bombe;
		this.hidden = true;
	}
	
	/**
	 * 
	 */
	public Case() {
		this.bombe = false;
		this.hidden = true;
	}
	
	/**
	 * @return bombe
	 * True if the Case is a bomb
	 */
	public boolean isBombe() {
		return bombe;
	}
	
	/**
	 * Set bombe
	 * @param bombe
	 */
	public void setBombe(boolean bombe) {
		this.bombe = bombe;
	}
	
	/**
	 * 	Is the Case hidden ?
	 *  @return hidden
	 */
	public boolean isHidden() {
		return hidden;
	}
	
	/**
	 * Set if the Case is hidden
	 * @param hidden
	 */
	public void setHidden(boolean hidden) {
		this.hidden = hidden;
	}
	
	/**
	 * return the number of bombs near
	 * @return nbBombsNear
	 */
	public int getNbBombsNear() {
		return nbBombsNear;
	}
	
	/**
	 * Set the the number of bombs near
	 * @param nbBombsNear
	 */
	public void setNbBombsNear(int nbBombsNear) {
		this.nbBombsNear = nbBombsNear;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Case [bombe=" + bombe + ", hidden=" + hidden + ", nbBombsNear=" + nbBombsNear + "]";
	}
		
}
