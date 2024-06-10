public class Main {

    //final // on utilise "final" pour enpecherla modificatio
     int x = 5; 
 
    int y =3;
    public static void main(String[] args) {
        Main monobjet = new Main();
        //System.out.println(monobjet.x);
        // modifier lavaleur de y
        monobjet.y = 40;
        System.out.println(monobjet.y);
        //Remplacerla valeur exixtant 
        monobjet.x = 25;
        System.out.println(monobjet.x);
    }
}