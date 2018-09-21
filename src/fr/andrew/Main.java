package fr.andrew;

import fr.andrew.animal.Animal;
import fr.andrew.animal.Chat;
import fr.andrew.animal.Cheval;
import fr.andrew.animal.Chien;
import fr.andrew.animal.Lapin;
import fr.andrew.animal.Loup;
import fr.andrew.animal.Vache;

public class Main {

	public static void main(String[] args) {

		System.out.println("----Chien----");
		Chien chien = new Chien("Iago", 55, 40, "labrador", "sable");
		Animal chien2 = new Chien("Rex", 40, 30, "bulldog", "blanc");
		System.out.println("nom du chien " +chien.getNomAnimal());
		chien.dormir();
		chien.manger();
		chien.jouer();
		chien.aboyer();
		Chien chien3 = (Chien) chien2;
		chien3.aboyer();
		((Chien) chien2).aboyer();
		System.out.println("Si on additionne le poid de " +chien.getNomAnimal()+ " et le poid de " +chien2.getNomAnimal()+ " on obtient un total de " +(chien.getPoidsAnimal() + chien2.getPoidsAnimal())+ "kg");
				
		System.out.println("\n----Chat----");
		Chat chat = new Chat("Oreo", 30, 5, "bleu russe", "noir tacheté blanc");
		System.out.println("nom du chat " +chat.getNomAnimal());
		chat.dormir();
		chat.manger();
		chat.jouer();
		chat.miauler();
		chat.griffer();		
		
		System.out.println("\n----Cheval----");
		Cheval cheval = new Cheval("Jack", 190, 950, "pure-sang", "marron");
		System.out.println("nom du cheval " +cheval.getCouleurAnimal());
		cheval.dormir();
		cheval.manger();
		cheval.jouer();
		cheval.hennir();
		cheval.frapper();
		
		System.out.println("\n----Vache----");
		
		Vache vache = new Vache("Oscar", 135, 700, "angus", "noir");
		System.out.println("nom de la vache " +vache.getCouleurAnimal());
		vache.dormir();
		vache.beugler();
		vache.manger();
		vache.jouer();
		
		System.out.println("\n----Loup----");
		
		Loup loup = new Loup("Wolfy", 90, 70, "loup gris", "gris");
		System.out.println("nom du loup " +loup.getCouleurAnimal());
		loup.dormir();
		loup.manger();
		loup.hurler();
		loup.jouer();
		loup.mordre();
		
		System.out.println("\n----Lapin----");
		
		Lapin lapin = new Lapin("Biscotte", 10, 1.5, "nain belier", "marron");
		System.out.println("nom du lapin " +lapin.getCouleurAnimal());
		lapin.dormir();
		lapin.manger();
		lapin.jouer();
		lapin.couiner();
		
	}

}
