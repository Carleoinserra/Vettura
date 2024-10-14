import java.util.ArrayList;
import java.util.Random;
//per generare randomicamente i veicoli guasti 
public class UsaVeicolo {
	
	public static void main(String[] args) {
		
		//String targa, String marca, String modello,, String tipologia
		Vettura v1= new Vettura("bh123t2", "opel","corsa", "utilitaria");
		Vettura v2= new Vettura("sn123ui", "volkswaken","T rock", "suv");
		Vettura v3= new Vettura("lr123dk", "ferrari","enzo", "Sogno");
		
		//creo dei motocicli
		//(String targa, String marca, String modello, , int clindrata)
		
		Motociclo m1= new Motociclo("we234io", "ducati","998",500);
		Motociclo m2= new Motociclo("wl234eo", "honda","hornet",1000);
		Motociclo m3= new Motociclo("Vl234er", "piaggio","Vespa",500);
		
		//ora camnbio lo stato di guasto ad alcuni veicoli  cambiaStatoGuasto
				v1.cambiaStatoGuasto();
				m3.cambiaStatoGuasto();
				
		//potreu fare un random che mi guasta numeri a caso
				
		ArrayList<Veicolo> listaVeicoli= new ArrayList<>();
		listaVeicoli.add(v1);
		listaVeicoli.add(v2);
		listaVeicoli.add(v3);
		listaVeicoli.add(m1);
		listaVeicoli.add(m2);
		listaVeicoli.add(m3);
		
		Officina f1 = new Officina();
		
		
		
		
		
		
		
		//il programma stampa la targa dei veicoli guasti . con boolean true 
		
		  // Guasta un numero casuale di veicoli
//        int numGuasti = random.nextInt(listaVeicoli.size()) + 1; // Numero casuale di veicoli da guastare (da 1 a listaVeicoli.size())
//        
//        // Guasta i veicoli selezionati casualmente
//        for (int i = 0; i < numGuasti; i++) {
//            int index = random.nextInt(listaVeicoli.size()); // Seleziona un indice casuale
//            Veicolo veicoloDaGuastare = listaVeicoli.get(index); // Ottieni il veicolo corrispondente
//            veicoloDaGuastare.setGuasto(true); // Imposta il veicolo come guasto
//            System.out.println("Il veicolo con targa " + veicoloDaGuastare.getTarga() + " è diventato guasto.");
//        }
//
//		
		for (Veicolo Vei : listaVeicoli) {
			// se il veicolo è un istanza di vettura
			// siamo sicuri che il veicolo è una vettura e quindi possiamo fargli un cast
			if (Vei instanceof Vettura) {
				
				System.out.println("Costo riparazione "+  f1.ripara((Vettura)Vei) + " euro");
			}
			else if (Vei instanceof Motociclo) {
				
				System.out.println("Costo riparazione "+  f1.ripara((Motociclo)Vei) + " euro");
			}
				
			
		}
		

	}

}
