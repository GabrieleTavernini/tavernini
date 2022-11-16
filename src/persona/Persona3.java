package persona;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
 * La classe Persona1 definisce alcune caratteristiche di un essere umano
 *
 * @author gabriele.tavernini
 * @version 3.0 19/10/2022
 */
public class Persona3 {
    
    private String[] D_OGGI;
    
    private Double altezza;
    private String cognome;
    private String nome;
    private Float peso;
    private String dataDiNascita;
    

    /**
     * Costruttore della classe Persona senza parametri
     */
    public Persona3() {
    }

    /**
     * Costruttore della classe Presona con parametri
     *
     * @param altezza Altezza
     * @param cognome Cognome
     * @param nome Nome
     * @param peso Peso
     */
    public Persona3(Double altezza, String cognome,String dataDiNascita, String nome, Float peso) {
        this.altezza = altezza;
        this.cognome = cognome;
        setDataDiNascita(dataDiNascita);
        this.nome = nome;
        this.peso = peso;
        
    }
    
    private String[] dataOggi(String[] D_OGGI){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendario = Calendar.getInstance();
        Date dateObj = calendario.getTime();
        String dataOggi = formato.format(dateObj);
        D_OGGI = dataOggi.split("/");
        return D_OGGI;
    }

    public String[] getD_OGGI() {
        return D_OGGI;
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
    final public void setAltezza(Double altezza) {
        if(altezza<3 && altezza>0.5)
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
    final public void setCognome(String cognome) {
        if(cognome == null)
            this.cognome = null;
        else
            this.cognome = cognome;
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
    public void setNome(String nome) {
        if(nome == null)
            this.nome = null;
        else
            this.nome = nome;
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
    final public void setPeso(Float peso) {
        if(peso>1 && peso<200)
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
        dataOggi(D_OGGI);
        
        
        
        Boolean valida = false;
        String[] d = dataDiNascita.split("/");
        Integer data[] = new Integer[d.length];
        
        for (int i = 0; i < d.length; i++) {
            data[i] = Integer.valueOf(d[i]);
        }

        if (data[2] >= 0 && data[2] <= Integer.valueOf(D_OGGI[2])) {
            if(data[1] >= 0 && data[1] < Integer.valueOf(D_OGGI[1])){
                
                    
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
    }else if(data[1] >= 0 && data[1] == Integer.valueOf(D_OGGI[1])){
        if(data[0] >= 0 && data[0] <= Integer.valueOf(D_OGGI[0])){
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
    


                    
                }
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
        dataOggi(D_OGGI);
       
        
        String[] d = dataDiNascita.split("/");
        
        Integer gg = Integer.valueOf(d[0]);
        Integer mm = Integer.valueOf(d[1]);
        Integer aaaa = Integer.valueOf(d[2]);
        
        
        eta = Integer.valueOf(D_OGGI[2]) - aaaa - 1;
        
        if(mm == Integer.valueOf(D_OGGI[1]))
            if(gg <= Integer.valueOf(D_OGGI[0]))
                eta = eta + 1;
        
        if(mm < Integer.valueOf(D_OGGI[1]))
                eta = eta + 1;
        
        
        return eta;
    }
}



