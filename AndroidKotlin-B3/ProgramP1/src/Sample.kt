import kotlin.io.readLine
import java.util.Scanner

//fun main(args:Array<String>)
//{
//	
//	var name="welcome"
//	val pid=1001
//	println("Welcome to the Application")
//	println("Your name is ${name} Welcome to your compay ")
//}

/*fun main(args:Array<String>)
{
	var pid=1001;
	val pname="apple";
	
	println("Your pid is::"+pid);
	println("Your pname is::"+pname);
	
	println("Your pid is $pid Your pname is $pname")
}*/

/*fun main(args:Array<String>)
{
	var pid:Int=2001
	var pname:String="apple"
	println("Your productId is $pid and Your productname is $pname")
	
}*/

/*fun main(args:Array<String>)
{
	var salary=1000;
	salary=2000;
	println("Updated value is::"+salary)
}*/

//Operators
/*fun main(args:Array<String>)
{
	var a=10;
	var b=20;
	var c=a+b;
	print("Addition::"+(c))
	print("Sub::"+(a-b))
	print("Multiple::"+(a*b))
	print("Division::"+(a/b))
	print("Module::"+(a%b))
}*/

/*fun main(args:Array<String>)
{
	var a=100;
	var b=200;
	println("Lessthan::"+(a<b))
	println("Greaterthan::"+(a>b))
	println("LessthanEqualto::"+(a<=b))
	println("Equal to::"+(a==b))
	println("NotEqual::"+(a!=b))
}*/
/*fun main(args:Array<String>)
{
	var a=100;
	var b=200;
	println("LogicalAND::"+((a<b)&&(b>a)))
	println("LogicalAND::"+((a>b)&&(b>a)))
	println("LogicalOR::"+((a>b)||(b>a)))
	println("LogicalNOT::"+(!(a>b)))
}*/
//Runtime Inputs
/*fun main(args:Array<String>)
{
	println("Enter the Name::")
	val name=readLine();
	println("Enter the Age is::")
	val age:Int=Integer.valueOf(readLine());
	println("Your Name is::${name}Your Age is::${age}")
}*/

fun main(args:Array<String>)
{
	val r1=Scanner(System.`in`)
	println("Enter your age is::")
	val age=r1.nextInt();
	println("Your age is::"+age)
}