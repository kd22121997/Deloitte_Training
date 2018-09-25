class Welcome
{
	
public void display()
	{
		System.out.print("welcome to Deloitte");
		System.out.println("\n Welcome to ITPL");
	}
public void accept()
	{
		System.out.println("Welcome in accept");	
	}
public static void main(String[] args)
	{
		System.out.println("\nWelcome in MAIN");
		Welcome w= new Welcome();
		w.display();
		w.accept();
		Bye b = new Bye();
		b.sayBye();	
	}
}