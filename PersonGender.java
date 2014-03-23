package laba2;

public interface PersonGender{
	double Calories();
	void PFC(double goal,double slimming);
}

class Woman implements PersonGender {
	double weight, height;
	int age;
	Woman ( double weight, double height, int age){
		this.weight=weight;
		this.height=height;
		this.age=age;
	}
	public double Calories(){
		return 655+(9.5*weight)+(1.8*height)-(4.7*age);
	}
	public void PFC(double level, double slimming){
		System.out.println("Количесво еды должно быть в пределах " + Math.rint(((this.Calories()*level)* slimming)) + " ккал");
		System.out.println("Белков " + Math.rint(((((this.Calories()*level)* slimming)*0.30)/4)) + " г");
		System.out.println("Жиров " + Math.rint(((((this.Calories()*level)* slimming)*0.15)/9)) + " г");
		System.out.println("Углеводов " + Math.rint(((((this.Calories()*level)* slimming)*0.45)/4)) + " г");
	}
}

class Man implements PersonGender{
	double weight, height;
	int age;
	Man ( double weight, double height, int age){
		this.weight=weight;
		this.height=height;
		this.age=age;
	}
	public double Calories(){
		return 66+(13.7*weight)+(5*height)-(6.8*age);
	}
	public void PFC(double level, double slimming){
		System.out.println("Количесво еды должно быть в пределах " + Math.rint(((this.Calories()*level)* slimming)) + " ккал");
		System.out.println("Белков " + Math.rint(((((this.Calories()*level)* slimming)*0.30)/4)) + " г");
		System.out.println("Жиров " + Math.rint(((((this.Calories()*level)* slimming)*0.15)/9)) + " г");
		System.out.println("Углеводов " + Math.rint(((((this.Calories()*level)* slimming)*0.45)/4)) + " г");
	}
}