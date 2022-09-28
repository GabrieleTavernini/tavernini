
package persona;

/**
 * La classe persona definisce alcune caratteristiche e comportamenti di un 
 * essere umano
 * 
 * @author gabriele.tavernini 4INC 2022/2023
 * @version 1.0 del 28/09/2022
 */
public class Persona {

    public Double altezza;
    public String cognome;
    public String dataDiNascita;
    public String nome;
    public Float peso;

    /**
    * Costruttore della classe Persona senza parametri Per impostare i
    * parametri si possono usare i seguenti metodi:
    * {@link #setAltezza(Double altezza)} <br>
    * {@link #setCognome(String cognome)} <br> {@link #setNome(String nome)}
    * <br> {@link #setPeso(Float peso)} <br>
    * {@link #setDataDiNascita(String dataDiNascita)}
     */
    public Persona() {
    }
    
    /**
     * costruttore della classe Persona con parametri
     * 
     * @param altezza
     * @param cognome
     * @param dataDiNascita
     * @param nome
     * @param peso 
     */
    
    public Persona(Double altezza, String cognome, String dataDiNascita, String nome, Float peso) {
        this.altezza = altezza;
        this.cognome = cognome;
        this.dataDiNascita = dataDiNascita;
        this.nome = nome;
        this.peso = peso;
    }
    
    /**
     * Restituisce l'altezza di una persona
     * 
     * @return altezza
     */

    public Double getAltezza() {
        return altezza;
    }
    
    
    /**
     * Imposta l'altezza di una persona
     * 
     * @param altezza Altezza
     */
    public void setAltezza(Double altezza) {
        this.altezza = altezza;
    }

    /**
     * Restituisce il cognome di una persona
     * 
     * @return cognome
     */
    public String getCognome() {
        return cognome;
    }
    
    /**
     * Imposta il cognome di una persona
     * 
     * @param cognome Cognome 
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    
    /**
     * Restituisce la data di nascita di una persona
     * 
     * @return dataDiNascita
     */
    public String getDataDiNascita() {
        return dataDiNascita;
    }
    
    /**
     * Imposta la data di nascita di una persona
     * 
     * @param dataDiNascita DataDiNascita
     */
    public void setDataDiNascita(String dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }
    
    /**
     * Restituisce il nome di una persona
     * 
     * @return nome
     */
    public String getNome() {
        return nome;
    }
    
    /**
     * Imposta il nome di una persona
     * 
     * @param nome Nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Restituisce il peso di una persona
     * 
     * @return peso
     */
    public Float getPeso() {
        return peso;
    }

    /**
     * Imposta il peso di una persona
     * 
     * @param peso Peso
     */
    public void setPeso(Float peso) {
        this.peso = peso;
    }
    /**
     * Restituisce il riepilogo di una persona
     * 
     * @return Riepilogo caratteristiche
     */
    public String info(){
        String info;
        
        info =    "Cognome        :" + this.cognome       +"\n"
                + "Nome           :" + this.nome          +"\n"
                + "Altezza        :" + this.altezza       +"\n"
                + "peso           :" + this.peso          +"\n"
                + "Data di nascita:" + this.dataDiNascita +"\n";
        
        return info;
    
    
    }

    
}
