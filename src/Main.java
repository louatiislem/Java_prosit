//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// Création d'un animal
//        Animal lion = new Animal();
//        lion.family = "kkk";
//        lion.name = "Lion";
//        lion.age = 5;
//        lion.isMammal = true;
//
//        // Création d’un zoo
//        Zoo myZoo = new Zoo();
//        myZoo.name = "MyZoo";
//        myZoo.city = "Tunis";
//        myZoo.nbrCages = 20;

        Animal a=new Animal("hhh","lion",2,true);
        System.out.println(a.name);
        Zoo z=new Zoo(a,"myzoo","tunis",5);

        System.out.println("Animal: " + a.name + ", Famille: " + a.family);
        System.out.println("Zoo: " + z.name + " situé à " + z.city);

        Animal a1=new Animal("jjj","chat",8,true);
        Animal a2=new Animal("oo","chien",2,true);
        System.out.println("Animal: " + a1.name + ", Famille: " + a1.family);
        System.out.println("Animal: " + a2.name + ", Famille: " + a2.family);

        Zoo z2=new Zoo(a,"myzoo2","tunis",50);
        z2.displayZoo();


        System.out.println(z);
        System.out.println(z2);

        System.out.println(a);
        System.out.println(a1);
        System.out.println(a2);


    }
}