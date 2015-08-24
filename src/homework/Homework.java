package homework;

import java.util.Random;
import java.util.Scanner;

public class Homework {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println("Hello");
		// Scanner in = new Scanner(System.in);
		// System.out.println("echo:" + in.nextLine());
		// int bill1 = 0;
		// System.out.print("菜品名字 1:" );
		// bill1 = in.nextInt();
		// int bill2 = 0;
		// System.out.print("菜品名字2:");
		// bill2= in.nextInt();
		// System.out.println(bill1 + "+" + bill2 + "=" + (bill1+bill2));

		// int i = 0;
		// System.out.println("1:"+i);
		// i = i+1; //二目运算符
		// //+ - * / 这种需要两个参数才能完成的运算叫二目运算,他们的运算符叫二目运算符
		// System.out.println("2:"+i);
		// System.out.println("a:"+(++i));
		// System.out.println("b:"+(i++));
		// System.out.println("c:"+i);

//		int[] 价格 = { 33, 22, 11 };
//		String[] 商品名称 = { "酸奶", "牛奶", "哇哈哈" };
//		double 总价 = 0.0; //声明并赋值
//		do {
//			System.out.println("请输入商品编号");
//			Scanner in = new Scanner(System.in);
//			int 输入的值 = in.nextInt();
////			System.out.println("输入的值是:" + 输入的值);
//			if(商品名称.length<输入的值+1){
//				System.out.println("没有此商品");
//				System.out.println("您总共消费:"+总价+"元");
//				continue;
//			}
//			System.out.println(商品名称[输入的值] + "的价格是:" + 价格[输入的值]);
//			总价 = 总价 + 价格[输入的值];
//			System.out.println("您总共消费:"+总价+"元");
//			System.out.println("*****************************");
//		} while (true);
		double[] 蔬菜价格={ 3.5 , 2.5 , 4.8 };
		String[] 蔬菜名称={ "西红柿" ," 菜花" , "土豆" };
//		int[]蔬菜个数={1,2,3};		
		double 总价=0.0;
		do{
			System.out.println("请输入商品编号");
			Scanner in=new Scanner(System.in);
			int 输入的值=in.nextInt();
			System.out.println("输入的值是:" +输入的值);
			if(蔬菜名称.length<输入的值+1){
				System.out.println("没有此蔬菜");
				System.out.println("您总共消费:"+总价+"元");
				continue;
			}
			String name = 蔬菜名称[输入的值];
			double price  = 蔬菜价格[输入的值];
			System.out.println(name + "的单价是"+price);
			System.out.println("请输入要够买的数量");
			输入的值=in.nextInt();
			
			总价=总价+price * 输入的值;
			System.out.println("您总共消费:"+总价+"元");
		}while(true);

	}
}
