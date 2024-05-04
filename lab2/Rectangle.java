package Task;
/*Write a java program to create a class called Rectangle with width and height attributes.
 Calculate the area and perimeter of the rectangle */
public class Rectangle {
	double width,height;
	void setWidth(double width){
		this.width=width;
	}
	void setheight(double height){
		this.height=height;
	}
	double getArea() {
		return width*height;
	}
	double getPerimeter() {
		return 2*(width+height);
	}
	public static void main(String args[]) {
		Rectangle r1=new Rectangle();
		r1.setheight(5);
		r1.setWidth(20);
		System.out.println("The area is: "+r1.getArea());
		System.out.println("The perimeter is: "+r1.getPerimeter());
	}
}
