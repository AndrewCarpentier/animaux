package fr.andrew.animal;

public class Cheval extends Animal{
	
	public Cheval() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cheval(String nom, double taille, double poids, String race, String couleur) {
		super(nom, taille, poids, race, couleur);
	}

	public void hennir () {
		System.out.println(this.getNomAnimal()+ " Henni");
	}
	
	public void frapper () {
		System.out.println(this.getNomAnimal()+ " Frappe");
	}

}
