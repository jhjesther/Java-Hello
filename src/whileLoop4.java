
public class whileLoop4 {
	 Scanner sc = null;
     Grade2 grade = null;
     int kor, eng, math;
     String name;
     ///////////////////////////////////
           
     while (true) {
        sc = new Scanner(System.in);         

        System.out.print("이름:");
        name = sc.next();
        
        System.out.print("국어:");
        kor = sc.nextInt();

        System.out.print("영어:");
        eng = sc.nextInt();
        
        System.out.print("수학:");
        math = sc.nextInt();
        
        grade = new Grade2(name, kor, eng, math);

        grade.showInfo();
        

        System.out.print("계속?");
        String choice = sc.next();

        if (choice.compareToIgnoreCase("yes") == 0 || choice.compareToIgnoreCase("y") == 0)
           continue;
        else
           break;
     }

     System.out.println("종료되었습니다.");
}
