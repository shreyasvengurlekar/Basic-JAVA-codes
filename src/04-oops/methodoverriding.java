class A{

void show()
{

System.out.println("I am inside show() in superclass A");
}
}

class B extends A{

void show()
{
System.out.println("I am inside show() in subclass B");
//super.show();
}
}

class methodoverriding{
public static void main(String args[])
{

B b=new B();
b.show();
//super.show();   
}
}

