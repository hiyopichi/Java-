package object_3;

public class Main {
//Employeeオブジェクトを生成、setメソッドで設定後getメソッドで出力
	public static void main(String[] args) {
		Employee empl = new Employee();
		empl.setEmployeed("E002");
		empl.setName("田中花子");

		System.out.println("社員ID:" + empl.getEmployeed() + ", 名前:" + empl.getName());

	}

}
