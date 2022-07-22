package my;

import java.util.Scanner;

public class myPractice {
	 public static void main(String[] args) {
		 //实例化 声明一个Scanner
		 Scanner scan = new Scanner(System.in);
		 

		 System.out.println("请输入你的姓名：");
		 String name = scan.next();
		 System.out.println(name);
		 
		 System.out.println("年龄");
		 int num = scan.nextInt();
		 System.out.println(num);
		 
		 System.out.println("体重");
		 double weight = scan.nextDouble();
		 System.out.println(weight);
		 
		 System.out.println("是否单身");
		 boolean isSingle = scan.nextBoolean();
		 System.out.println(isSingle);
		 
		 System.out.println("性别");
		 String TF = scan.next();
		 char gender = TF.charAt(0);
		 System.out.println(gender);
	 }
}
