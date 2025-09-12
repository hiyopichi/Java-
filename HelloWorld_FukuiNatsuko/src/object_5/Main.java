package object_5;

import java.util.ArrayList;
import java.util.List;

//既に定義されているクラス
abstract class Employee {
	protected String id;
	protected String name;

	public String id() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public Employee(String id, String name) {

		this.id = id;
		this.name = name;

	}

	public abstract int calculateDailyWage(int hoursWorked);
}

class FullTimeEmployee extends Employee {

	public FullTimeEmployee(String id, String name) {
		super(id, name);
	}

	@Override
	public int calculateDailyWage(int hoursWorked) {
		int hourlyRate = 1250;
		int overtime = Math.max(0, hoursWorked - 8);
		int regularHours = Math.min(hoursWorked, 8);
		return (regularHours * hourlyRate) + (int) (overtime * hourlyRate * 1.25);
	}
}

class ContractEmployee extends Employee {
	public ContractEmployee(String id, String name) {
		super(id, name);
	}

	@Override
	public int calculateDailyWage(int hoursWorked) {
		int hourlyRate = 1000;
		return hoursWorked * hourlyRate;
	}
}

public class Main {
	public static void main(String[] args) {
		// 社員リストを作成
		List<Employee> employees = new ArrayList<>();

		// リストにFullTimeEmployeeとContractEmployeeを複数追加

		employees.add(new FullTimeEmployee("E001", "山田太郎"));
		employees.add(new ContractEmployee("E002", "佐藤花子"));
		employees.add(new FullTimeEmployee("E003", "田中二郎"));
		employees.add(new ContractEmployee("E004", "鈴木三郎"));

		// For-eachループでcalculateDailyWageを呼び出し、各社員の給料を出力

		for (Employee e : employees) {
			System.out.println(e.getName() + " 給与: " + e.calculateDailyWage(9));
		}

	}
}
