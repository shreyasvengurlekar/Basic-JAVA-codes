class methodoverloading{

void display()
{
System.out.println("I am Inside overloaded display() with empty parameters");
}

void display(int x)
{
System.out.println("Now I am Inside overloaded display() with 1 int parameters");
}

void display(int x,int y)
{
System.out.println("Now I am Inside overloaded display() with 2 int parameters");
}
void display(double f)
{
System.out.println("Now I am Inside overloaded display() with 1 float parameters");
}
}
class moverloading{
public static void main(String s[])
{
//create object of class methodoverloading
methodoverloading m=new methodoverloading();
m.display();   //overloaded version with empty parameters will be executed
m.display(5);  //overloaded version with 1 int parameters will be executed
m.display(5.5);  //overloaded version with 1 float parameters will be executed
m.display(5,10);  //overloaded version with 2 int parameters will be executed
}
}
