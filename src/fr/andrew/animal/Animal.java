package fr.andrew.animal;

public class Animal {

	protected String nomAnimal;
	protected double tailleAnimal;
	protected double poidsAnimal;
	protected String raceAnimal;
	protected String couleurAnimal;
	
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Animal(String nom, double taille, double poids, String race, String couleur) {
		super();
		this.nomAnimal = nom;
		this.tailleAnimal = taille;
		this.poidsAnimal = poids;
		this.raceAnimal = race;
		this.couleurAnimal = couleur;		
	}
	
	public void manger() {
		System.out.println(this.nomAnimal+ " Mange");
	}
	
	public void dormir() {
		System.out.println(this.nomAnimal+ " Dors");
	}
	
	public void jouer() {
		System.out.println(this.nomAnimal+ " Joue");
	}

	
	//getter setter
	public String getNomAnimal() {
		return nomAnimal;
	}

	public void setNomAnimal(String nomAnimal) {
		this.nomAnimal = nomAnimal;
	}

	public double getTailleAnimal() {
		return tailleAnimal;
	}

	public void setTailleAnimal(double tailleAnimal) {
		this.tailleAnimal = tailleAnimal;
	}

	public double getPoidsAnimal() {
		return poidsAnimal;
	}

	public void setPoidsAnimal(double poidsAnimal) {
		this.poidsAnimal = poidsAnimal;
	}

	public String getRaceAnimal() {
		return raceAnimal;
	}

	public void setRaceAnimal(String raceAnimal) {
		this.raceAnimal = raceAnimal;
	}

	public String getCouleurAnimal() {
		return couleurAnimal;
	}

	public void setCouleurAnimal(String couleurAnimal) {
		this.couleurAnimal = couleurAnimal;
	}
	
	
}
