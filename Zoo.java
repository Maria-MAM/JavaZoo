import java.util.*;

public class Zoo {
    private ArrayList<Animal> listaZoo = new ArrayList<>();
        
    private static Zoo singleton;
    
    private Zoo(){
        
    };
    
    public static Zoo getInstance() {
        if (singleton == null) {
            singleton = new Zoo();
        }
        return singleton;
    }
    
    public void adaugaAnimal(Animal a) {
        listaZoo.add(a);
    }
    
    public static void adauga(String type, String nume) {
        switch(type) {
             case "m" :
             Zoo.getInstance().adaugaAnimal(new Monkey(nume)); 
             break;
             case "b":
             Zoo.getInstance().adaugaAnimal(new Bear(nume));
             break;
             case "f":
             Zoo.getInstance().adaugaAnimal(new Flamingo(nume));
             break;
        }
    }
    
    public void afisareAnimale() {
        System.out.println("Sunt " + listaZoo.size() + " animale in Zoo!");
        System.out.println("List animalelor din Zoo este: ");
        for(int i = 0; i<listaZoo.size(); i++) {
            System.out.println(listaZoo.get(i).nume + " the " + listaZoo.get(i).toString());
       }
    }
    
    public void stergeAnimal(String tip, String nume) {
        switch(tip) {
             case "m" :
             listaZoo.removeIf(Monkey -> Monkey.nume.equals(nume));
             break;
             case "b":
             listaZoo.removeIf(Bear -> Bear.nume.equals(nume));
             break;
             case "f":
             listaZoo.removeIf(Flamingo -> Flamingo.nume.equals(nume));
             break;
        }
    }
    
    
}