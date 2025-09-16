package selfIntroduction;

public class Person {
	// インスタンスフィールドを定義
	String name;
	int age;
	double heigth;
	double weight;
	// コンストラクタを定義しインスタンスフィールドに値をセット
	static int count = 0;

	public Person(String name, int age, double heigth, double weight) {
		this.name = name;
		this.age = age;
		this.heigth = heigth;
		this.weight = weight;
		count++;
	}

	public double bmi() {
		return this.weight / (this.heigth * this.heigth);
	}

	public void print() {
		System.out.println("名前は " + this.name + " です");
		System.out.println("年は " + this.age + " です");
		System.out.printf("BMIは %.1f です", this.bmi());
		System.out.println( );
	}

	public static int getCount() {
		return count;
	}
}
