import java.util.Scanner;
public class String {
	java.lang.String str,result;
	int choice;
	void getData()
	{
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		choice=sc.nextInt();
	}
	void operation1()
	{
		 System.out.println("result1= "+(str.concat(str)));
	}
	void operation2()
	{
		for (int i=0; i < str.length(); i++){
	        if (i % 2 != 0){
	          result = str.substring(0,i-1) + "#" + str.substring(i, str.length());
	        }
	      }


	      System.out.println(result);
	}
	void operation3()
	{
		 for (int i = 0; i < str.length(); i++) {
	            for (int j = 0; j < result.length(); j++) {
	                if (str.charAt(i) != result.charAt(j)) {
	                    result = result + str.charAt(i);
	                }
	            }
	        }
         System.out.println(result);

	}
	void operation4()
	{
		for (int i = 0, len = str.length(); i < len; i++) {
		    char ch = str.charAt(i);
		    if (i % 2 != 0) 
		        System.out.print(Character.toUpperCase(ch));
		    }
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String obj=new String();
     obj.getData();
     obj.operation1();
     obj.operation2();
     obj.operation3();
     obj.operation4();
     }
}
