class A{
void show()
{
System.out.println("I am inside superclass version of show()");
}
}

class B extends A{
void show()
{
System.out.println("I am inside subclass B  version of show()");
}
}

class C extends A{
void show()
{
System.out.println("I am inside subclass C version of show()");
}
}

class dynamicmethoddispatch{
public static void main(String args[])
{
//create reference variable of superclass A
A r;
//create objects of subclasses
B b=new B();
C c=new C();
//assign subclass B's object to superclass reference variable r;
r=b;   // r is currently point to subclass B
//call overriden method show() through superclass reference variable r

r.show();

r=c;   // r is currently pointing to subclass C
r.show();

//create object of superclass A
A a=new A();
a.show();
r=a;
r.show();
}
}
