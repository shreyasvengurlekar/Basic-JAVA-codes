class finallydemo{
public static void main(String args[])
{
int a=10,b=0,c;
try{
c=a/b;
System.out.println("Division is "+c);
}catch(ArithmeticException e)
{
System.out.println("Exception caught is "+e);
}
finally{
System.out.println("Inside finally block...");
}
System.out.println("Good Bye....");
}
}