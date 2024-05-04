package Task;
/*Write a java program to create a class called Dog with a name and breed attribute. Create two
instances of the dog class and save their attributes using constructor and modify the attributes 
using setter methods and display the updated attributes.*/
public class Dog {
	String name, breed;
	Dog(String name, String breed){
		this.name=name;
		this.breed=breed;
	}
	void setName(String name){
		this.name=name;
	}
	void setBreed(String breed) {
		this.breed=breed;
	}
	void display() {
		System.out.println(name+" "+breed);
	}
	public static void main(String args[]) {
		Dog d1=new Dog("Emran", "Greyhound");
		Dog d2=new Dog("Faiga", "Pug");
		d1.display();
		d2.display();
		d1.setBreed("Chihuahua");
		d1.display();
	}
}
