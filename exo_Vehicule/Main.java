package exo_Vehicule;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicule v1 = new Vehicule();
		Voiture vo1 = new Voiture();
		Moto m1 = new Moto();
		Voiture vo2 = new Voiture(4,"Essence",180,100,55);
		Voiture vo3 = new Voiture(4,"Diesel",350,100,54);
		Moto m2 = new Moto(2,"Diesel",160,80,65);
		
		System.out.println(vo3);
		System.out.println(m2);
	}

}
