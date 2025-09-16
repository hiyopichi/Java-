package object_6;

import java.util.ArrayList;
import java.util.List;

// Listに社員を複数追加し、for-eachループで呼び出して日給を計算
public class Main {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new FullTimeEmployee("E001", "山田太郎"));
		employees.add(new ContractEmployee("E002", "佐藤花子"));

		for (Employee emp : employees) {
			System.out.println(emp.name + ": 日給: " + emp.costForDay(8) + "円");
		}
	}
}
