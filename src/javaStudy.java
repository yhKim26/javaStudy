
public class javaStudy {

	public static void main(String args[]) {
		Animal animal = new Animal();
		Dog dog = new Dog();
		
		animal.sound();
		dog.sound();
	}

}

class Animal{

	void sound(){
		System.out.println("동물이 소리를 냅니다");

	}
}
class Dog extends Animal{
	void sound(){
		System.out.println("멍멍!");
	}
}