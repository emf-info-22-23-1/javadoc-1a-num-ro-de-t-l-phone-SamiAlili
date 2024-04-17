package ch.emf.atelierpo;

import ch.emf.atelierpo.wrk.Worker;

/**
 *
 * @author Mario Ramalho(EMF - Fribourg)
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Worker wrk = new Worker();
        
        String prefix="+4179";
        String num="744 22 31";
        
        if (wrk.controleNumeroTelMobile(prefix, num)) {
            System.out.println("TEL MOBILE OK");
            System.out.println(prefix +" "+ num);
        } else {
            System.out.println("TEL MOBILE NOK");
            System.out.println(prefix +" "+ num);
        }
    }

}
