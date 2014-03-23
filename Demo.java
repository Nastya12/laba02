package laba2;

import java.util.*;

public class Demo {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sr = new Scanner(System.in);
		int a, b, age, gender, level;
		double weight, height;	
		System.out.println("Ваш вес в кг: ");
		weight=sr.nextDouble();
		System.out.println("Ваш рост в см: ");
		height=sr.nextDouble();
		System.out.println("Ваш возраст: ");
		age=sr.nextInt();
		System.out.println("Ваш пол: ");
		System.out.println("1 - женский ");
		System.out.println("2 - мужской ");
		gender=sr.nextInt();
		System.out.println("Выберите подходящий вариант: ");
		System.out.println("1 - сидячий образ жизни с пешими прогулками ");
		System.out.println("2 - 1-3 раза в неделю обычные тренировки ");
		System.out.println("3 - 3-5 раз в неделю тренировки ");
		System.out.println("4 - 5-7 раз в неделю тренировки или тяжелая работа ");
		level=sr.nextInt();
			
		System.out.println("Ваша цель.");
		System.out.println("1 - Снижение веса.");
		System.out.println("2 - Набор веса (мышечной массы).");
		System.out.println("3 - Поддержание веса.");
		a=sr.nextInt();
		switch(a){
		case 1:{
			System.out.println("Какую программу снижения веса вы хотите получить?");
			System.out.println("1 - Базовая.");
			System.out.println("2 - Расширенная.");
			System.out.println("3 - Индивидуальная.");
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
				System.out.println("В ваш план питание необходимо добавить");
				include.getInfoLoss();
				System.out.println(" ");
				System.out.println("Для корректировки своего плана питания обратитесь к своему тренеру. ");
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
				System.out.println("В ваш план питание необходимо добавить");
				include.getInfoLoss();
				System.out.println(" ");
				System.out.println("Для корректировки своего плана питания обратитесь к своему тренеру. ");
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
				System.out.println("В ваш план питание необходимо добавить");
				include.getInfoLoss();
				System.out.println(" ");
				System.out.println("Для корректировки своего плана питания обратитесь к своему тренеру. ");
			}break;
			}break;
		}
		case 2:
		{
			System.out.println("Какую программу набора веса вы хотите получить?");
			System.out.println("1 - Базовая.");
			System.out.println("2 - Индивидуальная.");
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
				System.out.println("В ваш план питание необходимо добавить");
				include.getInfoGaining();
				System.out.println(" ");
				System.out.println("Для корректировки своего плана питания обратитесь к своему тренеру. ");
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
				System.out.println("В ваш план питание необходимо добавить");
				include.getInfoGaining();
				System.out.println(" ");
				System.out.println("Для корректировки своего плана питания обратитесь к своему тренеру. ");
			}break;
			}break;
		}
		case 3:
		{
			System.out.println("Какую программу поддержания веса вы хотите получить?");
			System.out.println("1 - Базовая.");
			System.out.println("2 - Индивидуальная.");
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
				System.out.println("В ваш план питание необходимо добавить");
				include.getInfoMaintenance();
				System.out.println(" ");
				System.out.println("Для корректировки своего плана питания обратитесь к своему тренеру. ");
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
				System.out.println("В ваш план питание необходимо добавить");
				include.getInfoMaintenance();
				System.out.println(" ");
				System.out.println("Для корректировки своего плана питания обратитесь к своему тренеру. ");
			}break;
			}break;
		}
		}
	}
}
