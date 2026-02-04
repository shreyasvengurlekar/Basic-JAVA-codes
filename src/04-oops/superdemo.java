class A{
A()
{
System.out.println("I am inside superclass constructor");
}
}
class B extends A{
B()
{
super();
System.out.println("I am inside subclass constructor");
}
}
class superdemo{
public static void main(String args[])
{
//create object of subclass B
B b=new B();
}
}



