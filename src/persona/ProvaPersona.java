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
        
        Persona3 p = new Persona3(1.80, "cognome","11/09/2022", "nome", 70f);
        
        Persona1 p2 = new Persona1(1.80, "cognome", "23/09/2022", "nome", 70f);
        
        String info =p2.info();
        
        
        System.out.println("l'eta' e' " + p.calcoloEta(p.getDataDiNascita()));
        
    }
    
}
