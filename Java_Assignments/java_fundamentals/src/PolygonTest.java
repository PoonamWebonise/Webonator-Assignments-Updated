import java.util.Scanner;


public class PolygonTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Polygons polygon=new PolygonShape();
		polygon.inputDimensions();
		polygon.perimeterOfPolygons();
		polygon.additionOfAngles();
	}
}
	abstract class Polygons {
		abstract void perimeterOfPolygons();
		
		abstract void additionOfAngles();
		void inputDimensions() {
		}
		
	}
	
	class PolygonShape extends Polygons {
		
		int noOfDimension;
		void inputDimensions(){
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter the Dimension: ");
			noOfDimension=scanner.nextInt();
		}
		void perimeterOfPolygons() {
		// TODO Auto-generated method stub
		int perimeter=0;		
		if(noOfDimension>=3)
		{
			for(int i=1;i<=noOfDimension;i++)
			{
				System.out.println("Enter "+i+" side of Polygon: ");
				Scanner scanner=new Scanner(System.in);
				int valueOfSide=scanner.nextInt();
				perimeter=perimeter+valueOfSide;
			}
			System.out.println("Perimeter is:"+perimeter);
		}
		else {
			System.out.println("You have Entered wrong Dimension");
		}
	}

	@Override
	void additionOfAngles() {
		// TODO Auto-generated method stub
		if(noOfDimension>=3)
		{
			int additionOfAngle=((noOfDimension-2)*180);
			System.out.println("Addition of Angles of Polygon is: "+additionOfAngle);
		}
		else {
			System.out.println("You have Entered wrong Dimension");
		}
	}
	
}