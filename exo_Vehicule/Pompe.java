package exo_Vehicule;

public class Pompe {
	private String typeCarburant;
	private int contenance;
	private int contenu;
	
	public Pompe() {
		super();
	}

	public Pompe(String typeCarburant, int contenance, int contenu) {
		this.typeCarburant = typeCarburant;
		this.contenance = contenance;
		this.contenu = contenu;
	}

	@Override
	public String toString() {
		return "Pompe [typeCarburant=" + typeCarburant + ", contenance=" + contenance + ", contenu=" + contenu + "]";
	}
	
}
