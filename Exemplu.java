import java.util.*;

//main class
public class Exemplu{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String input;
        Zoo zoo= Zoo.getInstance();
        
        while (true) {
            System.out.println("Welcome!");
            System.out.println("What do you want to do?");
            System.out.println("1. Add an animal? Please type 1!");
            System.out.println("2. Remove an animal? Please type 2!");
            System.out.println("3. View the animal list? Please type 3!");
            System.out.println("4. Exit? Please type 4!");
            input = scanner.nextLine();
            
            switch(input) {
                case "1": 
                    System.out.println("You have chosen to add an animal!");
                    System.out.println("What type of animal you would like to add: m ,  b,  f !");
                    String type = scanner.nextLine();
                    System.out.println("Type the name you would like it to have!");
                    String name = scanner.nextLine();
                    zoo.adauga(type, name); 
                    System.out.println("Added!");
                    break;
                case "2": 
                    System.out.println("You have chosen to remove an animal!");
                    System.out.println("What type of animal you would like to remove:  m ,  b,  f !");
                    String type1 = scanner.nextLine();
                    System.out.println("Type the animal's name you would like to remove!");
                    String name1 = scanner.nextLine();
                    zoo.stergeAnimal(type1, name1);
                    System.out.println("Removed!");
                    break;
                case "3" :
                    zoo.afisareAnimale();
                    break;
                case "4": 
                    System.exit(0);
            }
        }
        

    }
}