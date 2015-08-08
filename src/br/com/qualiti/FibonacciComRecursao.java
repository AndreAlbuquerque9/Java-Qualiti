package br.com.qualiti;

public class FibonacciComRecursao {
	
	public static int fibonacci ( int n){
		if (n < 2){
			return n;
		}else{
			return fibonacci(n - 1) + fibonacci(n -2);
		}
	}
	
	public static void main (String[]args){
		for (int i = 0; i < 10; i++){
			System.out.println(fibonacci(i));
		}
	}

}
