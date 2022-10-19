package persona;

/**
 * La classe Persona1 definisce alcune caratteristiche di un essere umano
 *
 * @author gabriele.tavernini
 * @version 1.0 28/09/2022
 */
public class Persona2 {

    private Double altezza;
    private String cognome;
    private String nome;
    private Float peso;
    private String dataDiNascita;

    /**
     * Costruttore della classe Persona senza parametri
     */
    public Persona2() {
    }

    /**
     * Costruttore della classe Presona con parametri
     *
     * @param altezza Altezza
     * @param cognome Cognome
     * @param nome Nome
     * @param peso Peso
     */
    public Persona2(Double altezza, String cognome, String nome, Float peso) {
        this.altezza = altezza;
        this.cognome = cognome;
        this.nome = nome;
        this.peso = peso;

        this.setDataDiNascita(dataDiNascita);
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
        if (altezza < 3 && altezza > 0.5) {
            this.altezza = altezza;
        } else {
            this.altezza = null;
        }
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
        if (cognome == null) {
            this.cognome = null;
        } else {
            this.cognome = cognome;
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
    public void setNome(String nome) {
        if (nome == null) {
            this.nome = null;
        } else {
            this.nome = nome;
        }
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
        if (peso > 1 && peso < 200) {
            this.peso = peso;
        } else {
            this.peso = null;
        }
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
        String annoDiNascitaString, meseDiNascitaString, giornoDiNascitaString;
        Integer annoDiNascita, meseDiNascita, giornoDiNascita;
        Boolean valida = false;

        giornoDiNascitaString = dataDiNascita.substring(0, 2);
        meseDiNascitaString = dataDiNascita.substring(3, 5);
        annoDiNascitaString = dataDiNascita.substring(6, 10);

        giornoDiNascita = Integer.parseInt(giornoDiNascitaString);
        meseDiNascita = Integer.parseInt(meseDiNascitaString);
        annoDiNascita = Integer.parseInt(annoDiNascitaString);

        switch (meseDiNascita) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (giornoDiNascita >= 1 && giornoDiNascita <= 31) {
                    valida = true;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (giornoDiNascita >= 1 && giornoDiNascita <= 30) {
                    valida = true;
                }
                break;
            case 2:
                if (annoDiNascita % 400 == 0 || (annoDiNascita % 4 == 0
                        && annoDiNascita % 100 != 0)) {
                    if (giornoDiNascita >= 1 && giornoDiNascita <= 29) {
                        valida = true;
                    }

                } else if (giornoDiNascita >= 1 && giornoDiNascita <= 28) {
                    valida = true;
                }
        }

        if (valida) {
            this.dataDiNascita = dataDiNascita;
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

}
