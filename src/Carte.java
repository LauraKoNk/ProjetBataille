public class Carte {

   private String couleur;
   private String valeur;
   private static final String[] valeurs = {"As","2", "3", "4", "5", "6", "7", "8", "9", "10", "Valet", "Dame", "Roi"};
   private static final String[] couleurs = {"Cœur", "Pique", "Trèfle", "Carreau"};

   //constructor
   public Carte (String couleur, String valeur){
   this.couleur = couleur;
   this.valeur = valeur;
   }

   // methodes : accesseurs, modificateurs et comparateur
   public static String[] paquet() {
      String[] paquet = new String[52];
      int index = 0;

      // Parcourir les valeurs
      for (String valeur : valeurs) {
         // Parcourir les couleurs
         for (String couleur : couleurs) {
            // Créer une carte en combinant la valeur et la couleur
            String carte = valeur + " de " + couleur;
            // Stocker la carte dans le tableau
            paquet[index] = carte;
            index++;
         }
      }
      return paquet;
   }

   public String getCouleur() {
      return couleur;
   }

   public String getValeur() {
      return valeur;
   }

   public void setCouleur(String couleur) {
      this.couleur = couleur;
   }

   public void setValeur(String valeur) {
      this.valeur = valeur;
   }

   public static String[] getCouleurs() {
      return couleurs;
   }

   public static String[] getValeurs() {
      return valeurs;
   }


}
