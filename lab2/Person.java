package Task;
/*Write a java program to create a class called Person with name and age attribute. Create
two instances of the person class. Save their attributes with a constructor and print their
name and age.*/

public class Person {
	int age;
	String name;
	Person(int age, String name){
		this.age=age;
		this.name=name;
	}
	public void display() {System.out.println(age+" "+name);}
	public static void main(String args[]) {
		Person per1=new Person(12,"MR HELLO");
		Person per2=new Person(11, "MS BYE");
		per1.display();
		per2.display();
	}
}