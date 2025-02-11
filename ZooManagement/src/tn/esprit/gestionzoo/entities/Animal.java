package tn.esprit.gestionzoo.entities;

public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public void setFamily(String family){this.family=family;}
    public String getFamily(){return this.family;}

    public void setName(String name){this.name=name;}
    public String getName(){return this.name;}

    public void setAge(int age)
    {
        if(age<0)
        {
            System.out.println("âge doit être positif");
        }
        else
        {
            this.age=age;
        }
    }
    public int getAge(){return this.age;}

    public boolean isisMammal(){return isMammal;}

    public Animal( String family, String name, int age, boolean isMammal)
    {
        this.family=family;
        this.name=name;
        this.age=age;
        this.isMammal=isMammal;
    }

    @Override
    public String toString() {
        return "Animal{family='" + family + "', name='" + name + "', age=" + age + ", isMammal=" + isMammal + "}";

    }
}

