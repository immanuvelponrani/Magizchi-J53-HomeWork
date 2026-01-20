import java.util.Scanner;

class SwapArray
{
	
	void swap(int num[]){
		int temp = num[0];
		num[0] = num[1];
		num[1]=temp;
	}
	
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int ele[]=new int[2];
		SwapArray sa=new SwapArray();
		
		System.out.print("enter the first element :: ");
		ele[0] = sc.nextInt();
		System.out.print("enter the Second element :: ");
		ele[1] = sc.nextInt();
		
		sa.swap(ele);
		
		System.out.println("After swapping.....");
		System.out.println(" first_ele = "+ele[0] + " second_ele= " + ele[1]);
	}
}
