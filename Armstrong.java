package week1.day2;
public class Armstrong
{
	public static void main(String[] args) {
		int input=153;
		int calc=0;
		int rem,ori;
		ori=input;
		while(input>0)
		{
		    rem=input%10;

		    calc=calc+(rem*rem*rem);
		    rem=calc;
		
		    if(calc==input){
		        System.out.println("The number is armstrong");
		        break;
		    }
		   
		}
    }
}   	
	

