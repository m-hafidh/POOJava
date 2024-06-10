 package heritages;

class Vehicule {
protected String brand= "Ford"; // Attribut vehicule
public void honk (){ // Methode vehicule

    System.out.println("Allo Allo Allo!");
}

    
}

class Voiture extends Vehicule{
    private String modelName = "Mustang";  // Attribut vehicule
    public static void main(String[] args) {
        
        // Creer un objet maVoiture
        Voiture maVoiture = new Voiture();

        //Appeler la méthode honk() (de la classe Vehicle) sur l'objet maVoiture
        maVoiture.honk();
        // Afficher la valeur de l'attribut brand (de la classe Vehicle) et la valeur du modelName de la classe voiture.
        System.out.println(maVoiture.brand + " " + maVoiture.modelName);

    }
}