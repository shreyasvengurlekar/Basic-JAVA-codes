class first{
int a,b,c;    //data members
void show()   //method
{
c=a+b;
System.out.println("Addition is "+c);
}
}

class mainclass{
public static void main(String args[])
{
//create object of first class
first f=new first();
//access class members through class object
f.a=10;
f.b=20;
f.show();
}
}
