package lab2_d10;
class Large2{
	int a,b,c; //data	
	public int cal()
	{
	//actual logic to be written 	
	System.out.println("inside cal method");
	if(a>=b){
		if(a>=c)
//			System.out.println(a + " is the largest");
			return a ;
		else
//			System.out.println(c+ " is the largest");
			return c ;
			}
		else {
			if (b>=c)
//				System.out.println(b + " is the largest");
				return b ;
			else 
//				System.out.println(c + " is the largest");
				return c; 
		}
				}
}





public class max2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Large2 l1 = new Large2();//object is created
		l1.a = 10 ;
		l1.b = 25 ;
		l1.c = 35 ;
//		l1.cal();
		System.out.println(l1.cal() + " is the largest")
}
}