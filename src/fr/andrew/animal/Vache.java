package fr.andrew.animal;

public class Vache extends Animal{

	public Vache() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vache(String nom, double taille, double poids, String race, String couleur) {
		super(nom, taille, poids, race, couleur);
	}
	
	public void beugler () {
		System.out.println(this.getNomAnimal()+ " Beugle");
	}
	
}
