public class Fibonacci{
	public static void main(String args[]){
	long n = 100 , t1 = 0 , t2 = 1;
	System.out.println("First " + n + " terms: ");
	for(int i = 1 ; i <= n ; i++)
	{
		System.out.println(t1 + " + ");
		long sum=t1 + t2;
		t1=t2;
		t2=sum;

	}
}
}