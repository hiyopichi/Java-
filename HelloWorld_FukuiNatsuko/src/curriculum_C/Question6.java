package curriculum_C;

import java.util.Random;
import java.util.Scanner;

public class Question6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Player player = new Player(scanner);
		Cpu cpu = new Cpu();

		// ユーザーが勝つまで繰り返す 
		while (true) {
			player.playerHand();
			cpu.cpuHand();

			String playerHand = player.getHand();
			String cpuHand = cpu.getHand();

			if (playerHand.equals(cpuHand)) {
				player.counts();
				System.out.println("あなたの手: " + playerHand);
				System.out.println("CPUの手: " + cpuHand);
				System.out.println("あいこ");
			} else if ((playerHand.equals("パー") && cpuHand.equals("グー")) ||
					(playerHand.equals("チョキ") && cpuHand.equals("パー")) ||
					(playerHand.equals("グー") && cpuHand.equals("チョキ"))) {
				player.counts();
				System.out.println("あなたの手: " + playerHand);
				System.out.println("CPUの手: " + cpuHand);
				System.out.println("あなたの勝ち！");
				break;

			} else {
				player.counts();
				System.out.println("あなたの手: " + playerHand);
				System.out.println("CPUの手: " + cpuHand);
				System.out.println("あなたの負け…");
			}
		}
	}
}

class Player {
	private String hand;
	private int countG = 0;
	private int countC = 0;
	private int countP = 0;
	Scanner scanner;
	public Player(Scanner scanner) {
		this.scanner = scanner;
	}

	public void playerHand() {
		hand = scanner.next();
		if (hand.equals("グー")) {
			countG++;
		} else if (hand.equals("チョキ")) {
			countC++;
		} else if (hand.equals("パー")) {
			countP++;
		}
	}

	public void counts() {
		System.out.println("グー(" + countG + "), " + "チョキ(" + countC + "), " + "パー(" + countP + ")");
	}

	public String getHand() {
		return hand;
	}
}

class Cpu {
	private String hand;
	private String[] handList = { "グー", "チョキ", "パー" };

	public void cpuHand() {
		Random rand = new Random();
		hand = handList[rand.nextInt(3)];
	}

	public String getHand() {
		return hand;
	}
}