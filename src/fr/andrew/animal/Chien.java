package fr.andrew.animal;

public class Chien extends Animal{
	
	public Chien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Chien(String nom, double taille, double poids, String race, String couleur) {
		super(nom, taille, poids, race, couleur);
	}

	public void aboyer () {
		System.out.println(this.getNomAnimal()+ " Aboie");
	}
	
	public void mordre() {
		System.out.println(this.getNomAnimal()+ " Mord");
	}
	
}
