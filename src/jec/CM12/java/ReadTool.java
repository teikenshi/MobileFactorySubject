package jec.CM12.java;

import java.util.Scanner;

public class ReadTool {
	public static DataEntity read(DataEntity pe) {
		boolean loop;
		Scanner sc = new Scanner(System.in);
		/**
		 * キーボード入力から調べる時刻を受け取る
		 */
		System.out.println("調べる時刻を24時間制の整数で入力してください");
		do {
			loop = false;
			pe.setInTime(sc.nextLine());
			try {
				pe.setTime(Integer.parseInt(pe.getInTime()));
			} catch (Exception e) {
				System.out.println("[INFO]調べる時刻を[0~23]の整数で入力してください");
				loop = true;
			}
		} while (loop);

		/**
		 * キーボード入力から調べる時間帯の開始時刻を受け取る
		 */
		System.out.println("調べる時間帯の開始時刻を24時間制の整数で入力してください");
		do {
			loop = false;
			pe.setInStart(sc.nextLine());
			try {
				pe.setStart(Integer.parseInt(pe.getInStart()));
			} catch (Exception e) {
				System.out.println("[INFO]調べる時間帯の開始時刻を[0~23]の整数で入力してください");
				loop = true;
			}
		} while (loop);

		/**
		 * キーボード入力から調べる時間帯の終了時刻を受け取る
		 */
		System.out.println("調べる時間帯の終了時刻を24時間制の整数で入力してください");
		do {
			loop = false;
			pe.setInEnd(sc.nextLine());
			try {
				pe.setEnd(Integer.parseInt(pe.getInEnd()));
			} catch (Exception e) {
				System.out.println("[INFO]調べる時間帯の終了時刻を[0~23]の整数で入力してください");
				loop = true;
			}
		} while (loop);

		return pe;
	}
}
