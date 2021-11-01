import java.util.Scanner;
class Ct{
	int cp;
	public static void check(int x){
		int cp=0;
		int n=x/2;
		for(int i=2;i<=n;i++) {
	    	  if(x%i==0) {
	    		  cp+=1;
	    		  break;
	    		  }
		}
		if (cp!=0) {
			System.out.println(x+"    No");
		}else {
			System.out.println(x+"   Yes");
		}
		
	   }
}
public class Class02
{
   public static void main(String args[])
   {
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Input a number:");
	   Ct.check(sc.nextInt());
   }
}
/* output-------------
Input a number:10
10    No
--------------------*/
