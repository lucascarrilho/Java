package exo_Vehicule;

public class Moto extends Vehicule{
	private int id;
	private int nbr_Roue;
	private String type_Carburant;
	private int vitesse_max;
	
	public Moto() {
		super();
	}
	
	public Moto(int nbr_Roue, String type_Carburant, int vitesse_max) {
		this.id ++;
		this.nbr_Roue = nbr_Roue;
		this.type_Carburant = type_Carburant;
		this.vitesse_max = vitesse_max;
	}

	@Override
	public String toString() {
		return "Moto [id=" + id + ", nbr_Roue=" + nbr_Roue + ", type_Carburant=" + type_Carburant + ", vitesse_max="
				+ vitesse_max + "]";
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
