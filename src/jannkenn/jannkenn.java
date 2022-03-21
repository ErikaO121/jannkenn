package jannkenn;

import java.util.Random;
import java.util.Scanner;

public class jannkenn {
	
	public static void main(String[] args) {
		int user = getUser();	//userのじゃんけんの手
		int comp = getComp();	//computer1のじゃんけんの手
		String result = judge(user,comp);		//userとcomputerのじゃんけん勝負
		printResult(user,comp,result);	//結果の出力
	}
	
	private static int getUser() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("あなたのじゃんけんの手を入力してください。");
			System.out.print("(グー：0，チョキ：1、パー：2):");
		
			if(sc.hasNextInt()) {
				int num = sc.nextInt();
				if(num<=-1||num>=3) {
					System.out.println("入力できるのは 0,1,2 だけです。");
					continue;
				}else {
					return num;
				}
			}else {
				System.out.println("入力できるのは整数だけです。");
				sc.next();
			}
		}

	}
	
	
	private static int getComp() {
		Random r = new Random();
		int compAns =r.nextInt(3);
		return compAns;

	}
	
	
	
	private static String judge(int x,int y) {
		String result = "";
		
		if((x == 0 && y == 2)||(x == 1 && y == 2)||(x == 2 && y == 0)) {
			result = "勝ち";
		}else if((x==0 && y==2) || (x==1 && y==0) || (x==2 && y==1)) {
			result = "負け";
		}else {
			result = "あいこ";
		}
		
		return result;
	}
	
	
	private static void printResult(int x,int y,String z) {
		// TODO 自動生成されたメソッド・スタブ
		String[] jannkenn = {"グー","チョキ","パー"};
		System.out.println("you:"+jannkenn[x]);
		System.out.println("computer:"+jannkenn[y]);
		System.out.println("result:"+z);

	}
}