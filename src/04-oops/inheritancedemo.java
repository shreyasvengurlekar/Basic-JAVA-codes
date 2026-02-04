class superclass{

int a,b;

void show()
{

System.out.println("Current value of a and b is "+a+"  and "+b);

}
}

class subclass extends superclass{
int c;

void showc()
{
System.out.println("Current value of c is "+c);
}

void sum()
{

System.out.println("Sum of a ,b and c is "+(a+b+c));
}
}

class inheritancedemo{
public static void main(String args[])
{
//create object of superclass
superclass s=new superclass();
//assign value to variable a and b of superclass
s.a=10;
s.b=20;
//display contents of superclass
s.show();

//create object of subclass
subclass s1=new subclass();
//assign values to subclass instance variables
s1.a=100;
s1.b=200;
s1.c=300;
//display contents of sublass
s1.show();
s1.showc();
s1.sum();
}
}



