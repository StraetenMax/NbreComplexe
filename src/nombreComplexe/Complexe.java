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
 	// accesseurs et mutateurs
	public int getPartieReele(){
		return partieReele;
	}
	public int getPartieImaginaire(){
		return partieImaginaire;
	}
	public void setPartieReele(int partieReele){
		this.partieReele = partieReele;
	}
	public void setPartieImaginaire(int partieImaginaire){
		this.partieImaginaire = partieImaginaire;
	}
	// méthodes
	public Complexe plus(Complexe c){
		return new Complexe(this.partieReele + c.partieReele , this.partieImaginaire + c.partieImaginaire);
	}
	public Complexe moins(Complexe c){
		return new Complexe(this.partieReele - c.partieReele , this.partieImaginaire - c.partieImaginaire);
	}
	
	public String toString() {
		if (partieImaginaire > 0)
			return this.partieReele + " + " + this.partieImaginaire + " i";
		else if (partieImaginaire < 0)
			return this.partieReele + " " + this.partieImaginaire + " i";
		else
			return this.partieReele + "";
	}
	
}