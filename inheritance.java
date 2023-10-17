class Calculator{
	public int add(int a,int b) {
		return a+b;
	}
	public int sub(int a,int b) {
		return a-b;
	}
}
	class AdvanceCalculator extends Calculator{
		public int multi(int a,int b) {
			return a*b;
		}
		public int div(int a,int b) {
			return a/b;
		}
	}
     class ProAdvancecalculator extends AdvanceCalculator{
    	 public int rem(int a,int b) {
    		 return a%b;
    	 }
     }
public class Inheritance{
	public static void main(String args[]) {
		ProAdvancecalculator c=new ProAdvancecalculator();
		System.out.println(c.add(5, 9));
		System.out.println(c.sub(13, 8));
		System.out.println(c.multi(5,8));
		System.out.println(c.div(25,6));
		System.out.println(c.rem(15,2));
		
	}
}
