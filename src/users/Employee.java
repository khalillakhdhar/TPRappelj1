package users;

import java.util.ArrayList;

public class Employee extends User {
	public static ArrayList<Employee> employees=new ArrayList<Employee>();
	private String profession;
	private double salaireBrute;
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public double getSalaireBrute() {
		return salaireBrute;
	}
	public void setSalaireBrute(double salaireBrute) {
		this.salaireBrute = salaireBrute;
	}
	
	
	public double calculeTaxes()
	{
		if(this.salaireBrute<1500)
			return this.salaireBrute * 0.05;
		else if(this.salaireBrute<4000)
			return this.salaireBrute * 0.14;
		else
			return this.salaireBrute * 0.2;
		
	}
	public double getNet()
	{
		return this.salaireBrute-this.calculeTaxes();
		
	}
	
	
	
	
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String nom, String prenom, int age, String adresse, String telephone, String profession,
			double salaireBrute) {
		super(nom, prenom, age, adresse, telephone);
		this.profession = profession;
		this.salaireBrute = salaireBrute;
	}
	@Override
	public String toString() {
		return "Employee [profession=" + profession + ", salaireBrute=" + salaireBrute + ", Taxe à payer="
				+ calculeTaxes() + ", salaire net=" + getNet() + ", Coordonnés=" + super.toString() + "]";
	}
	
	

}
