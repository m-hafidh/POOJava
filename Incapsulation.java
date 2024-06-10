// Creer une class 
public class Incapsulation {

    // creer les attributs (variable )
    private String name;
    private int age;

    // Getterv
    public String getNAme(){ //La getméthode renvoie la valeur de la variable name.
        return name;
    }

    public int getAge(){ //La getméthode renvoie la valeur de la variable age.
        return age;
    }
    //Setter
    public void setName(String newName){ //La setméthode prend un paramètre ( newName) et l'affecte à la namevariable
    //Le thismot-clé est utilisé pour faire référence à l'objet courant.
        this.name =newName; 
    }
    public void setAge(int nouvauAge){ //La setméthode prend un paramètre ( nouvoAge) et l'affecte à la namevariable
    ////Le thismot-clé est utilisé pour faire référence à l'objet courant.
        this.age = nouvauAge;
    }
    /*Cependant, comme les variables name et l'age  sont déclarées comme private,
     nous ne pouvons pas y accéder depuis l'extérieur de cette classe : */

}