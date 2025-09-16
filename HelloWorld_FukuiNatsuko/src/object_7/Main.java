package object_7;

interface Payable {
	int SalaryCalculator(int hoursWorked);
}

abstract class Employee implements Payable {
	private String name;

	public Employee(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

class FullTime extends Employee {
	public FullTime(String name) {
		super(name);
	}

	@Override
	public int SalaryCalculator(int hoursWorked) {
		int hourlyRate = 1200;
		return hoursWorked * hourlyRate;

	}
}

class Contract extends Employee {
	public Contract(String name) {
		super(name);
	}

	@Override
	public int SalaryCalculator(int hoursWorked) {
		int hourlyRate = 1000;
		return hoursWorked * hourlyRate;
	}
}

class SalaryReporter {
	public void report(Employee e,int hoursWorked) {
		System.out.println(e.getName() + " の給料は" + e.SalaryCalculator(hoursWorked) + " 円");
	}
}

public class Main {
	public static void main(String[] args) {
		Employee f = new FullTime("山田太郎");
		Employee c = new Contract("佐藤花子");

		SalaryReporter reporter = new SalaryReporter();
		reporter.report(f,8);
		reporter.report(c,8);
	}
}