package day1_Assignment;

public class static_property {
	// declared static variable
static	String FirstName2="Vikas";
static	String LastName2="Singh";
static	int age2=21;


//print using static block
class static_block{
static	String FirstName;
	static {
		 FirstName="Pavnesh";
		String LastName="Singh";
		int age=22;
		System.out.println(FirstName+" "+LastName+" "+age);
	}
	
}

	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//static_block t1=new static_block();
		System.out.println(static_block.FirstName);
		
		//print using static method
		printUsingStaticMethod();
		
		//print using static variable
		printUsingStaticVariable();
		}
		
	
	//print using static method
public static void	printUsingStaticMethod(){
		String FirstName="Vivek";
		String LastName="Kumar";
		int age=24;
		System.out.println(FirstName+" "+LastName+" "+age);
		
	}


//print using static variable
public static void printUsingStaticVariable() {
	System.out.println(FirstName2+" "+LastName2+" "+age2);
}
}


