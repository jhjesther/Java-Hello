import java.util.Scanner;

public class ScannerTest2 {
	
	while (true) {
		
		Scanner sc = new Scanner(System.in);
		Rectangle3 rectangle;
		
	  System.out.print("가로");
	  double width = sc.nextDouble();
	  
	  System.out.print("세로");
	  doublel height = sc.nextDouble();
	  
	  rectangle = new Rectangle3(width,height);
	  
	  System.out.println("넓이는:" + rectangle.getArea());
	  
	}
		
		
		System.out.print("계속?")
		String choice = sc.next();
		if((choice.compareToIgnoreCase("yes")==0)||choice.equals("y"))
			continue;
		else
			break;
	}
	
	System.out.println("종료되었습니다")
	
	
	
}
