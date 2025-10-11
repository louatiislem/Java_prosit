package entities;

public class Animal_aqua extends Animal{
     protected String habitat;
     public Animal_aqua() {}
     public Animal_aqua(String family, String name, int age, boolean isMammal, String habitat) {
         super(family, name, age, isMammal);
         this.habitat = habitat;
     }

     public  String getHabitat() {
         return habitat;
     }
     public void setHabitat(String habitat) {
         this.habitat = habitat;
     }
    @Override
    public String toString() {
        return super.toString()+ "habitat=" + habitat ;
    }
    //methode swim
    public void swim(){
         System.out.println("This aquatic animal is swimming");
    }
}
