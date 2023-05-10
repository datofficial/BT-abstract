package day3.baitapvenha.bai4_6;

public class Dog extends Mammal{
    public Dog(String name) {
        super(name);
    }
    public void greets(){
        System.out.println("Woof");
    }


    @Override
    public String toString() {
        return "Dog{}";
    }
}
