//Catching multiple exceptions:

class multiexceptiondemo{
public static void main(String args[])
{
int a=10,b,c;
int d[]=new int[5];
b=args.length;
try{
c=a/b;
System.out.println("Division is "+c);
d[1]=100;
throw new NullPointerException ("Demo exception");
}catch(ArithmeticException e1)
{
System.out.println("Exception caught is "+e1);
}
catch(ArrayIndexOutOfBoundsException e2)
{
System.out.println("Exception caught is "+e2);
}
catch(Exception e3)
{
System.out.println("Exception caught is "+e3);
}
System.out.println("Good bye....");
}
}


