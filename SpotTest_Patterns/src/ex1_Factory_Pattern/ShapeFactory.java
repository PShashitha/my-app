package ex1_Factory_Pattern;

public class ShapeFactory {
	public Shape getShape(String type) {
		if(type.equalsIgnoreCase("Square"))
			return new Square();
		else if(type.equalsIgnoreCase("Circle"))
			return new Circle();
		else if(type.equalsIgnoreCase("Rectangle"))
			return new Square();
		else if(type.equalsIgnoreCase("Triangle"))
			return new Triangle();
		else 
			return null;
	}

}
