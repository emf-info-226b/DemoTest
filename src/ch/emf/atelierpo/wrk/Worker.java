package ch.emf.atelierpo.wrk;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Mario Ramalho(EMF - Fribourg)
 */
public class Worker {

    /**
     * Contrôle si une plaque d'immatriculation est conforme à la réglementation
     * Suisse. Les seules caractères autorisés pour le numéro de plaque sont les
     * caractères 0-9 avec une longueur maximale de 6 caractères et minimale de
     * 1 caractère. Le canton doit faire partie des 26 valeurs suivantes : ZH,
     * BE, LU, UR, SZ, OW, NW, GL, ZG, FR, SO, BS, BL, SH, AR, AI, SG, GR, AG,
     * TG, TI, VD, GE, NE, VS, JU.
     *
     * @param canton l'abbrévation du canton
     * @param numeroDePlaque le numéro de plaque
     * @return faux sauf si le canton et le numéro de plaque sont fournis comme
     * précité dans les spécifications fournis
     */
    public boolean controlePlaqueImmatriculation(String canton, String numeroDePlaque) {
        boolean isPlaqueValide = false;
        if (canton != null && numeroDePlaque != null) {
            List<String> cantonsValides = Arrays.asList("ZH", "BE", "LU", "UR", "SZ", "OW", "NW", "GL", "ZG", "FR", "SO", "BS", "BL", "SH", "AR", "AI", "SG", "GR", "AG", "TG", "TI", "VD", "GE", "NE", "VS", "JU");
            if (cantonsValides.contains(canton)) {
                isPlaqueValide = true;
                try {
                    int numeroAVerfier = Integer.parseInt(numeroDePlaque);
                    if (numeroAVerfier < 1) {
                        isPlaqueValide = false;
                    }
                } catch (NumberFormatException exception) {
                    isPlaqueValide = false;
                }
                if (numeroDePlaque.length() < 1 || numeroDePlaque.length() > 6) {
                    isPlaqueValide = false;
                }
            }
        }
        return isPlaqueValide;
    }

    /**
     * Contrôle si un numéro de téléphone mobile est conforme au format suivant
     * : +417X XXX XX XX. Les seuls caractères autorisés pour le numéro sont les
     * caractères de 0-9 et l'espace avec le formatage suivant "XXX XX XX". Les
     * seuls caactères autorisés pour le préfixe sont les caractères 0-9 et le
     * +. Le préfixe a le formatage suivant "+417X" où le X peut-être un 6,7,8
     * et 9.
     *
     * @param prefix le préfixe du numéro de téléphone mobile commençant par le
     * caractère +
     * @param numero le numéro de téléphone mobile
     * @return faux sauf si le formatage est respecté comme précité dans les
     * spécifications fournis
     */
    public boolean controleNumeroTelMobile(String prefix, String numero) {
        boolean isNumeroValide = false;
        if (prefix != null && numero != null) {
            if (numero.matches("[0-9]{3} [0-9]{2} [0-9]{2}") && prefix.matches("[+]417[6789]")) {
                isNumeroValide = true;
            }
        }
        return isNumeroValide;
    }

}
