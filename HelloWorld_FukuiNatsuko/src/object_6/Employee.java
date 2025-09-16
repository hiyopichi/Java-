package object_6;

// インターフェイスBillableを作成
interface Billable {
	abstract int costForDay(int hoursWorked);
}

// 抽象クラスEmployee
abstract public class Employee implements Billable {
	String id;
	String name;

	public Employee(String id, String name) {
		this.id = id;
		this.name = name;
	}
}

// サブクラスを2つ作成
class FullTimeEmployee extends Employee {
	public FullTimeEmployee(String id, String name) {
		super(id, name);
	}

	@Override
	public int costForDay(int hoursWorked) {
		int hourlyRate = 1250;
		int regularHours = Math.min(hoursWorked, 8);
		int overtime = Math.max(0, hoursWorked - 8);
		return (regularHours * hourlyRate) + (int) (overtime * hourlyRate * 1.25);
	}
}

class ContractEmployee extends Employee {
	public ContractEmployee(String id, String name) {
		super(id, name);
	}

	@Override
	public int costForDay(int hoursWorked) {
		int hourlyRate = 1000;
		return hoursWorked * hourlyRate;
	}

}
