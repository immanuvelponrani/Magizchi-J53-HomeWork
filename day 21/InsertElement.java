import java.util.Scanner;

class InsertElement {
    public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter the size :: ");
		int len = sc.nextInt();
		
		int arr[] = new int[len+1];
		for(int i=0;i<len;i++){
			System.out.print("enter the elements :: ");
			arr[i]=sc.nextInt();
		}
		System.out.println(" the elements are ");
		for(int i=0;i<len;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.print(" enter the elements:: ");
		int ele=sc.nextInt();
		System.out.print(" elements position :: ");
		int pos=sc.nextInt();
		
		pos = pos-1;
		
		for(int i=len-1;i>=pos;i--){
			arr[i+1] = arr[i];
		}
		arr[pos]=ele;
		for(int i=0;i<=len;i++){
			System.out.print(arr[i]+" ");
		}
		
		
    }
}
