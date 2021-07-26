public class Test
{
public static void main(String args[])
{
	//array and for each loop
	int array[] = new int[4];
	array[0] = 100;
	array[1] = 200;
	array[2] = 300;
	array[3] = 400;
	
	String namesList[] ={"ravina","vikram","Thangamani","Thangavel","Rajaram","Kavi","ganesh"};
	
	for(int x:array)
	{
		System.out.println(x);
	}
	for(String y:namesList)
	{
		System.out.println(y);
	}
	System.out.println("\n");
	for(int i=0;i<array.length;i++)
	{
		System.out.println(array[i]);
	}
int n = 10;
boolean value = true;
//if else if	
if(n != 10)
{
System.out.println("Equal to 9!Great Work");
}

else if(n>=10)
{
System.out.println("Greater than or equal to 10!Great Work");
}

else if(n<=10)
{
System.out.println("less than or equal to 10!Great Work");
}

else if(n==10)
{
System.out.println("less than or equal to 10!Great Work");
}
else		
{
System.out.println("No conditions matched");
}
System.out.println("_____________________________________");
//nested if
if(n == 10 && value == true)
{
if(n == 10 || value == false)
{

System.out.println("Nested if worked!Smart Work:)");
}

}
System.out.println("_____________________________________");
//for loop
for(int i=2;i>1;i--)
{
System.out.println("Hello Ravina");
}
System.out.println("_____________________________________");
for(int i=5;i<10;i++)
{
System.out.println("Hello Vikram");
}
System.out.println("_____________________________________");
//++i
for(int i=0;i<10;++i)
{
int num1=++i;
System.out.println("++i:"+num1);
}
System.out.println("_____________________________________");
//i++
for(int i=0;i<10;i++)
{
int num2=i++;
System.out.println("i++:"+num2);
}
System.out.println("_____________________________________");
System.out.println("For Loop Finished! & modulus operator:"+ (n % 2));
System.out.println("_____________________________________");
//nested for loop
for(int a = 0;a<=5;a++) //top to bottom
{
for(int b = 0;b<= 5;b++)//left to right
{
	System.out.print("*");
	System.out.print(" ");
}

System.out.println(" ");
}
System.out.println("_____________________________________");
for(int a = 0;a<=5;a++) //top to bottom
{
for(int b = 0;b<= 5;b++)//left to right
{
	System.out.print(a);
	System.out.print(" ");
}

System.out.println(" ");
}
System.out.println("_____________________________________");
for(int a = 0;a<=5;a++) //top to bottom
{
for(int b = 0;b<= 5;b++)//left to right
{
	System.out.print(b);
	System.out.print(" ");
}

System.out.println(" ");
}
System.out.println("_____________________________________");
for(int a = 0;a<=5;a++) //top to bottom
{
for(int b = 0;b<= a;b++)//left to right     
{
	System.out.print("*");
	System.out.print(" ");
}

System.out.println(" ");
}
System.out.println("_____________________________________");
//labelled for loop and break , continue
first:
for(int a = 0;a<=2;a++) //top to bottom
{
second:
for(int b = 0;b<= 2;b++)//left to right     
{
	if(b == 1)
	{
		break second;
	}
	System.out.println("welcome1 @-) ");
}

System.out.println("welcome2 @-) ");
}
System.out.println("_____________________________________");
//switch case

String name="vikram";

switch(name)
{
case "ravi":
System.out.println("wrong");
break;

case "vikram":
System.out.println("Yes vikram is the right name u found");
break;

default:
System.out.println("No match");

}

//infinite for loop,while loop,do while loop
/*for(;;)
{
System.out.println("@");
}*/
int values = 0;
while(values<=5)
{
System.out.println("*");
values++;
}
int values2 = 6;
do{
System.out.println("do while");
values2++;
}while(values2<=5);
/*while(true)
{
System.out.print("*");

}*/
}
}