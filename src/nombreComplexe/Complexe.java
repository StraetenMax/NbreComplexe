package nombreComplexe;

public class Complexe {
		//propriétés
	private int partieReele;
	private int partieImaginaire;
	
	//constructeurs vide initialisé
	public Complexe(){
		partieReele = 0;
		partieImaginaire = 0;
	}
	public Complexe(int partieReele, int partieImaginaire){
		this.partieReele = partieReele;
		this.partieImaginaire = partieImaginaire;
	}
}
