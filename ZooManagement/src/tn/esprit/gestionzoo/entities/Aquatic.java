package tn.esprit.gestionzoo.entities;

abstract public class Aquatic extends Animal {
    protected String habitat;
    public Aquatic(){}
    public Aquatic(String family, String name, int age, boolean isMammal, String habitat){
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }
    abstract public void swim();

    public void setHabitat(String habitat){
        this.habitat=habitat;
    }
    public String getHabitat(){
        return habitat;
    }

    @Override
    public String toString() {
        return family + " " + name + " " + age + " " + isMammal + " hedhi jdid" + habitat;
    }
}
