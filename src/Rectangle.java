public class Rectangle extends Shape{
	int x2;
	int y2;
	
	public Rectangle(int x,int y,int x2,int y2) {
		super(x,y);
		this.x2=x2;
		this.y2=y2;
	}
	public double getArea() {
		double area;
		area=x2*y2;
		return area;
	}
	public double getLength() {
		double length;
		length=(x2+y2)*2;
		return length;
	}
	@Override
	public void draw() {
		int x3=x+x2;
		int y3=y+y2;
		System.out.println("Rectangle "+"("+x+".0, "+y+".0)-("+x3+".0, "+y3+".0)");
		
	}
}
