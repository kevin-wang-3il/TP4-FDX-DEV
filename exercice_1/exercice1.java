public class FactureManager {
    public static final double REDUC_ALIMENTAIRE = 0.05;
    public static final double REDUC_ELECTRONIQUE = 0.1;
    public static final double REDUC_LUXE = 0.15;
    public static final double REDUC_GROS_MONTANT = 0.05;

    /**
     *  Calcul le total d'une facture
     *
     * @param typeProduit
     * @param quantite
     * @param prixUnitaire
     * @return Le total de la facture après application des réductions
     */
    public double calculerFacture(String typeProduit, int quantite, double prixUnitaire) {
        double total = quantite * prixUnitaire;

        // reduction selon la catégorie
        total = total * reduc(typeProduit);

        // Reduction sur le total
        if (total > 1000) {
            total -= total * REDUC_GROS_MONTANT;
        }

        return total;
    }

    /**
     * Applique la réduction selon la catégorie
     *
     * @param typeProduit
     * @return Le taux de réduction
     */
    private static double reduc(String typeProduit) {
        return switch (typeProduit) {
            case "Alimentaire" -> REDUC_ALIMENTAIRE;
            case "Electronique" -> REDUC_ELECTRONIQUE;
            case "Luxe" -> REDUC_LUXE;
            default -> 0.0;
        };
    }
}
