package curriculum_D;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Question7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BattleLog log = new BattleLog("battle_log.txt");
		System.out.println("プレイヤー名の入力");
		Character player = new Character();
		player.playerStatus(scanner);
		log.log("プレイヤー" + player.name);
		Character daemon = Character.loadDaemon();
		log.log(player.name + "のステータス");
		log.log("HP:"+ player.hp + " AT:" + player.at + " SP:" + player.sp);
		while (true) {
			if (player.sp > daemon.sp) {
				daemon.hp -= player.at;
				log.log(player.name + "の攻撃　" + "Daemonの残りHPは" + daemon.hp);
			} else if (player.sp < daemon.sp) {
				player.hp -= daemon.at;
				log.log("Daemonの攻撃　" + player.name + "の残りHPは" + player.hp);
			} else {
				Random rand = new Random();
				if (rand.nextBoolean()) {
					daemon.hp -= player.at;
					log.log(player.name + "の攻撃　" + "Daemonの残りHPは" + daemon.hp);
				} else {
					player.hp -= daemon.at;
					log.log("Daemonの攻撃　" + player.name + "の残りHPは" + player.hp);
				}
			}
			if (daemon.hp <= 0) {
				log.log(player.name + "の勝ち！");
				break;
			}
			if (player.hp <= 0) {
				log.log("Daemonの勝ち！");
				break;
			}

		}
		log.close();
		scanner.close();
	}
}

//共通のキャラクター情報を管理
class Character {
	int hp;
	int at;
	int sp;
	String name;

	public void playerStatus(Scanner scanner) {
		Random rand = new Random();
		this.name = scanner.nextLine();
		this.hp = rand.nextInt(100) + 1;
		this.at = rand.nextInt(20) + 1;
		this.sp = rand.nextInt(10) + 1;
	}
// Daemonステータスをテキストファイルから読み込む
	public static Character loadDaemon() {
		Character daemon = new Character();
		try (InputStream is = Question7.class.getResourceAsStream("daemon_status.txt");
				BufferedReader br = new BufferedReader(new InputStreamReader(is))) {

			String line = br.readLine();

			daemon.hp = Integer.parseInt(br.readLine());
			daemon.at = Integer.parseInt(br.readLine());
			daemon.sp = Integer.parseInt(br.readLine());

		} catch (Exception e) {
			e.printStackTrace();
		}
		return daemon;
	}
}
// battle_logに記録するクラス
class BattleLog {
	private PrintWriter writer;

	public BattleLog(String filename) {
		try {
			writer = new PrintWriter(new BufferedWriter(new FileWriter(filename, false)));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void log(String message) {
		writer.println(message);
	}

	public void close() {
		if (writer != null) {
			writer.close();
		}
	}
}
