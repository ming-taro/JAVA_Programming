import java.util.Random;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String op = "y";
		
		while(op.equals("y")) {
			Random r = new Random();
			int num = r.nextInt(100);
			int start = 0, end = 99, cnt = 1;
			int answer = -1;
			
			System.out.println("���� �����Ͽ����ϴ�. ���߾� ������");
			while(true) {
				System.out.println(start + "-" + end);
				System.out.print(cnt + ">>");
				answer = scanner.nextInt();
				
				if(answer == num) break;
				else if(start < answer && answer < num) {
					start = answer;
					System.out.println("�� ����");
				}
				else if(num < answer && answer < end) {
					end = answer;
					System.out.println("�� ����");
				}
				
			}
			System.out.println("�¾ҽ��ϴ�.");
			System.out.print("�ٽ��Ͻðڽ��ϱ�(y/n)>>");
			op = scanner.next();
		}
		
		
		
		
		scanner.close();
	}	
}
