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
		// System.out.print("��Ʒ���� 1:" );
		// bill1 = in.nextInt();
		// int bill2 = 0;
		// System.out.print("��Ʒ����2:");
		// bill2= in.nextInt();
		// System.out.println(bill1 + "+" + bill2 + "=" + (bill1+bill2));

		// int i = 0;
		// System.out.println("1:"+i);
		// i = i+1; //��Ŀ�����
		// //+ - * / ������Ҫ��������������ɵ�����ж�Ŀ����,���ǵ�������ж�Ŀ�����
		// System.out.println("2:"+i);
		// System.out.println("a:"+(++i));
		// System.out.println("b:"+(i++));
		// System.out.println("c:"+i);

//		int[] �۸� = { 33, 22, 11 };
//		String[] ��Ʒ���� = { "����", "ţ��", "�۹���" };
//		double �ܼ� = 0.0; //��������ֵ
//		do {
//			System.out.println("��������Ʒ���");
//			Scanner in = new Scanner(System.in);
//			int �����ֵ = in.nextInt();
////			System.out.println("�����ֵ��:" + �����ֵ);
//			if(��Ʒ����.length<�����ֵ+1){
//				System.out.println("û�д���Ʒ");
//				System.out.println("���ܹ�����:"+�ܼ�+"Ԫ");
//				continue;
//			}
//			System.out.println(��Ʒ����[�����ֵ] + "�ļ۸���:" + �۸�[�����ֵ]);
//			�ܼ� = �ܼ� + �۸�[�����ֵ];
//			System.out.println("���ܹ�����:"+�ܼ�+"Ԫ");
//			System.out.println("*****************************");
//		} while (true);
		double[] �߲˼۸�={ 3.5 , 2.5 , 4.8 };
		String[] �߲�����={ "������" ," �˻�" , "����" };
//		int[]�߲˸���={1,2,3};		
		double �ܼ�=0.0;
		do{
			System.out.println("��������Ʒ���");
			Scanner in=new Scanner(System.in);
			int �����ֵ=in.nextInt();
			System.out.println("�����ֵ��:" +�����ֵ);
			if(�߲�����.length<�����ֵ+1){
				System.out.println("û�д��߲�");
				System.out.println("���ܹ�����:"+�ܼ�+"Ԫ");
				continue;
			}
			String name = �߲�����[�����ֵ];
			double price  = �߲˼۸�[�����ֵ];
			System.out.println(name + "�ĵ�����"+price);
			System.out.println("������Ҫ���������");
			�����ֵ=in.nextInt();
			
			�ܼ�=�ܼ�+price * �����ֵ;
			System.out.println("���ܹ�����:"+�ܼ�+"Ԫ");
		}while(true);

	}
}
