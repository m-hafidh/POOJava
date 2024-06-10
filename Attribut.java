public class Attribut {
    // Creations de variableou les objets
    final int Id=1; //on utilise final pour ne pas pouvoir le remplacer ou le modifier 
    String nom = "hafidhou";
    String prenom= "Maoulida";
    String date = "13/06/2024";
    String ecole;
    double Moyenne = 15.95;

    // les Attributs multiples 

    String name = "jef";
    String lastname = "Bezos";
    int age = 25;

    public static void main(String[] args) {
        // appellons les objets en utilisant le (.)
        Attribut monObjet = new Attribut();
        System.out.println("identifiant est :"+ monObjet.Id);
        System.out.println("Le nom est :" + monObjet.nom);
        System.out.println("Le prenom est :" + monObjet.prenom);
        System.out.println("Laa fate est : " + monObjet.date);
        //on modifie la valeur de ecole en ajoutant une variabe 
        monObjet.ecole = "Sup";
        System.out.println("Mon est ecole est :" +monObjet.ecole);

        // on peutremplacer une valeur existante 

        monObjet.Moyenne = 16.25;
        System.out.println("la nouvelle moyenne est :" + monObjet.Moyenne);

        // on appel l'attribut multiple 

        System.out.println( "le nom est :" +monObjet.name + " " +monObjet.lastname);
        System.out.println( "l'age est :" + monObjet.age);
        
    }
}