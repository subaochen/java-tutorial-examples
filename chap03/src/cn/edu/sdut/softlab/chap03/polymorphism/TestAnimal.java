package cn.edu.sdut.softlab.chap03.polymorphism;

public class TestAnimal {

  public static void main(String[] args) {
    Animal[] animals = new Animal[3];
    animals[0] = new Dog();
    animals[1] = new Cat();
    animals[2] = new Duke();
    for (Animal animal : animals) {
      animal.hello();
    }
  }
}
