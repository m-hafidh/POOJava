// Importer le package dans la class scanner 
import java.util.Scanner; // ou bien importer avec "import java.util.* "

 public class Mypackage {

    public static void main(String args []){
        Scanner Nom = new Scanner(System.in);

        System.out.println("Entrer votre nom");

        String userName = Nom.nextLine();
        System.out.println("Le nom est : " +userName);

    }
}