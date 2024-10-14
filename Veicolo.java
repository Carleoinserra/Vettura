//2. Scrivere una classe Veicolo che prevede una targa, una marca e un modello.
//La classe prevede anche una variabile booleana che descrive se il veicolo ` e guasto.
//Aggiungere un costruttore opportuno e vari metodi get e set opportuni. 
//Scrivere la classi Vettura e Motociclo che estendono la classe Veicolo. 
//La classe Vettura prevede una stringa che ne descrive la tipologia
//("utilitaria","station wagon", "SUV",....) mentre la classe Motociclo prevede un numero che ne descrive la cilindrata (50, 125, ....). 
//Per testare le classi, scrivere un programma UsaVeicoli che crea un array inizializzato con veicoli delle varie tipologie. Alcuni dei veicoli inseriti nell’array dovranno diventare guasti.
//Il programma deve stampare la lista delle targhe dei veicoli guasti.
public class Veicolo {
    private String targa;
    private String marca;
    private String modello;
    private boolean guasto; // Indica se il veicolo è guasto

    // Costruttore con guasto impostato a false di default
    public Veicolo(String targa, String marca, String modello) {
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
        this.guasto = false; // Imposta guasto a false di default
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public boolean isGuasto() {
        return guasto;
    }

    public void setGuasto(boolean guasto) {
        this.guasto = guasto;
    }

               // Metodo per alternare lo stato guasto
    public void cambiaStatoGuasto() {
        this.guasto = !this.guasto; 
        
        // Cambia il valore attuale di guasto
    }

    @Override
    public String toString() {
        return "Veicolo [targa=" + targa + ", marca=" + marca + ", modello=" + modello + ", guasto=" + guasto + "]";
    }
}

