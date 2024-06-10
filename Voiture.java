public class Voiture {

    // Creer les methodes accelerer 
    public void Accelerer  (){
        System.out.println("La voiture roule aussi vite qu'elle  peut !");
    }

    // creer la methode vitesse et ses prametres 

    public void vitesse  (int maxVitess){
        System.out.println("la vitese maximu de cette voiture est :" +maxVitess);


    }

    // Maintenant on appel les methodes dans l'objet voituire
    public static void main(String[] args) {
        Voiture monVoiture = new Voiture(); // le new pour creer un objet de notre class 
        //ici on appelles methode accelerer et vitesse  
        monVoiture.Accelerer();
        monVoiture.vitesse(200);
    }
}