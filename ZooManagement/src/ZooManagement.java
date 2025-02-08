import java.util.Scanner; // Importer gérer les entrées utilisateur


public class ZooManagement
{

    public static void main (String [] args)
    {
/*
        //1ère méthode
        String zooName;
        int nbrCages;



        Scanner sc = new Scanner(System.in); // Créer un objet Scanner pour lire les entrées utilisateur

        // Demander à l'utilisateur le nom du zoo
        System.out.println("Entrez le nom du zoo : ");
        zooName = sc.nextLine();



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
*/


        //Instruction 5 :
        /*
        Animal A1 = new Animal();
        A1.name="hero";
        A1.age=25;
        A1.family="Lion";
        A1.isMammal=true;

        System.out.println(A1.name);
        System.out.println(A1.age);
        System.out.println(A1.family);
        System.out.println(A1.isMammal);
        */

        //Instruction 6 :
        Animal A1 = new Animal("Lion","Hero",25,false);

        System.out.println(A1.name);
        System.out.println(A1.age);
        System.out.println(A1.family);
        System.out.println(A1.isMammal);

        Zoo Z1 = new Zoo("Belvédère","Tunis",10);

        System.out.println(Z1.name);
        System.out.println(Z1.city);
        System.out.println(Z1.nbrCages);

        for( int i = 0 ; i < Z1.nbrCages;i++)
        {
            //instruction 7 :
            Z1.animals[i] = new Animal("x","y",12,true);
            //Z1.animals[i] = A1;
            System.out.println(Z1.animals[i].name);
        }


        //instruction 8:
        System.out.println("instruction 8 sans présence de la méthode to_string");
        System.out.println("------------------------------------------------------------------------");
        System.out.println(Z1);
        System.out.println("------------------------------------------------------------------------");
        System.out.println(Z1.toString());
        System.out.println("------------------------------------------------------------------------");
        //instruction 9:
        System.out.println("instruction 8 avec présence de la méthode to_string");
        System.out.println("------------------------------------------------------------------------");
        System.out.println(A1);
        System.out.println("------------------------------------------------------------------------");
        System.out.println(A1.toString());
        System.out.println("------------------------------------------------------------------------");





    }
}
