class oddthread extends Thread{

oddthread()
{
start();
}

public void run(){
for(int i=1;i<=20;i=i+2)
{
System.out.println("current odd value is "+ i);
try{
Thread.sleep(500);
}catch(InterruptedException ex)
{
System.out.println("Odd Thread interrupted..");
}

}
}
}



class eventhread extends Thread{

eventhread()
{
start();
}

public void run(){
for(int i=2;i<=20;i=i+2)
{
System.out.println("current even value is "+ i);
try{
Thread.sleep(501);
}catch(InterruptedException ex)
{
System.out.println("Even Thread interrupted..");
}
System.out.println("Even thread terminated...");
}
}
}

class oddeven{
public static void main(String args[])
{
oddthread odd=new oddthread();
eventhread even =new eventhread();


try{
Thread.sleep(7000);
}catch(InterruptedException ex)
{

}

System.out.println("Main thread terminated...");
}
}

