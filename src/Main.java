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
			
			System.out.println("수를 결정하였습니다. 맞추어 보세요");
			while(true) {
				System.out.println(start + "-" + end);
				System.out.print(cnt + ">>");
				answer = scanner.nextInt();
				
				if(answer == num) break;
				else if(start < answer && answer < num) {
					start = answer;
					System.out.println("더 높게");
				}
				else if(num < answer && answer < end) {
					end = answer;
					System.out.println("더 낮게");
				}
				
			}
			System.out.println("맞았습니다.");
			System.out.print("다시하시겠습니까(y/n)>>");
			op = scanner.next();
		}
		
		
		
		
		scanner.close();
	}	
}
