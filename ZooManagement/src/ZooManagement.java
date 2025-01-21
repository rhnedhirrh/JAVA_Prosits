import java.util.Scanner; // Importer gérer les entrées utilisateur


public class ZooManagement
{

    public static void main (String [] args)
    {

        //1ère méthode
        String zooName;
        int nbrCages;



        Scanner sc = new Scanner(System.in); // Créer un objet Scanner pour lire les entrées utilisateur

        // Demander à l'utilisateur le nom du zoo
        System.out.println("Entrez le nom du zoo : ");
        zooName = sc.nextLine();

        //System.out.println("Entrez x : ");
        // int x = sc.nextInt();

        // Demander à l'utilisateur le nombre de cages
        //System.out.println("Entrez le nombre de cages : ");
        //String nbrCages = sc.nextLine();

        nbrCages = 0;
        while (true)
        {
            System.out.println("Donner le nombre de cages : ");
            if (sc.hasNextInt()) // Vérifier si l'entrée est un entier
            {
                nbrCages = sc.nextInt(); // Lire l'entier saisi par l'utilisateur
                if (nbrCages > 0)
                {
                    break;
                }
                else
                {
                    System.out.println("Veuillez entrer un nombre de cages positif.");
                }
            }
            else
            {
                System.out.println("Veuillez entrer un entier valide.");
                sc.next(); // Ignorer l'entrée incorrecte pour éviter un blocage de la boucle
            }
        }

        System.out.println(zooName + " comporte " + nbrCages + " cages");
        sc.close(); // Fermer l'objet Scanner pour libérer les ressources

    }
}
