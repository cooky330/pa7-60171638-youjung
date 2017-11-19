public  class Circle extends Shape{
	int r;
	
	public Circle(int x,int y,int r) {
		super(x,y);
		this.r=r;
	}
	public double getArea() {
		double area;
		area=r*r*Math.PI;
		return area;
	}
	public double getLength() {
		double length;
		length=2*Math.PI*r;
		return length;
	}
	@Override
	public void draw() {
		System.out.println("Circle center("+x+".0, "+y+".0)-radius("+r+".0)");
		
	}

}
