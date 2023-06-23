
public class RectangleArray {
	
	public static void main(String[] args){
    
	Rectangle3[]arrRec= new Rectangle3[2];
	
	

	arrRec[0] = new Rectangle3(40.50);

	arrRec[1] = new Rectangle3(20,50);
	
	double areaRec = 0;
	
	for(int i=0; i < arrRec.length;i++) {
	   
	         int width, height;
	         Scanner sc = new Scanner(System.in);
	         width = sc.nextInt();
	         height = sc.nextInt();         
	      
	         arrRec[i] = new Rectangle3(width,height);
	      }
		
		areaRec = areaRec + arrRec[i].getArea();}
	} 	

System.out.println(areaRec);
}