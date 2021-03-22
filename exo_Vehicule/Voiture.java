package exo_Vehicule;

public class Voiture extends Vehicule{
	private int id;
	private int nbr_Roue;
	private String type_Carburant;
	private int vitesse_max;
	private int contenanceReservoir;
	private int contenuReservoir;

	public Voiture( ) {
		super();
	}
	
	@Override
	public String toString() {
		return "Voiture [id=" + id + ", nbr_Roue=" + nbr_Roue + ", type_Carburant=" + type_Carburant + ", vitesse_max="
				+ vitesse_max + "]";
	}

	public Voiture(int nbr_Roue, String type_Carburant, int vitesse_max) {
		super();
		this.id ++;
		this.nbr_Roue = nbr_Roue;
		this.type_Carburant = type_Carburant;
		this.vitesse_max = vitesse_max;
	}

	public Voiture(int nbr_Roue, String type_Carburant, int vitesse_max,int contenanceReservoir,int contenuReservoir) {
		super();
		this.id ++;
		this.nbr_Roue = nbr_Roue;
		this.type_Carburant = type_Carburant;
		this.vitesse_max = vitesse_max;
		this.contenanceReservoir = contenanceReservoir;
		this.contenuReservoir = contenuReservoir;
	}
	
	public int getNbr_Roue() {
		return nbr_Roue;
	}

	public String getType_Carburant() {
		return type_Carburant;
	}


	public int getVitesse_max() {
		return vitesse_max;
	}



}
