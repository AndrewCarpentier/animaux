package fr.andrew.animal;

public class Lapin extends Animal{

	public Lapin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lapin(String nom, double taille, double poids, String race, String couleur) {
		super(nom, taille, poids, race, couleur);
	}

	public void couiner () {
		System.out.println(this.getNomAnimal()+ " Couine");
	}
	
}
