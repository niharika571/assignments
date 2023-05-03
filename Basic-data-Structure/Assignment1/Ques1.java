import java.util.*;

class ArmstrongOrNot {
    public boolean armstrongCheck(int num) {
    	int temp=num;
    	int sum=0;
    	while(temp!=0) {
    		int digit=temp%10;
    		sum=sum+digit*digit*digit;
    		temp=temp/10;
    	}
		return sum==num;
    	}
    }

public class Assignment1Q1 {
    public static void main(String[] args) {
    	ArmstrongOrNot arm=new ArmstrongOrNot();
    	Scanner sc= new Scanner(System.in);
    	System.out.println("Enter any number");
    	int num=sc.nextInt();
    	if(arm.armstrongCheck(num))
    		System.out.println(num+" is an armstrong number");
    	else
    		System.out.println(num+" is not an armstrong number");
    	
    
    	
    	
    }
}

