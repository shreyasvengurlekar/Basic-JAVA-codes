//use of throw keyword:

class throwdemo{
public static void show()
{

try{
throw new NullPointerException("Demo Exception...");

}catch(NullPointerException e)
{
System.out.println("Exception caught is "+e);
throw e;
}
}

public static void main(String args[])
{
try{

show();
}catch(NullPointerException e1)
{
System.out.println("Exception recaught is "+e1);
}
}
}
