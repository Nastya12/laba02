package laba2;

import java.util.*;

public class Demo {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sr = new Scanner(System.in);
		int a, b, age, gender, level;
		double weight, height, lev = 0;	
		System.out.println("Ваш вес в кг: ");
		weight=sr.nextDouble();
		System.out.println("Ваш рост в см: ");
		height=sr.nextDouble();
		System.out.println("Ваш возраст: ");
		age=sr.nextInt();
		System.out.println("Выберите подходящий вариант: ");
		System.out.println("1 - сидячий образ жизни с пешими прогулками ");
		System.out.println("2 - 1-3 раза в неделю обычные тренировки ");
		System.out.println("3 - 3-5 раз в неделю тренировки ");
		System.out.println("4 - 5-7 раз в неделю тренировки или тяжелая работа ");
		level=sr.nextInt();
		switch(level){
		case 1: lev=1.2; break;
		case 2: lev=1.38; break;
		case 3: lev=1.55; break;
		case 4: lev=1.73; break;
		}
		System.out.println("Ваш пол: ");
		System.out.println("1 - женский ");
		System.out.println("2 - мужской ");
		gender=sr.nextInt();
		switch(gender){
		case 1:
		{
			Woman female=new Woman(weight,height,age);
			System.out.println("Ваша цель.");
			System.out.println("1 - Снижение веса.");
			System.out.println("2 - Набор веса (мышечной массы).");
			System.out.println("3 - Поддержание веса.");
			a=sr.nextInt();
			switch(a){
			case 1: {
				System.out.println("План питания");
				System.out.println("1 - Базовый.");
				System.out.println("2 - Расширенный.");
				System.out.println("3 - Индивидуальный.");
				b=sr.nextInt();
				switch(b){
				case 1:{
					System.out.println("");
					female.PFC(lev,0.8);
					System.out.println("");
					System.out.println("Получить нужный результат вам помогут");
					BasicProgram pr=new BasicProgram();
					pr.getInfoLoss();
					System.out.println("");
					System.out.println("Для корректировки плана питания обратитесь к своему тренеру.");
				}break;
				case 2:{
					System.out.println("");
					female.PFC(lev,0.8);
					System.out.println("");
					System.out.println("Получить нужный результат вам помогут");
					ExpandedProgram pr=new ExpandedProgram();
					pr.getInfoLoss();
					System.out.println("");
					System.out.println("Для корректировки плана питания обратитесь к своему тренеру.");
				}break;
				case 3:
				{
					System.out.println("");
					female.PFC(lev,0.8);
					System.out.println("");
					System.out.println("Получить нужный результат вам помогут");
					IndividuallyProgram pr=new IndividuallyProgram();
					pr.getInfoLoss();
					System.out.println("");
					System.out.println("Для корректировки плана питания обратитесь к своему тренеру.");
				}break;
				}
			}break;
			case 2:
			{
				System.out.println("План питания");
				System.out.println("1 - Базовый.");
				System.out.println("2 - Индивидуальный.");
				b=sr.nextInt();
				switch(b){
				case 1:{
					System.out.println("");
					female.PFC(lev,1.2);
					System.out.println("");
					System.out.println("Получить нужный результат вам помогут");
					BasicProgram pr=new BasicProgram();
					pr.getInfoGaining();
					System.out.println("");
					System.out.println("Для корректировки плана питания обратитесь к своему тренеру.");
				}break;
				case 2:{
					System.out.println("");
					female.PFC(lev,1.2);
					System.out.println("");
					System.out.println("Получить нужный результат вам помогут");
					IndividuallyProgram pr=new IndividuallyProgram();
					pr.getInfoGaining();
					System.out.println("");
					System.out.println("Для корректировки плана питания обратитесь к своему тренеру.");
				}break;
				}
			}break;
			case 3: {
				System.out.println("План питания");
				System.out.println("1 - Базовый.");
				System.out.println("2 - Индивидуальный.");
				b=sr.nextInt();
				switch(b){
				case 1:{
					System.out.println("");
					female.PFC(lev,1.0);
					System.out.println("");
					System.out.println("Получить нужный результат вам помогут");
					BasicProgram pr=new BasicProgram();
					pr.getInfoMaintenance();
					System.out.println("");
					System.out.println("Для корректировки плана питания обратитесь к своему тренеру.");
				}break;
				case 2:{
					System.out.println("");
					female.PFC(lev,1.0);
					System.out.println("");
					System.out.println("Получить нужный результат вам помогут");
					IndividuallyProgram pr=new IndividuallyProgram();
					pr.getInfoMaintenance();
					System.out.println("");
					System.out.println("Для корректировки плана питания обратитесь к своему тренеру.");
				}break;
				}
			}
			}
		}break;
		case 2:{
			Man male=new Man(weight,height,age);
			System.out.println("Ваша цель.");
			System.out.println("1 - Снижение веса.");
			System.out.println("2 - Набор веса (мышечной массы).");
			System.out.println("3 - Поддержание веса.");
			a=sr.nextInt();
			switch(a){
			case 1: {
				System.out.println("План питания");
				System.out.println("1 - Базовый.");
				System.out.println("2 - Расширенный.");
				System.out.println("3 - Индивидуальный.");
				b=sr.nextInt();
				switch(b){
				case 1:{
					System.out.println("");
					male.PFC(lev,0.8);
					System.out.println("");
					System.out.println("Получить нужный результат вам помогут");
					BasicProgram pr=new BasicProgram();
					pr.getInfoLoss();
					System.out.println("");
					System.out.println("Для корректировки плана питания обратитесь к своему тренеру.");
				}break;
				case 2:{
					System.out.println("");
					male.PFC(lev,0.8);
					System.out.println("");
					System.out.println("Получить нужный результат вам помогут");
					ExpandedProgram pr=new ExpandedProgram();
					pr.getInfoLoss();
					System.out.println("");
					System.out.println("Для корректировки плана питания обратитесь к своему тренеру.");
				}break;
				case 3:
				{
					System.out.println("");
					male.PFC(lev,0.8);
					System.out.println("");
					System.out.println("Получить нужный результат вам помогут");
					IndividuallyProgram pr=new IndividuallyProgram();
					pr.getInfoLoss();
					System.out.println("");
					System.out.println("Для корректировки плана питания обратитесь к своему тренеру.");
				}break;
				}
			}break;
			case 2:
			{
				System.out.println("План питания");
				System.out.println("1 - Базовый.");
				System.out.println("2 - Индивидуальный.");
				b=sr.nextInt();
				switch(b){
				case 1:{
					System.out.println("");
					male.PFC(lev,1.2);
					System.out.println("");
					System.out.println("Получить нужный результат вам помогут");
					BasicProgram pr=new BasicProgram();
					pr.getInfoGaining();
					System.out.println("");
					System.out.println("Для корректировки плана питания обратитесь к своему тренеру.");
				}break;
				case 2:{
					System.out.println("");
					male.PFC(lev,1.2);
					System.out.println("");
					System.out.println("Получить нужный результат вам помогут");
					IndividuallyProgram pr=new IndividuallyProgram();
					pr.getInfoGaining();
					System.out.println("");
					System.out.println("Для корректировки плана питания обратитесь к своему тренеру.");
				}break;
				}
			}break;
			case 3: {
				System.out.println("План питания");
				System.out.println("1 - Базовый.");
				System.out.println("2 - Индивидуальный.");
				b=sr.nextInt();
				switch(b){
				case 1:{
					System.out.println("");
					male.PFC(lev,1.0);
					System.out.println("");
					System.out.println("Получить нужный результат вам помогут");
					BasicProgram pr=new BasicProgram();
					pr.getInfoMaintenance();
					System.out.println("");
					System.out.println("Для корректировки плана питания обратитесь к своему тренеру.");
				}break;
				case 2:{
					System.out.println("");
					male.PFC(lev,1.0);
					System.out.println("");
					System.out.println("Получить нужный результат вам помогут");
					IndividuallyProgram pr=new IndividuallyProgram();
					pr.getInfoMaintenance();
					System.out.println("");
					System.out.println("Для корректировки плана питания обратитесь к своему тренеру.");
				}break;
				}
			}
			}
		}
		}
	}
}
