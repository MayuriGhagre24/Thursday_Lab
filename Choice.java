//wAP accept choice from user and display the output
//choice 1 arithmetic operation choice2 assignment choice3 byte wise choice4 logical 
import java.util.Scanner;
public class Choice 
{
	public static void main (String args[])
	{
		System.out.println("Enter1:Arithmetic Operator:");
		System.out.println("Enter2:Assignment Operator:");
		System.out.println("Enter3:logical operator:");
		System.out.println("Enter4:relational operator");
		System.out.println("Enter5:bitwise operator");
		int num1 ,num2,choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		System.out.println("Enter the Second number:");
		num1=sc.nextInt();
		num2=sc.nextInt();
		System.out.println("Enter Choice:");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			int addition,multiple,subtraction,division,modules;
			addition=num1+num2;
			multiple=num1*num2;
			subtraction=num1-num2;
			division=num1/num2;
			modules=num1%num2;
			System.out.println("Addition is"+ addition);
			System.out.println("Multiplication is"+ multiple);
			System.out.println("Subtraction is"+ subtraction);
			System.out.println("Division is"+ division);
			System.out.println("Module is"+ modules);
			break;
		case 2:
		System.out.println("Assignment operator");
		System.out.println("+="+(num1+=num2));
		System.out.println("-="+(num1-=num2));
		System.out.println("*="+(num1*=num2));
		System.out.println("/="+(num1/=num2));
		System.out.println("%="+(num1%=num2));
		break;
		case 3:
			int num3;
			System.out.println("Enter third number:");
			num3=sc.nextInt();
			System.out.println("Logical operator");
			System.out.println("Logical OR operator" + (num1>num2 || num3>num2));
			System.out.println("Logical Not Operator" + (!(num1>num2)));
			System.out.println("Logical AND operator" + (num1>num2 && num3>num2));
			
		break;
		case 4:
			System.out.println("Relational operator");
			System.out.println("<="+(num1<=num2));
			System.out.println(">="+(num1>=num2));
			System.out.println("=="+(num1==num2));
			System.out.println("!="+(num1!=num2));
		break;
		case 5:
			System.out.println("Bitwise operator");
			System.out.println(Integer.toBinaryString(num1));
			System.out.println(Integer.toBinaryString(num2));
			System.out.println(num1 & num2);
			System.out.println(num1 | num2);
			System.out.println(num1 ^ num2);
		}
	}
}
