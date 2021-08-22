package exemplo_builder;

public class AnimalMain {
    public static void main(String[] args){
        Animal animal = AnimalBuilder.newAnimal("Gato", "Tobias","Siamês","Meow",4);

        System.out.println("Som: "+animal.getSom());
        System.out.println("Som: "+animal.getSom("AAAAA"));
    }
}
