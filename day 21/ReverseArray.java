import java.util.Scanner;
class ReverseArray
{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter the size :: ");
		int size = sc.nextInt();
		
		int arr[]=new int[size];
		
		for(int i=0;i<size;i++){
			System.out.print("enter the elements :: ");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
			System.out.println();
			System.out.println(" the elements  ");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
}
