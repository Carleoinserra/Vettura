
public class Officina {
	
	public int ripara(Vettura v1) {
		int costo = 0;
		if (v1.isGuasto() == true) {
			
			costo += 50;
			
			
			if (v1.tipologia.equalsIgnoreCase("utilitaria")) {
				
				costo += 50;
			}
			else if (v1.tipologia.equalsIgnoreCase("suv")) {
				
				costo += 100;
			}
		}
		
		else costo += 20;
		
		
		return costo;
		
		
		
	}
 public int ripara(Motociclo v2) {
	 
		int costo = 0;
		if (v2.isGuasto() == true) {
			
			costo += 50;
				System.out.println("ciao sono un moto");
			
			if (v2.cilindrata == 500) {
				
				System.out.println("ciao");
				
				costo += 50;
			}
			else if (v2.cilindrata == 1000) {
				
				costo += 100;
			}
		}
		
		else costo += 20;
		
		
		return costo;
		
		
		
		
		
		
	}

	
}
