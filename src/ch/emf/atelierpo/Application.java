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
        if (wrk.controlePlaqueImmatriculation("FR", "999999")) {
            System.out.println("IMMATRICULATION OK");
        } else {
            System.out.println("IMMATRICULATION NOK");
        }
        if (wrk.controleNumeroTelMobile("+4177", "999 99 99")) {
            System.out.println("TEL MOBILE OK");
        } else {
            System.out.println("TEL MOBILE NOK");
        }
    }

}
