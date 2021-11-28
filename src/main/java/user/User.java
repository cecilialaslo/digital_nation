package user;

public class User {
	public String name;
	public String surname;
	public double monthlyRevenue;
	
	public User(String name, String surname, double monthlyRevenue) {
		super();
		this.name = name;
		this.surname = surname;
		this.monthlyRevenue = monthlyRevenue;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public double getMonthlyRevenue() {
		return monthlyRevenue;
	}

	public void setMonthlyRevenue(double monthlyRevenue) {
		this.monthlyRevenue = monthlyRevenue;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", surname=" + surname + ", monthlyRevenue=" + monthlyRevenue + "]";
	}
	
	
	
	
	

}
