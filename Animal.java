public class Animal {
    public String nume;
    
    
    public Animal(String nume) {
        this.nume = nume;
    }
    
    @Override
    public String toString() {
        return this.getClass().getName();
    }
}