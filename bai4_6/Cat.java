package day3.baitapvenha.bai4_6;

public class Cat extends Mammal{
    public Cat(String name) {
        super(name);
    }
    public void greeets(){
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return "Cat{}";
    }
}
