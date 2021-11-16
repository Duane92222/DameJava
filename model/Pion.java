package model;

public class Pion {

    int x,y;
	char couleur;




	public Pion(int x, int y, char couleur) {
		this.x = x;
		this.y = y;
		this.couleur = couleur;
	}



	public int getX() {
		return x;
	}



	public void setX(int x) {
		this.x = x;
	}



	public int getY() {
		return y;
	}



	public void setY(int y) {
		this.y = y;
	}



	public char getCouleur() {
		return couleur;
	}



	public void setCouleur(char nom) {
		this.couleur = nom;
	}

	
}