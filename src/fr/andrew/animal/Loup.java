package fr.andrew.animal;

public class Loup extends Animal{

	public Loup() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Loup(String nom, double taille, double poids, String race, String couleur) {
		super(nom, taille, poids, race, couleur);
	}
	
	public void hurler () {
		System.out.println(this.getNomAnimal()+ " Hurle");
	}
	
	public void mordre () {
		System.out.println(this.getNomAnimal()+ " Mord");
	}
}
