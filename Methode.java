public class Methode {

    // declaration de la methode en utilisant le static
    static void monMethode(){
        System.out.println("Bonjour tout le monde");
    }

     // declaration de la methode en utilisant le static
     public void monMethode2 (){
        System.out.println("Hello everyOne");

     }


    // Appelons la methode
    public static void main(String[] args) {
        monMethode();

    Methode monObjet= new Methode(); // creons un objet
    monObjet.monMethode2();

    }

    
}