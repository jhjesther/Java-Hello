		Scanner sc = new Scanner(System.in);
       int answer = (int)(Math.random() * 100 + 1);
       int num=0;
       int count = 1;
       
       while(true) {
          
          System.out.println("1~100 사이에 숫자를 맞춰보세요 :");
          
          try {
             sc = new Scanner(System.in);
              num = sc.nextInt();
         } catch (Exception e) {
            System.out.println("잘못된 입력입니다. 다시 입력해주세요");
            continue;
         }          
          
          if(num > answer) {
             System.out.println("Down");
          }else if(num < answer) {
             System.out.println("UP");
          }else if(num == answer){
             System.out.println("정답입니다." + count + "회 만에 맞췄어요.");
             break;
          }
          count++;
          
          
