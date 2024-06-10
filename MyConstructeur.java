
// Creer la classe MyConstructeur
public class MyConstructeur {
    // Creer un Attribut (variable)

    String nom;
    int age;
    Double Moyenne ;
    String latsname ;

    // Creer une class constructeur pour la class MyConstructeur
    public MyConstructeur(double moy , String prenom){
        nom="Abdou";
        age=25;
        Moyenne= moy;
        latsname = prenom;
    }

    public static void main(String[] args) {
        // Creer un objet pour appeler les constructeurr
        MyConstructeur Objet = new MyConstructeur(15, "JackMa");
         // imprimer les valeurs qu'onacreer 
         System.out.println("le nom est :"+Objet.nom);
         System.out.println("Age est :"+ Objet.age + " ans ");
         System.out.println("la moyenne et le prenom sont :" + Objet.Moyenne+ " et " + Objet.latsname);
    }
}