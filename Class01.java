class CWin
{
   double pi=3.14159;
   double answer;

   void Cal_area(int r) {
	   answer=r*r*r*pi*4/3;
   }
   void Cal_area(int w,int h,int l) {
	   answer=(w*h*2)+(h*l*2)+(w*l*2);
   }
   
   void show(){
      System.out.println("Answer="+answer);
   }
}
public class Class01
{
   public static void main(String args[])
   {
      CWin cw=new CWin();
      cw.Cal_area(4,5,6);
      cw.show();
      cw.Cal_area(10);
      cw.show();
   }
}
/* output-------------
Answer=148.0
Answer=4188.786666666666
--------------------*/
