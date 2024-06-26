package ch.emf.atelierpo.wrk;

/**
 *
 * @author Mario Ramalho(EMF - Fribourg)
 */
public class Worker {

    /**
     * valide un numéro de téléphone donnée en paramètre selon les critères
     * suivant :
     *
     * @param prefix le préfix du numéro de téléphone permettant uniquement les
     * cas suivants : <b>+4176, +4177, +4178 et +4179</b>
     * @param numero le numéro devant contenir des caractères <b>0-9</b> sous le
     * format
     * <b>"xxx xx xx"</b> séparé uniquement <b>d'espaces</b>
     *
     * @return un boolean représentant la validité du numéro de téléphone
     */
    public boolean controleNumeroTelMobile(String prefix, String numero) {
        boolean resultat = false;
        
        if (prefix != null && numero != null) {

            // Vérification du préfixe
            if (prefix.matches("\\+417[6-9]")) {
                resultat = true;
            }
            if (numero.matches("[0-9]{3}\\s[0-9]{2}\\s[0-9]{2}")) {
                resultat = true;
            }

        }

        return resultat;
    }
}
