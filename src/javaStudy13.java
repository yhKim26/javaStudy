
public class javaStudy13
{
	static class Animal{
		String name;

		void eat(){
			System.out.println("먹는다");
		}
	}

	static class Dog extends Animal{}
	static class Cat extends Animal{}


	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.name = "고양이";
		cat.eat();

		Dog dog = new Dog();
		dog.name = "강아지";
		dog.eat();
		
	}
} 
