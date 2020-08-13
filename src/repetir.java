import java.util.Scanner;

public class repetir {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		/*int x = sc.nextInt();
		
		int soma = 0;
		
		while (x!=0) {
			soma+=x;
			x= sc.nextInt();
			
		}
		System.out.println(soma);*/
		
		int N = sc.nextInt();
		int soma1 = 0;
		for(int i=0; i<N; i++) {
			int x=sc.nextInt();
			soma1+=x;
		}
		System.out.println(soma1);
		
		sc.close();

	}

}
