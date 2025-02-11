package tn.esprit.gestionzoo.entities;
import java.util.Arrays;

public class Zoo {
    Animal [] animals;
    private String name;
    private String city;
    final int nbrCages=25;
    //instruction 14
    //final int nbrCages=25;

    public void setName(String name){this.name=name;}
    public String getName(){return this.name;}

    public void setCity(String city){this.city=city;}
    public String getCity(){return this.city;}

    public Zoo(String name, String city, int nbrCages){
        animals = new Animal[this.nbrCages];
        this.name=name;
        this.city=city;
        //this.nbrCages=nbrCages;
    }

    public void displayZoo(){
        System.out.println("Name: " + name + " City: " + city + " Nombre de cages: " + nbrCages);
    }

    @Override
    public String toString() {
        return "Zoo{" + ", name='" + name + '\'' + ", city='" + city + '\'' + ", nbrCages=" + nbrCages + '}';
    }


    public void afficher() {
        int i = 0;
        Boolean test = false;

        while (i < nbrCages && test==false) {
            if (animals[i] != null)
            {
                System.out.println(animals[i].getFamily() + ":" + animals[i].getName() + ":" + animals[i].getAge());
            } else
            {
                test = true;
            }
            i++;
        }
    }
    //instruction 11
    public int searchAnimal(Animal animal)
    {
        for(int i=0 ; i<nbrCages ; i++)
        {
            if(animals[i] != null && animals[i].getName().equals(animal.getName()))
            {
               return i;
            }
        }
        return -1;
    }
    //Instruction 10:
    public boolean addAnimal(Animal animal)
    {
        for (int i = 0; i < nbrCages; i++)
        {
            if(isZooFull()==false)
            {
                if (animals[i] == null)
                {
                    if(searchAnimal(animal)==-1)
                    {
                        animals[i] = animal;
                        return true;
                    }
                }

            }
        }
        return false;
    }

    //instruction 13
    public boolean removeAnimal(Animal animal)
    {
        int pos = searchAnimal(animal);
        if(pos!=-1)
        {
            for (int i = pos ; i < nbrCages - 1; i++)
            {
                animals[i] = animals[i + 1];
            }
            //nbrCages--;
            return true;
        }
        return false;
    }

    //instruction 15
    public boolean isZooFull() {
        int nb=0;
        for (int i = 0; i < animals.length; i++)
        {
            if (animals[i] != null)
            {
                nb++;
            }
        }
        if(nb==nbrCages){return true;}
        else{return false;}
    }
    public static Zoo comparerZoo(Zoo z1, Zoo z2){
        int nb1=0;
        for(int i=0;i<z1.animals.length;i++){
            if(z1.animals[i]!=null){
                nb1++;
            }
        }
        int nb2=0;

        for(int i=0;i<z2.animals.length;i++){
            if(z2.animals[i]!=null){
                nb2++;
            }
        }
        if(nb1>nb2){
            return z1;
        }
        else if(nb1<nb2){
            return z2;
        }
        else{
            return null;
        }
    }


}
