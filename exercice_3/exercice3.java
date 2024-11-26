public class StockManager {

    /**
     * Gere le stock
     * @param typeOperation
     * @param produit
     * @param quantite
     * @param stock
     */
    public void gererStock(String typeOperation, String produit, int quantite, int stock) {
        switch (typeOperation) {
            case "ajout":
                stock = ajoutStock(quantite, stock);
                break;
            case "retrait":
                stock = retireStock(produit, quantite, stock);
                break;
            default:
                System.out.println("Opération inconnue.");
                return;
        }
        System.out.println("Produit : " + produit + ", Stock après operation : " + stock);
    }

    /**
     * Ajout au stock
     * @param produit
     * @param quantite
     * @param stock
     * @return
     */
    private static int retireStock(String produit, int quantite, int stock) {
        if (stock >= quantite) {
            stock -= quantite;
        } else {
            System.out.println("Stock insuffisant pour le produit : " + produit);
        }
        return stock;
    }

    /**
     * Retrait du stock
     * @param quantite
     * @param stock
     * @return
     */
    private static int ajoutStock(int quantite, int stock) {
        stock += quantite;
        return stock;
    }
}
