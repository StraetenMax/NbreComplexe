package application;

import nombreComplexe.Complexe;

public class TestComplexe {

	public static void main(String[] args) {
		// instanciers la classe Complexe
		Complexe c1 = new Complexe(2, 2);
		Complexe c2 = new Complexe(-3, 4);
	
		//appeler les méthodes
		Complexe c3 = c1.plus(c2);
		Complexe c4 = c1.moins(c2);
		Complexe c5 = c3.plus(c4);
		Complexe c6 = c3.moins(c4);
		//System.out.println(c1.plus(c2));
		//System.out.println(c1.moins(c2));
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(c1);
		System.out.println(c2);
			
	}
}
