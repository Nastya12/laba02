package laba2;

public interface WeightLoss {
	void getInfoLoss();
	void getInfoGaining();
	void getInfoMaintenance();
	double CaloriesMan();
	double CaloriesWoman();
	void PFCWoman(double goal,double slimming);
	void PFCMan(double goal, double slimming);
}

class BasicProgram implements  WeightLoss{
	double weight, height;
	int age;
	BasicProgram ( double weight, double height, int age){
		this.weight=weight;
		this.height=height;
		this.age=age;
	}
	public double CaloriesWoman(){
		return 655+(9.5*weight)+(1.8*height)-(4.7*age);
	}
	public void PFCWoman(double level, double slimming){
		System.out.println("Количесво еды должно быть в пределах " + Math.rint(((this.CaloriesWoman()*level)* slimming)) + " ккал");
		System.out.println("Белков " + Math.rint(((((this.CaloriesWoman()*level)* slimming)*0.30)/4)) + " г");
		System.out.println("Жиров " + Math.rint(((((this.CaloriesWoman()*level)* slimming)*0.15)/9)) + " г");
		System.out.println("Углеводов " + Math.rint(((((this.CaloriesWoman()*level)* slimming)*0.45)/4)) + " г");
	}
	public double CaloriesMan(){
		return 66+(13.7*weight)+(5*height)-(6.8*age);
	}
	public void PFCMan(double level, double slimming){
		System.out.println("Количесво еды должно быть в пределах " + Math.rint(((this.CaloriesMan()*level)* slimming)) + " ккал");
		System.out.println("Белков " + Math.rint(((((this.CaloriesMan()*level)* slimming)*0.30)/4)) + " г");
		System.out.println("Жиров " + Math.rint(((((this.CaloriesMan()*level)* slimming)*0.15)/9)) + " г");
		System.out.println("Углеводов " + Math.rint(((((this.CaloriesMan()*level)* slimming)*0.45)/4)) + " г");
	}
	public void getInfoLoss(){
		System.out.println("Коктейль Формула 1");
		System.out.println("Активированнная клетчатка");
		System.out.println("Растительный напиток Термоджетикс");
		System.out.println("Cell-U-Loss");
	}
	public void getInfoGaining(){
		System.out.println("Коктейль Формула 1");
		System.out.println("Мультивитаминный комплекс Формула 2");
		System.out.println("Протеиновая смесь Формула 3");
		System.out.println("Гербалайфлайн");
		System.out.println("Протеиновые батончики");
	}
	public void getInfoMaintenance(){
		System.out.println("Коктейль Формула 1");
		System.out.println("Мультивитаминный комплекс Формула 2");
		System.out.println("Протеиновая смесь Формула 3");
		System.out.println("Напиток и таблетки N-R-G");
	}
}

class ExpandedProgram extends BasicProgram implements  WeightLoss{
	public ExpandedProgram ( double weight, double height, int age){
		super(weight,height,age);
	}
	public double CaloriesWoman(){
		return super.CaloriesWoman();
	}
	public void PFCWoman(double goal,double slimming){
		super.PFCWoman(goal,slimming);
	}
	public double CaloriesMan(){
		return super.CaloriesMan();
	}
	public void PFCMan(double goal,double slimming){
		super.PFCMan(goal,slimming);
	}
	public void getInfoLoss(){
		super.getInfoLoss();
		System.out.println("Мультивитаминный комплекс Формула 2");
		System.out.println("Сок Gerbal Aloe");
		System.out.println("Клеточный активатор");
	}
	public void getInfoGaining(){
		super.getInfoGaining();
	}
	public void getInfoMaintenance(){
		super.getInfoMaintenance();
	}
}

class IndividuallyProgram extends ExpandedProgram implements  WeightLoss{
	public IndividuallyProgram ( double weight, double height, int age){
		super(weight,height,age);
	}
	public double CaloriesWoman(){
		return super.CaloriesWoman();
	}
	public void PFCWoman(double goal,double slimming){
		super.PFCWoman(goal,slimming);
	}
	public double CaloriesMan(){
		return super.CaloriesMan();
	}
	public void PFCMan(double goal,double slimming){
		super.PFCMan(goal,slimming);
	}
	public void getInfoLoss(){
		super.getInfoLoss();
		System.out.println("Протеиновая смесь Формула 3");
		System.out.println("Термокомплит");
	}
	public void getInfoGaining(){
		super.getInfoGaining();
		System.out.println("Напиток или таблетки N-R-G");
		System.out.println("ЭкстраКаль");
	}
	public void getInfoMaintenance(){
		super.getInfoMaintenance();
		System.out.println("Гербалайфлайн");
		System.out.println("ЭкстраКаль");
		System.out.println("РоузГрад");
	}
}

