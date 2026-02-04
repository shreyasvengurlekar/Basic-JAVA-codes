//use of 'throws' keyword:
/*
'throws' keyword is used to list the type of exceptions that a method can throw.

syntax:

return_type methodname(optional parameter list) throws exception_list
{

method body;

}

Here, exception_list is a comma seperated list of exceptions that a method can throw

*/


class throwsdemo{

public static void show()throws ArithmeticException,ArrayIndexOutOfBoundsException
{
int a=10,b=0,c;

c=a/b;

}
 
public static void main(String args[])
{

show();

System.out.println("good bye....");
}
}

