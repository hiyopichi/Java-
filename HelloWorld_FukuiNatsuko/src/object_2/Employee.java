package object_2;
// Employeeクラスを作成
public class Employee {
//　employee(文字列型)フィールド、name(文字列型フィールド)を持たせる
	String employee;
	String name;
// showInfoメソッドを作成
	public void showInfo() {
		System.out.println("社員ID:" + employee + ", 名前:" + name);
	}
}
