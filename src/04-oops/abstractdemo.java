abstract class myclass{

void display()
{
System.out.println("I am inside display() of abstract super class 'myclass'");
}

 abstract void show();
}

class B extends myclass{

void show()
{
System.out.println("I am inside overriden show() of abstract super class 'myclass'");
}

}

class abstractdemo{
public static void main(String args[])
{

B b=new B();
b.show();
b.display();
//myclass m=new myclass();

}
}

