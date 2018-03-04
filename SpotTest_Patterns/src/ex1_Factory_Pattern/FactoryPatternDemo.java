package ex1_Factory_Pattern;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Circle circle = new Circle();
		circle.draw();
		Shape shape1 = shapeFactory.getShape("SQUARE");
		circle.draw();
		shape1.draw();
		Shape shape2 = shapeFactory.getShape("TrIanGle");
		shape2.draw();
	}

}
