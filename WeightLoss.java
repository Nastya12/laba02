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
		System.out.println("��������� ��� ������ ���� � �������� " + Math.rint(((this.CaloriesWoman()*level)* slimming)) + " ����");
		System.out.println("������ " + Math.rint(((((this.CaloriesWoman()*level)* slimming)*0.30)/4)) + " �");
		System.out.println("����� " + Math.rint(((((this.CaloriesWoman()*level)* slimming)*0.15)/9)) + " �");
		System.out.println("��������� " + Math.rint(((((this.CaloriesWoman()*level)* slimming)*0.45)/4)) + " �");
	}
	public double CaloriesMan(){
		return 66+(13.7*weight)+(5*height)-(6.8*age);
	}
	public void PFCMan(double level, double slimming){
		System.out.println("��������� ��� ������ ���� � �������� " + Math.rint(((this.CaloriesMan()*level)* slimming)) + " ����");
		System.out.println("������ " + Math.rint(((((this.CaloriesMan()*level)* slimming)*0.30)/4)) + " �");
		System.out.println("����� " + Math.rint(((((this.CaloriesMan()*level)* slimming)*0.15)/9)) + " �");
		System.out.println("��������� " + Math.rint(((((this.CaloriesMan()*level)* slimming)*0.45)/4)) + " �");
	}
	public void getInfoLoss(){
		System.out.println("�������� ������� 1");
		System.out.println("��������������� ���������");
		System.out.println("������������ ������� ������������");
		System.out.println("Cell-U-Loss");
	}
	public void getInfoGaining(){
		System.out.println("�������� ������� 1");
		System.out.println("���������������� �������� ������� 2");
		System.out.println("����������� ����� ������� 3");
		System.out.println("�������������");
		System.out.println("����������� ���������");
	}
	public void getInfoMaintenance(){
		System.out.println("�������� ������� 1");
		System.out.println("���������������� �������� ������� 2");
		System.out.println("����������� ����� ������� 3");
		System.out.println("������� � �������� N-R-G");
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
		System.out.println("���������������� �������� ������� 2");
		System.out.println("��� Gerbal Aloe");
		System.out.println("��������� ���������");
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
		System.out.println("����������� ����� ������� 3");
		System.out.println("������������");
	}
	public void getInfoGaining(){
		super.getInfoGaining();
		System.out.println("������� ��� �������� N-R-G");
		System.out.println("����������");
	}
	public void getInfoMaintenance(){
		super.getInfoMaintenance();
		System.out.println("�������������");
		System.out.println("����������");
		System.out.println("��������");
	}
}

