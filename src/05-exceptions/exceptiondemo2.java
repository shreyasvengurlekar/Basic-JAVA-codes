//Catching exception using try-catch block:

class exceptiondemo2{
public static void main(String args[])
{

int a=10,b=0,c;

try{
c=a/b;
System.out.println("This will not be printed...");
}catch(ArithmeticException e1)
{
System.out.println("Exception caught is "+e1);
}
System.out.println("Good bye....");
}
}


