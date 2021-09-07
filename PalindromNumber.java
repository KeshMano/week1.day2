package week1.day2;
public class PalindromNumber
{
	public static void main(String[] args) {
	    int n=454;
	    int t=n;
	    int r,sum=0;
	    while(n>0){    
            r=n%10;    
            sum=(sum*10)+r;    
            n=n/10;    
  }    
	    if(t==sum)
	    {
		System.out.println("Palindrom of the given Number is:"+t);
	    }
	    else{
	       	System.out.println("Not a Palindrom Number"); 
	    }
	}
}
