package application;

import nombreComplexe.Complexe;

public class TestComplexe {

	public static void main(String[] args) {
		// instanciers la classe Complexe
		Complexe c1 = new Complexe(2, 2);
		Complexe c2 = new Complexe(-3, 4);
	
		//appeler les méthodes
		//Complexe c3 = c1.plus(c2);
		System.out.println(c1.plus(c2));
		System.out.println(c1.moins(c2));
	}
}
