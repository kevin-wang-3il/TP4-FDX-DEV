public class GestionnaireNotes {

    /**
     * Affiche note et moyennes
     * @param nomEtudiant
     * @param notes
     */
    public void afficherNotesEtMoyenne(String nomEtudiant, int[] notes) {
        affNotes(nomEtudiant, notes);
        double moyenne = calcMoy(notes);
        System.out.println("Moyenne : " + moyenne);
    }

    /**
     * Calcul de la somme des notes
     * @param notes
     * @return
     */
    private double calcMoy(int[] notes) {
        int somme = 0;
        for (int note : notes) {
            somme += note;
        }
        return (double) somme / notes.length;
    }

    /**
     * Affichage des notes
     * @param nomEtudiant
     * @param notes
     */
    private void affNotes(String nomEtudiant, int[] notes) {
        System.out.println("Notes de " + nomEtudiant + ":");
        for (int note : notes) {
            System.out.println("- " + note);
        }
    }
}
