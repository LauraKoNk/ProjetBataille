public class Joueur {

    private String prenom;
    private String[] paquet;
    private int score;

    public Joueur (String prenom, int score){

        this.prenom = prenom;
        this.score = 0;
        this.paquet = new String[0];
    }

    // methodes : accesseurs, modificateurs, tirer une carte, ajouter une carte, toString()
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String[] getPaquet() {
        return paquet;
    }

    public void setPaquet(String[] paquet) {
        this.paquet = paquet;
    }

    public void ajouterCarte(String carte) {

        String[] nouveauPaquet = new String[paquet.length + 1];
        for (int i = 0; i < paquet.length; i++) {
            nouveauPaquet[i] = paquet[i];
        }
        nouveauPaquet[paquet.length] = carte;
        paquet = nouveauPaquet;
    }

    public void afficherCartes() {
        System.out.println("Cartes de " + prenom + ":");
        for (String carte : paquet) {
            System.out.println(carte);
        }
    }

    public void afficherScore() {
        System.out.println("Score de " + prenom + "= " + score);
    }
    public String toString() {
        return "Joueur = " + prenom + " Score = " + getScore();
    }

}
