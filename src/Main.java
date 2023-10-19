public class Main {

    public static void main(String[] args) {

        //creer un jeu de carte
        String[] jeu = Carte.paquet();

        // melanger les cartes

        for (int i = jeu.length - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1)); // Génère un indice aléatoire entre 0 et i inclus
            // Échangez les cartes à l'indice i et j
            String temp = jeu[i];
            jeu[i] = jeu[j];
            jeu[j] = temp;
        }

        // creer 2 joueurs
        Joueur j1 = new Joueur("pierre", 0);
        Joueur j2 = new Joueur("luc", 0);

        // distribuer les cartes a chaque joueur
        int indexCarte = 0;

        for (int i = 0; i < jeu.length; i++) {
            if (i % 2 == 0) {
                j1.ajouterCarte(jeu[i]);
            } else {
                j2.ajouterCarte(jeu[i]);
            }
        }


        // commencer jeu boucle tant qu'il reste des cartes à 1 joueur on dépile
        while (j1.getPaquet().length > 0 && j2.getPaquet().length > 0) {

            j1.afficherCartes();
            j2.afficherCartes();

            if (j1.getPaquet().length > 0) {
                String[] nouveauPaquetJ1 = new String[j1.getPaquet().length - 1];
                System.arraycopy(j1.getPaquet(), 1, nouveauPaquetJ1, 0, nouveauPaquetJ1.length);
                j1.setPaquet(nouveauPaquetJ1);

            }

            if (j2.getPaquet().length > 0) {
                String[] nouveauPaquetJ2 = new String[j2.getPaquet().length - 1];
                System.arraycopy(j2.getPaquet(), 1, nouveauPaquetJ2, 0, nouveauPaquetJ2.length);
                j2.setPaquet(nouveauPaquetJ2);
            }
            if (j1.getPaquet().length == 0) {
                System.out.println(j1.getPrenom() + " n'a plus de cartes. " + j2.getPrenom() + " gagne !");
            } else {
                System.out.println(j2.getPrenom() + " n'a plus de cartes. " + j1.getPrenom() + " gagne !");
            }
        }



    }

}