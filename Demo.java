package laba2;

import java.util.*;

public class Demo {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sr = new Scanner(System.in);
		int a, b, age, gender, level;
		double weight, height;	
		System.out.println("��� ��� � ��: ");
		weight=sr.nextDouble();
		System.out.println("��� ���� � ��: ");
		height=sr.nextDouble();
		System.out.println("��� �������: ");
		age=sr.nextInt();
		System.out.println("��� ���: ");
		System.out.println("1 - ������� ");
		System.out.println("2 - ������� ");
		gender=sr.nextInt();
		System.out.println("�������� ���������� �������: ");
		System.out.println("1 - ������� ����� ����� � ������ ���������� ");
		System.out.println("2 - 1-3 ���� � ������ ������� ���������� ");
		System.out.println("3 - 3-5 ��� � ������ ���������� ");
		System.out.println("4 - 5-7 ��� � ������ ���������� ��� ������� ������ ");
		level=sr.nextInt();
			
		System.out.println("���� ����.");
		System.out.println("1 - �������� ����.");
		System.out.println("2 - ����� ���� (�������� �����).");
		System.out.println("3 - ����������� ����.");
		a=sr.nextInt();
		switch(a){
		case 1:{
			System.out.println("����� ��������� �������� ���� �� ������ ��������?");
			System.out.println("1 - �������.");
			System.out.println("2 - �����������.");
			System.out.println("3 - ��������������.");
			b=sr.nextInt();
			switch(b){
			case 1:
			{
				BasicProgram include = new BasicProgram(weight,height,age);
				System.out.println(" ");
				if (gender==1){
					if (level==1){
						include.PFCWoman(1.2,0.8);
					}
					if (level==2){
						include.PFCWoman(1.38,0.8);
					}
					if (level==3){
						include.PFCWoman(1.55,0.8);
					}
					if (level==4){
						include.PFCWoman(1.73,0.8);
					}
				}
				if (gender==2){
					if (level==1){
						include.PFCMan(1.2,0.8);
					}
					if (level==2){
						include.PFCMan(1.38,0.8);
					}
					if (level==3){
						include.PFCMan(1.55,0.8);
					}
					if (level==4){
						include.PFCMan(1.73,0.8);
					}
				}
				System.out.println(" ");
				System.out.println("� ��� ���� ������� ���������� ��������");
				include.getInfoLoss();
				System.out.println(" ");
				System.out.println("��� ������������� ������ ����� ������� ���������� � ������ �������. ");
			}break;
			case 2:
			{
				ExpandedProgram include = new ExpandedProgram(weight,height,age);
				System.out.println(" ");
				if (gender==1){
					if (level==1){
						include.PFCWoman(1.2,0.8);
					}
					if (level==2){
						include.PFCWoman(1.38,0.8);
					}
					if (level==3){
						include.PFCWoman(1.55,0.8);
					}
					if (level==4){
						include.PFCWoman(1.73,0.8);
					}
				}
				if (gender==2){
					if (level==1){
						include.PFCMan(1.2,0.8);
					}
					if (level==2){
						include.PFCMan(1.38,0.8);
					}
					if (level==3){
						include.PFCMan(1.55,0.8);
					}
					if (level==4){
						include.PFCMan(1.73,0.8);
					}
				}
				System.out.println(" ");
				System.out.println("� ��� ���� ������� ���������� ��������");
				include.getInfoLoss();
				System.out.println(" ");
				System.out.println("��� ������������� ������ ����� ������� ���������� � ������ �������. ");
			}break;
			case 3:
			{
				IndividuallyProgram include = new IndividuallyProgram(weight,height,age);
				System.out.println(" ");
				if (gender==1){
					if (level==1){
						include.PFCWoman(1.2,0.8);
					}
					if (level==2){
						include.PFCWoman(1.38,0.8);
					}
					if (level==3){
						include.PFCWoman(1.55,0.8);
					}
					if (level==4){
						include.PFCWoman(1.73,0.8);
					}
				}
				if (gender==2){
					if (level==1){
						include.PFCMan(1.2,0.8);
					}
					if (level==2){
						include.PFCMan(1.38,0.8);
					}
					if (level==3){
						include.PFCMan(1.55,0.8);
					}
					if (level==4){
						include.PFCMan(1.73,0.8);
					}
				}
				System.out.println(" ");
				System.out.println("� ��� ���� ������� ���������� ��������");
				include.getInfoLoss();
				System.out.println(" ");
				System.out.println("��� ������������� ������ ����� ������� ���������� � ������ �������. ");
			}break;
			}break;
		}
		case 2:
		{
			System.out.println("����� ��������� ������ ���� �� ������ ��������?");
			System.out.println("1 - �������.");
			System.out.println("2 - ��������������.");
			b=sr.nextInt();
			switch(b){
			case 1:
			{
				BasicProgram include = new BasicProgram(weight,height,age);
				System.out.println(" ");
				if (gender==1){
					if (level==1){
						include.PFCWoman(1.2,1.2);
					}
					if (level==2){
						include.PFCWoman(1.38,1.2);
					}
					if (level==3){
						include.PFCWoman(1.55,1.2);
					}
					if (level==4){
						include.PFCWoman(1.73,1.2);
					}
				}
				if (gender==2){
					if (level==1){
						include.PFCMan(1.2,1.2);
					}
					if (level==2){
						include.PFCMan(1.38,1.2);
					}
					if (level==3){
						include.PFCMan(1.55,1.2);
					}
					if (level==4){
						include.PFCMan(1.73,1.2);
					}
				}
				System.out.println(" ");
				System.out.println("� ��� ���� ������� ���������� ��������");
				include.getInfoGaining();
				System.out.println(" ");
				System.out.println("��� ������������� ������ ����� ������� ���������� � ������ �������. ");
			}break;
			case 2:
			{
				IndividuallyProgram include = new IndividuallyProgram(weight,height,age);
				System.out.println(" ");
				if (gender==1){
					if (level==1){
						include.PFCWoman(1.2,1.2);
					}
					if (level==2){
						include.PFCWoman(1.38,1.2);
					}
					if (level==3){
						include.PFCWoman(1.55,1.2);
					}
					if (level==4){
						include.PFCWoman(1.73,1.2);
					}
				}
				if (gender==2){
					if (level==1){
						include.PFCMan(1.2,1.2);
					}
					if (level==2){
						include.PFCMan(1.38,1.2);
					}
					if (level==3){
						include.PFCMan(1.55,1.2);
					}
					if (level==4){
						include.PFCMan(1.73,1.2);
					}
				}
				System.out.println(" ");
				System.out.println("� ��� ���� ������� ���������� ��������");
				include.getInfoGaining();
				System.out.println(" ");
				System.out.println("��� ������������� ������ ����� ������� ���������� � ������ �������. ");
			}break;
			}break;
		}
		case 3:
		{
			System.out.println("����� ��������� ����������� ���� �� ������ ��������?");
			System.out.println("1 - �������.");
			System.out.println("2 - ��������������.");
			b=sr.nextInt();
			switch(b){
			case 1:
			{
				BasicProgram include = new BasicProgram(weight,height,age);
				System.out.println(" ");
				if (gender==1){
					if (level==1){
						include.PFCWoman(1.2,1.0);
					}
					if (level==2){
						include.PFCWoman(1.38,1.0);
					}
					if (level==3){
						include.PFCWoman(1.55,1.0);
					}
					if (level==4){
						include.PFCWoman(1.73,1.0);
					}
				}
				if (gender==2){
					if (level==1){
						include.PFCMan(1.2,1.0);
					}
					if (level==2){
						include.PFCMan(1.38,1.0);
					}
					if (level==3){
						include.PFCMan(1.55,1.0);
					}
					if (level==4){
						include.PFCMan(1.73,1.0);
					}
				}
				System.out.println(" ");
				System.out.println("� ��� ���� ������� ���������� ��������");
				include.getInfoMaintenance();
				System.out.println(" ");
				System.out.println("��� ������������� ������ ����� ������� ���������� � ������ �������. ");
			}break;
			case 2:
			{
				IndividuallyProgram include = new IndividuallyProgram(weight,height,age);
				System.out.println(" ");
				if (gender==1){
					if (level==1){
						include.PFCWoman(1.2,1.0);
					}
					if (level==2){
						include.PFCWoman(1.38,1.0);
					}
					if (level==3){
						include.PFCWoman(1.55,1.0);
					}
					if (level==4){
						include.PFCWoman(1.73,1.0);
					}
				}
				if (gender==2){
					if (level==1){
						include.PFCMan(1.2,1.0);
					}
					if (level==2){
						include.PFCMan(1.38,1.0);
					}
					if (level==3){
						include.PFCMan(1.55,1.0);
					}
					if (level==4){
						include.PFCMan(1.73,1.0);
					}
				}
				System.out.println(" ");
				System.out.println("� ��� ���� ������� ���������� ��������");
				include.getInfoMaintenance();
				System.out.println(" ");
				System.out.println("��� ������������� ������ ����� ������� ���������� � ������ �������. ");
			}break;
			}break;
		}
		}
	}
}
