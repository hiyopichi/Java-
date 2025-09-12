package object_4;

// 抽象クラスEmployeeを作成
abstract class Employee {
	String employeeId;
	String name;
	
// メソッド
	public Employee(String id, String name) {
		this.employeeId = id;
		this.name = name;
	}

	public String getEmployeeId() {
		return this.employeeId;
	}

	public String getName() {
		return this.name;
	}

	public abstract int calculateDailyWage(int hoursWorked);

}

// サブクラスFulluTimeEmployee
class FullTimeEmployee extends Employee {
	private static final int HOURLY_RATE = 1200;

	public FullTimeEmployee(String id, String name) {
		super(id, name);
	}

	@Override
	public int calculateDailyWage(int hoursWorked) {
		if (hoursWorked <= 8) {
			return HOURLY_RATE * hoursWorked;
		} else {
			int overtime = hoursWorked - 8;
			return (HOURLY_RATE * 8) + (int) (HOURLY_RATE * 1.25 * overtime);
		}
	}
}

//サブクラスPartTimeEmployee
class PartTimeEmployee extends Employee {
	private static final int HOURLY_RATE = 1000;

	public PartTimeEmployee(String id, String name) {
		super(id, name);
	}

	@Override
	public int calculateDailyWage(int hoursWorked) {
		return HOURLY_RATE * hoursWorked;
	}

}

public class Main {

	public static void main(String[] args) {
		
// FullTimeEmployeeとPartTimeEmployeeのオブジェクトを作成、9h勤務時の給与を出力する
	// 正社員のオブジェクト生成
		FullTimeEmployee fte = new FullTimeEmployee("なし","正社員");
		int ftSalary = fte.calculateDailyWage(9);
	//　パート社員のオブジェクト生成
		PartTimeEmployee pte = new PartTimeEmployee("なし","パート社員");
		int ptSalary = pte.calculateDailyWage(9);
	// 出力
		
		System.out.println(fte.name + "の給与: " + ftSalary + " 円");
		System.out.println(pte.name + "の給与: " + ptSalary + " 円");

	}

}