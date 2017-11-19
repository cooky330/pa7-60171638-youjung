public class ShapeTest {
	public static void main(String[] args) {
		Shape[] shapes=new Shape[3];
		shapes[0]=new Rectangle(10,20,30,40);
		shapes[1]=new Rectangle(30,30,10,10);
		shapes[2]=new Circle(50,20,30);
		
		for(Shape s:shapes) {
			System.out.printf("Area: %.1f\n", s.getArea());
			System.out.printf("Length: %.1f\n", s.getLength());
		}
		Drawable[] drawables=new Drawable[4];
		for(int i=0;i<shapes.length;i++) {
			drawables[i]=(Drawable) shapes[i];
		}
		drawables[3]=new Text("Sample Text");
		for(Drawable d:drawables) {                                                                                                
			d.draw();
		}
	}
}   
/*주석-60171638 소유정:
먼저 Drawable을 interface로 작성하고 draw라는 메소드를 하나 생성한다.
Shape의 interface가 Drawable이므로 Shape는 추상클래스여야 한다. 
Shape안에 좌표를 받는 인자와, 넓이와 둘레를 각각 받는 메소드를 생성한다.
이제 Shape의 하위클래스인 Rectangle과 Circle클래스안의 넓이와 둘레 메소드를 각각 override해준다.
draw메소드까지 override해준다. Drawable을 interface로 받는 Text 클래스도 만들어 draw메소드를 override한다. 
*/