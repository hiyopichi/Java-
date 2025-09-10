package curriculum_B;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// Q1 int型の配列を作成し、1,2,3,4,5を格納する
		int[] a = { 1, 2, 3, 4, 5 };
		// 配列の全要素を順番に配置
		for (int b : a) {
			System.out.println(b);
		}
		System.out.println("\n");

		// Q2 int型の配列{10,20,30,40,50}を用意する
		int[] c = { 10, 20, 30, 40, 50 };
		int cc = c.length;
		// 配列の要素を逆順に表示
		for (int d = cc - 1; d >= 0; d--) {
			System.out.println(c[d]);
		}
		System.out.println("\n");

		// Q3 int型の配列{3,5,7,9,11}を用意する
		int[] e = { 3, 5, 7, 9, 11 };
		// 配列の全要素の合計値を計算し、表示
		int g = 0;
		for (int f = 0; f < e.length; f++) {
			g += e[f];
		}
		System.out.println(g);
		System.out.println("\n");

		// Q4 int型の配列{12,7,9,21,5,18}を用意する
		int[] h = { 12, 7, 9, 21, 5, 18 };
		// 配列の最大値と最小値を求めて表示
		int maxI = h[0];
		int minI = h[0];
		for (int j = 1; j < h.length; j++) {
			if (maxI < h[j]) {
				maxI = h[j];
			}
			{
				if (minI > h[j]) {
					minI = h[j];
				}
			}
		}
		System.out.println(maxI);
		System.out.println(minI);
		System.out.println("\n");

		// Q5 int型の配列{1,2,3,4,5}を用意する
		int[] k = { 1, 2, 3, 4, 5 };
		// 配列の全ての要素を2倍し、結果を表示　結果を表示する際の処理に拡張for文を使用
		for (int l : k) {
			System.out.println(l * 2);
		}
		System.out.println("\n");

		// Q6 int型の配列{4,7,10,15,20}を用意する
		int[] m = { 4, 7, 10, 15, 20 };
		// ユーザーが入力した数が配列に含まれているかを判定し、結果を表示
		Scanner scan = new Scanner(System.in);
		int sca = scan.nextInt();
		boolean p = false;
		for (int o : m) {
			if (sca == o)
				p = true;
		}
		if (p) {
			System.out.println(sca + "は配列に含まれています");
		} else {
			System.out.println(sca + "は配列に含まれていません");
		}
		System.out.println("\n");

		// Q7 2次元配列int[][] array = {{1,2},{3,4},{5,6}};を用意
		int[][] array = {
				{ 1, 2 },
				{ 3, 4 },
				{ 5, 6 }
		};
		// 配列の全ての要素を表示
		for (int q = 0; q < array.length; q++) {
			for (int r = 0; r < array[q].length; r++) {
				System.out.print(array[q][r] + " ");
			}
			System.out.println();
		}
		System.out.println("\n");

		// Q8 2次元配列int[][] array = {{10,20,30},{40,50,60}{70,80,90}};を用意する
		int[][] array2 = {
				{ 10, 20, 30 },
				{ 40, 50, 60 },
				{ 70, 80, 90 },
		};
		// 配列のすべての要素の合計値を表示
		int s = 0;
		for (int t = 0; t < array2.length; t++) {
			for (int u = 0; u < array2[t].length; u++) {
				s += array2[t][u];
			}
		}
		System.out.println(s);
		System.out.println("\n");

		//Q9 2次元配列int[][]array={{12,15,8,}{6,19,25}{30,2,10}};を用意する
		int[][] array3 = {
				{ 12, 15, 8 },
				{ 6, 19, 25 },
				{ 30, 2, 10 },
		};
		// 配列内の最大値と最小値を求めて表示
		int maxT = array3[0][0];
		int minT = array3[0][0];
		for (int u = 0; u < array3.length; u++) {
			for (int v = 0; v < array3[u].length; v++) {
				if (maxT < array3[u][v]) {
					maxT = array3[u][v];
				}
				if (minT > array3[u][v]) {
					minT = array3[u][v];
				}
			}
		}
		System.out.println(maxT);
		System.out.println(minT);
		System.out.println("\n");

		// Q10 3次元配列int[][][]{{{1,2},{3,4},{5,6},{7,8}}};を用意する
		int[][][] array4 = {
				{
						{ 1, 2 },
						{ 3, 4 }
				},
				{
						{ 5, 6 },
						{ 7, 8 }
				}
		};
		// 配列内のすべての要素を表示
		for (int w = 0; w < array4.length; w++) {
			for (int x = 0; x < array4[w].length; x++) {
				for (int y = 0; y < array4[w][x].length; y++) {
					System.out.println(array4[w][x][y]);
				}
			}
		}
		scan.close();
	}
}
