import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length of array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("enter values in array : ");
		for(int i = 0; i < n; i++){
		    arr[i] = sc.nextInt();
		}
		System.out.println("Displaying array : ");
		for(int i = 0; i < arr.length; i++){
		    System.out.println(arr[i]);
		}
		int uniqueelement = findunique(arr);
		System.out.println("uniqueelement is : " + uniqueelement);
		
		}
		public static int findunique(int[] arr){
		    int num = 0;
		    for(int num1: arr){
		        num ^= num1;
		    }
		    return num;
	}
}
