package calculator;
	class Animal {
	    String name;
	    Animal(String name) {
	        this.name = name;
	    }
	    void makeSound() {
	        System.out.println(name + " makes a sound.");
	    }
	}
	class Dog extends Animal {
		Dog(String name) {
	        super(name); 
	    }
	    @Override
	    void makeSound() {
	        System.out.println(name + " barks.");
	    }
	}
	class Cat extends Animal {
		Cat(String name) {
	        super(name);
	    }
	    @Override
	    void makeSound() {
	        System.out.println(name + " meows.");
	    }
	}
	public class oop {
	    public static void main(String[] args) {
	        Animal genericAnimal = new Animal("Animal");
	        Dog dog = new Dog("Rex");
	        Cat cat = new Cat("Whiskers");
	        genericAnimal.makeSound(); 
	        dog.makeSound();           
	        cat.makeSound();           
	    }
	}
