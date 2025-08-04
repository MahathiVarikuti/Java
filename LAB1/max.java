package lab2_d10;

class Large{
	int a,b,c; //data	
	public void cal()
	{
	//actual logic to be written 	
	System.out.println("inside cal method");
	if(a>=b && a>=c){
		System.out.println(a + " is the largest");
				}
	else if(b>=a && b>=c){
		System.out.println(b + " is the largest");
	}
	else 
	{ System.out.print(c + " is the largest");
	}

}
}




public class max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Large l1 = new Large();//object is created
		l1.a = 10 ;
		l1.b = 25 ;
		l1.c = 5 ;
		l1.cal();
		
}
}
