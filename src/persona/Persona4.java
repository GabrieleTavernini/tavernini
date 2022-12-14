package persona;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 * La classe Persona1 definisce alcune caratteristiche di un essere umano
 *
 * @author gabriele.tavernini
 * @version 3.0 19/10/2022
 */
public class Persona4 {

    private Double altezza;
    private String cognome;
    private String nome;
    private Float peso;
    private String dataDiNascita;
    
    private static int numeroistanze;

    /**
     * Costruttore della classe Persona senza parametri
     */
    public Persona4() {
        numeroistanze++;
    }

    /**
     * Costruttore della classe Presona con parametri
     *
     * @param altezza Altezza
     * @param cognome Cognome
     * @param dataDiNascita data di nascita
     * @param nome Nome
     * @param peso Peso
     * 
     */
    public Persona4(Double altezza, String cognome,String dataDiNascita, String nome, Float peso) {
        setAltezza(altezza);
        setCognome(cognome);
        setDataDiNascita(dataDiNascita);
        setNome(nome);
        setPeso(peso);
        numeroistanze++;
    }
    
    public Persona4 (Persona4 p){
        
        this.altezza = altezza;
        this.cognome = cognome;
        this.dataDiNascita = dataDiNascita;
        this.nome = nome;
        this.peso = peso;
    
    }

    /**
     * Restituisce l'altezza della persona
     *
     * @return altezza
     */
    public Double getAltezza() {
        return altezza;
    }

    /**
     * Imposta il valore dell'altezza della persona
     *
     * @param altezza Altezza
     */
    public void setAltezza(Double altezza) {
        Integer eta = calcoloEta(dataDiNascita);
        if(eta<=10)        
            if(altezza<=1 && altezza>=0.5)
                this.altezza = altezza;
            else
                this.altezza = null;
        else if(eta>10)
            if(altezza>1 && altezza<=2)
                this.altezza = altezza;
            else
                this.altezza = null;
    }

    /**
     * Restituisce il cognome della persona
     *
     * @return cognome
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * Imposta il cognome della persona
     *
     * @param cognome Cognome
     */
    public void setCognome(String cognome) {
        for(int i =0; i<cognome.length();i++){
        if(cognome.charAt(i)>=97 && cognome.charAt(i)<=122 )
            this.cognome =  cognome;
        else
            this.cognome = null;
        }
    }

    /**
     * Restituisce il nome della persona
     *
     * @return nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Imposta il nome della persona
     *
     * @param nome Nome
     */
    public final void setNome(String nome) {
        if(nome != null && (int)nome.charAt(0)>=65 && (int)nome.charAt(0)<=90)
            for(int i=0; i<nome.length();i++)
                if(nome.charAt(i) == (char)255 && (int)nome.charAt(i+1)<65 && (int)nome.charAt(i+1)>90){
                    this.nome = null;
                    break;
                }else
                    this.nome = nome;
        else
            this.nome = null;
   
    }

    /**
     * Restituisce il peso della persona
     *
     * @return peso
     */
    public Float getPeso() {
        return peso;
    }

    /**
     * Imposta il peso della persona
     *
     * @param peso Peso
     */
    public void setPeso(Float peso) {
        int randomNum1 = (int)(Math.random() * 100)+1;
        int randomNum2 = (int)(Math.random() * 100)+1;
        
        if(peso>randomNum1 && peso<randomNum2)
            this.peso = peso;
        else
            this.peso = null;
    }

    /**
     * Restituisce la data di nascita della persona
     *
     * @return dataDiNascita
     */
    final public String getDataDiNascita() {
        return dataDiNascita;
    }

    /**
     * Imposta la data di nascita della persona
     *
     * @param dataDiNascita DataDiNascita
     */
    final public void setDataDiNascita(String dataDiNascita) {
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendario = Calendar.getInstance();
        Date dateObj = calendario.getTime();
        String dataOggi = formato.format(dateObj);
        String []doggi = dataOggi.split("/");

        Boolean valida = false;
        String[] d = dataDiNascita.split("/");
        Integer data[] = new Integer[d.length];
        
        for (int i = 0; i < d.length; i++) {
            data[i] = Integer.valueOf(d[i]);
        }

        if (data[2] >= 0 && data[2] <= Integer.valueOf(doggi[2])) {
            if(data[1] >= 0 && data[1] < Integer.valueOf(doggi[1])){
                
                    
                     switch (data[1]) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (data[0] >= 1 && data[0] <= 31) {
                        valida = true;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (data[0] >= 1 && data[0] <= 30) {
                        valida = true;
                    }
                    break;
                case 2:
                    if (data[2] % 400 == 0 || data[2] % 4 == 0 && data[2] % 100 != 0) {
                        if (data[0] >= 1 && data[0] <= 29) {
                            valida = true;
                        }

                    } else {
                        if (data[0] >= 1 && data[0] <= 28) {
                            valida = true;
                        }
                    }
                    break;
                default:
                    valida = false;
                     }
                     

        
        
        }
        if (valida == true) {
            this.dataDiNascita = dataDiNascita;
        }else{
            this.dataDiNascita = null;
        }
    }else if(data[1] >= 0 && data[1] == Integer.valueOf(doggi[1])){
        if(data[0] >= 0 && data[0] <= Integer.valueOf(doggi[0])){
            switch (data[1]) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (data[0] >= 1 && data[0] <= 31) {
                        valida = true;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (data[0] >= 1 && data[0] <= 30) {
                        valida = true;
                    }
                    break;
                case 2:
                    if (data[2] % 400 == 0 || data[2] % 4 == 0 && data[2] % 100 != 0) {
                        if (data[0] >= 1 && data[0] <= 29) {
                            valida = true;
                        }

                    } else {
                        if (data[0] >= 1 && data[0] <= 28) {
                            valida = true;
                        }
                    }
                    break;
                default:
                    valida = false;
                     }
                     

        
        
        }
        if (valida == true) {
            this.dataDiNascita = dataDiNascita;
        }else{
            this.dataDiNascita = null;
        }
    }
    }
    

    public static int getNumeroistanze() {
        return numeroistanze;
    }
    
    

    /**
     * Restituisce le informazione legate alla persona
     *
     * @return Riepilogo Caratteristiche
     */
    public String info() {
        String info;

        info = "Altezza:         " + this.altezza + "\n"
                + "Cognome:         " + this.cognome + "\n"
                + "Data di nascita: " + this.dataDiNascita + "\n"
                + "Nome:            " + this.nome + "\n"
                + "Peso:            " + this.peso + "\n";

        return info;
    }
    
    public Integer calcoloEta(String dataDiNascita){
        Integer eta;
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendario = Calendar.getInstance();
        Date dateObj = calendario.getTime();
        String dataOggi = formato.format(dateObj);
        String [] dOggi = dataOggi.split("/");
        
        String[] d = dataDiNascita.split("/");
        
        Integer gg = Integer.valueOf(d[0]);
        Integer mm = Integer.valueOf(d[1]);
        Integer aaaa = Integer.valueOf(d[2]);
        
        
        
        Integer ggOggi = Integer.valueOf(dOggi[0]);
        Integer mmOggi = Integer.valueOf(dOggi[1]);
        Integer aaaaOggi = Integer.valueOf(dOggi[2]);
        
        eta = aaaaOggi - aaaa - 1;
        
        if(mm == mmOggi){
            if(gg <= ggOggi)
                eta = eta + 1;
        }
        
        if(mm < mmOggi)
                eta = eta + 1;
        System.out.println("Anni: " + eta);
        
        return eta;
        
    }
    
    public static Boolean verificaOmonimia(Persona4 p, Persona4 p2){
        Boolean verifica = false;
        if (p.nome.equals(p2.nome) && p.cognome.equals(p2.cognome)){
            verifica = true;
        }
        
        
        return verifica;
    }
}
   



