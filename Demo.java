package laba2;

import java.util.*;

public class Demo {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sr = new Scanner(System.in);
		int a, b, age, gender, level;
		double weight, height, lev = 0;	
		System.out.println("��� ��� � ��: ");
		weight=sr.nextDouble();
		System.out.println("��� ���� � ��: ");
		height=sr.nextDouble();
		System.out.println("��� �������: ");
		age=sr.nextInt();
		System.out.println("�������� ���������� �������: ");
		System.out.println("1 - ������� ����� ����� � ������ ���������� ");
		System.out.println("2 - 1-3 ���� � ������ ������� ���������� ");
		System.out.println("3 - 3-5 ��� � ������ ���������� ");
		System.out.println("4 - 5-7 ��� � ������ ���������� ��� ������� ������ ");
		level=sr.nextInt();
		switch(level){
		case 1: lev=1.2; break;
		case 2: lev=1.38; break;
		case 3: lev=1.55; break;
		case 4: lev=1.73; break;
		}
		System.out.println("��� ���: ");
		System.out.println("1 - ������� ");
		System.out.println("2 - ������� ");
		gender=sr.nextInt();
		switch(gender){
		case 1:
		{
			Woman female=new Woman(weight,height,age);
			System.out.println("���� ����.");
			System.out.println("1 - �������� ����.");
			System.out.println("2 - ����� ���� (�������� �����).");
			System.out.println("3 - ����������� ����.");
			a=sr.nextInt();
			switch(a){
			case 1: {
				System.out.println("���� �������");
				System.out.println("1 - �������.");
				System.out.println("2 - �����������.");
				System.out.println("3 - ��������������.");
				b=sr.nextInt();
				switch(b){
				case 1:{
					System.out.println("");
					female.PFC(lev,0.8);
					System.out.println("");
					System.out.println("�������� ������ ��������� ��� �������");
					BasicProgram pr=new BasicProgram();
					pr.getInfoLoss();
					System.out.println("");
					System.out.println("��� ������������� ����� ������� ���������� � ������ �������.");
				}break;
				case 2:{
					System.out.println("");
					female.PFC(lev,0.8);
					System.out.println("");
					System.out.println("�������� ������ ��������� ��� �������");
					ExpandedProgram pr=new ExpandedProgram();
					pr.getInfoLoss();
					System.out.println("");
					System.out.println("��� ������������� ����� ������� ���������� � ������ �������.");
				}break;
				case 3:
				{
					System.out.println("");
					female.PFC(lev,0.8);
					System.out.println("");
					System.out.println("�������� ������ ��������� ��� �������");
					IndividuallyProgram pr=new IndividuallyProgram();
					pr.getInfoLoss();
					System.out.println("");
					System.out.println("��� ������������� ����� ������� ���������� � ������ �������.");
				}break;
				}
			}break;
			case 2:
			{
				System.out.println("���� �������");
				System.out.println("1 - �������.");
				System.out.println("2 - ��������������.");
				b=sr.nextInt();
				switch(b){
				case 1:{
					System.out.println("");
					female.PFC(lev,1.2);
					System.out.println("");
					System.out.println("�������� ������ ��������� ��� �������");
					BasicProgram pr=new BasicProgram();
					pr.getInfoGaining();
					System.out.println("");
					System.out.println("��� ������������� ����� ������� ���������� � ������ �������.");
				}break;
				case 2:{
					System.out.println("");
					female.PFC(lev,1.2);
					System.out.println("");
					System.out.println("�������� ������ ��������� ��� �������");
					IndividuallyProgram pr=new IndividuallyProgram();
					pr.getInfoGaining();
					System.out.println("");
					System.out.println("��� ������������� ����� ������� ���������� � ������ �������.");
				}break;
				}
			}break;
			case 3: {
				System.out.println("���� �������");
				System.out.println("1 - �������.");
				System.out.println("2 - ��������������.");
				b=sr.nextInt();
				switch(b){
				case 1:{
					System.out.println("");
					female.PFC(lev,1.0);
					System.out.println("");
					System.out.println("�������� ������ ��������� ��� �������");
					BasicProgram pr=new BasicProgram();
					pr.getInfoMaintenance();
					System.out.println("");
					System.out.println("��� ������������� ����� ������� ���������� � ������ �������.");
				}break;
				case 2:{
					System.out.println("");
					female.PFC(lev,1.0);
					System.out.println("");
					System.out.println("�������� ������ ��������� ��� �������");
					IndividuallyProgram pr=new IndividuallyProgram();
					pr.getInfoMaintenance();
					System.out.println("");
					System.out.println("��� ������������� ����� ������� ���������� � ������ �������.");
				}break;
				}
			}
			}
		}break;
		case 2:{
			Man male=new Man(weight,height,age);
			System.out.println("���� ����.");
			System.out.println("1 - �������� ����.");
			System.out.println("2 - ����� ���� (�������� �����).");
			System.out.println("3 - ����������� ����.");
			a=sr.nextInt();
			switch(a){
			case 1: {
				System.out.println("���� �������");
				System.out.println("1 - �������.");
				System.out.println("2 - �����������.");
				System.out.println("3 - ��������������.");
				b=sr.nextInt();
				switch(b){
				case 1:{
					System.out.println("");
					male.PFC(lev,0.8);
					System.out.println("");
					System.out.println("�������� ������ ��������� ��� �������");
					BasicProgram pr=new BasicProgram();
					pr.getInfoLoss();
					System.out.println("");
					System.out.println("��� ������������� ����� ������� ���������� � ������ �������.");
				}break;
				case 2:{
					System.out.println("");
					male.PFC(lev,0.8);
					System.out.println("");
					System.out.println("�������� ������ ��������� ��� �������");
					ExpandedProgram pr=new ExpandedProgram();
					pr.getInfoLoss();
					System.out.println("");
					System.out.println("��� ������������� ����� ������� ���������� � ������ �������.");
				}break;
				case 3:
				{
					System.out.println("");
					male.PFC(lev,0.8);
					System.out.println("");
					System.out.println("�������� ������ ��������� ��� �������");
					IndividuallyProgram pr=new IndividuallyProgram();
					pr.getInfoLoss();
					System.out.println("");
					System.out.println("��� ������������� ����� ������� ���������� � ������ �������.");
				}break;
				}
			}break;
			case 2:
			{
				System.out.println("���� �������");
				System.out.println("1 - �������.");
				System.out.println("2 - ��������������.");
				b=sr.nextInt();
				switch(b){
				case 1:{
					System.out.println("");
					male.PFC(lev,1.2);
					System.out.println("");
					System.out.println("�������� ������ ��������� ��� �������");
					BasicProgram pr=new BasicProgram();
					pr.getInfoGaining();
					System.out.println("");
					System.out.println("��� ������������� ����� ������� ���������� � ������ �������.");
				}break;
				case 2:{
					System.out.println("");
					male.PFC(lev,1.2);
					System.out.println("");
					System.out.println("�������� ������ ��������� ��� �������");
					IndividuallyProgram pr=new IndividuallyProgram();
					pr.getInfoGaining();
					System.out.println("");
					System.out.println("��� ������������� ����� ������� ���������� � ������ �������.");
				}break;
				}
			}break;
			case 3: {
				System.out.println("���� �������");
				System.out.println("1 - �������.");
				System.out.println("2 - ��������������.");
				b=sr.nextInt();
				switch(b){
				case 1:{
					System.out.println("");
					male.PFC(lev,1.0);
					System.out.println("");
					System.out.println("�������� ������ ��������� ��� �������");
					BasicProgram pr=new BasicProgram();
					pr.getInfoMaintenance();
					System.out.println("");
					System.out.println("��� ������������� ����� ������� ���������� � ������ �������.");
				}break;
				case 2:{
					System.out.println("");
					male.PFC(lev,1.0);
					System.out.println("");
					System.out.println("�������� ������ ��������� ��� �������");
					IndividuallyProgram pr=new IndividuallyProgram();
					pr.getInfoMaintenance();
					System.out.println("");
					System.out.println("��� ������������� ����� ������� ���������� � ������ �������.");
				}break;
				}
			}
			}
		}
		}
	}
}
