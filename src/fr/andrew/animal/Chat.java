package fr.andrew.animal;

public class Chat extends Animal{
			
	public Chat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Chat(String nom, double taille, double poids, String race, String couleur) {
		super(nom, taille, poids, race, couleur);
	}
	
	public void miauler () {
		System.out.println(this.getNomAnimal()+ " Miaule");
	}
	
	public void griffer() {
		System.out.println(this.getNomAnimal()+ " Griffe");
	}

}
