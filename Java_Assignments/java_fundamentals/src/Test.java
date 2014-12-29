import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no of Dimensions: ");
		int noOfDimension;
		Scanner scanner=new Scanner(System.in);
		noOfDimension=scanner.nextInt();
		if(noOfDimension>=3)
		{
			Polygon polygon=Polygon.getInstance(noOfDimension);
			polygon.perimeterOfPolygons();
			polygon.additionOfAngles();
		}
		else
		{
			System.out.println("You have entered wrong Dimension");
		}
	}

}

abstract class Polygon {
		abstract void perimeterOfPolygons();
		
		abstract void additionOfAngles();
		
		static Polygon getInstance(int dimension){
			
			switch(dimension)
			{
			case 3: return new Triangle();
			case 4: return new Quadrilateral();
			case 5: return new Pentagon();
			case 6: return new Hexagon();
			case 7: return new Heptagon();
			case 8: return new Octagon();
			case 9: return new Enneagon();
			case 10: return new Decagon();
			}
			return null;
		}
}

class Triangle extends Polygon {

	@Override
	void perimeterOfPolygons() {
		// TODO Auto-generated method stub
		int perimeter=0;		
		for(int i=1;i<=3;i++)
		{
			System.out.println("Enter "+i+" side of Triangle: ");
			Scanner scanner=new Scanner(System.in);
			int valueOfSide=scanner.nextInt();
			perimeter=perimeter+valueOfSide;
		}
		System.out.println("Perimeter is:"+perimeter);
	}

	@Override
	void additionOfAngles() {
		// TODO Auto-generated method stub
		System.out.println("Addition of Angles of a Triangle is: 180");
	}
	
}

class Quadrilateral extends Polygon {

	@Override
	void perimeterOfPolygons() {
		// TODO Auto-generated method stub
		int perimeter=0;		
		for(int i=1;i<=4;i++)
		{
			System.out.println("Enter "+i+" side of Quadrilateral: ");
			Scanner scanner=new Scanner(System.in);
			int valueOfSide=scanner.nextInt();
			perimeter=perimeter+valueOfSide;
		}
		System.out.println("Perimeter is:"+perimeter);
	}

	@Override
	void additionOfAngles() {
		// TODO Auto-generated method stub
		System.out.println("Addition of Angles of a Quadrilateral is: 360");
	}
	

}

class Pentagon extends Polygon {

	@Override
	void perimeterOfPolygons() {
		// TODO Auto-generated method stub
		int perimeter=0;		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Enter "+i+" side of Pentagon: ");
			Scanner scanner=new Scanner(System.in);
			int valueOfSide=scanner.nextInt();
			perimeter=perimeter+valueOfSide;
		}
		System.out.println("Perimeter is:"+perimeter);
	}

	@Override
	void additionOfAngles() {
		// TODO Auto-generated method stub
		System.out.println("Addition of Angles of a Pentagon is: 540");
	}
	

}

class Hexagon extends Polygon {

	@Override
	void perimeterOfPolygons() {
		// TODO Auto-generated method stub
		int perimeter=0;		
		for(int i=1;i<=6;i++)
		{
			System.out.println("Enter "+i+" side of Hexagon: ");
			Scanner scanner=new Scanner(System.in);
			int valueOfSide=scanner.nextInt();
			perimeter=perimeter+valueOfSide;
		}
		System.out.println("Perimeter is:"+perimeter);
	}

	@Override
	void additionOfAngles() {
		// TODO Auto-generated method stub
		System.out.println("Addition of Angles of a Hexagon is: 720");
	}
	

}

class Heptagon extends Polygon {

	@Override
	void perimeterOfPolygons() {
		// TODO Auto-generated method stub
		int perimeter=0;		
		for(int i=1;i<=7;i++)
		{
			System.out.println("Enter "+i+" side of Heptagon: ");
			Scanner scanner=new Scanner(System.in);
			int valueOfSide=scanner.nextInt();
			perimeter=perimeter+valueOfSide;
		}
		System.out.println("Perimeter is:"+perimeter);
	}

	@Override
	void additionOfAngles() {
		// TODO Auto-generated method stub
		System.out.println("Addition of Angles of a Heptagon is: 900");
	}
	

}

class Octagon extends Polygon {

	@Override
	void perimeterOfPolygons() {
		// TODO Auto-generated method stub
		int perimeter=0;		
		for(int i=1;i<=8;i++)
		{
			System.out.println("Enter "+i+" side of Octagon: ");
			Scanner scanner=new Scanner(System.in);
			int valueOfSide=scanner.nextInt();
			perimeter=perimeter+valueOfSide;
		}
		System.out.println("Perimeter is:"+perimeter);
	}

	@Override
	void additionOfAngles() {
		// TODO Auto-generated method stub
		System.out.println("Addition of Angles of a Octagon is: 1080");
	}
	

}

class Enneagon extends Polygon {

	@Override
	void perimeterOfPolygons() {
		// TODO Auto-generated method stub
		int perimeter=0;		
		for(int i=1;i<=9;i++)
		{
			System.out.println("Enter "+i+" side of Enneagon: ");
			Scanner scanner=new Scanner(System.in);
			int valueOfSide=scanner.nextInt();
			perimeter=perimeter+valueOfSide;
		}
		System.out.println("Perimeter is:"+perimeter);
	}

	@Override
	void additionOfAngles() {
		// TODO Auto-generated method stub
		System.out.println("Addition of Angles of a Enneagon is: 1260");
	}
	

}

class Decagon extends Polygon {

	@Override
	void perimeterOfPolygons() {
		// TODO Auto-generated method stub
		int perimeter=0;		
		for(int i=1;i<=10;i++)
		{
			System.out.println("Enter "+i+" side of Decagon: ");
			Scanner scanner=new Scanner(System.in);
			int valueOfSide=scanner.nextInt();
			perimeter=perimeter+valueOfSide;
		}
		System.out.println("Perimeter is:"+perimeter);
	}

	@Override
	void additionOfAngles() {
		// TODO Auto-generated method stub
		System.out.println("Addition of Angles of a Decagon is: 1440");
	}
	

}