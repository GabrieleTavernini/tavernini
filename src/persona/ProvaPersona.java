/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

/**
 *
 * @author gabriele.tavernini
 */
public class ProvaPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona4 p = new Persona4(1.80, "cognome","11/09/2022", "Nome", 50f);
        
        Persona4 p2 = new Persona4(1.80, "cognome", "23/09/2022", "Nome", 50f);
        
        System.out.println(Persona4.verificaOmonimia(p2,p));
        
        System.out.println(p.info());
        
        
        System.out.println("l'eta' e' " + p.calcoloEta(p.getDataDiNascita()));
        
    }
    
}
