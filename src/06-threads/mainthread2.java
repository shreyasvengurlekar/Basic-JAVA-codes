class eventhread extends Thread{

eventhread()
{
start();  //this takes you inside run() of this newly created thread
}

public void run(){

for(int i=2;i<=20;i=i+2)
{
System.out.println("current even value is "+ i);
try{

Thread.sleep(302);
}catch(InterruptedException ex)
{

}
System.out.println("Child thread terminated...");
}
}
}

class mainthread2{
public static void main(String args[]){
eventhread e=new eventhread();

for(int i=1;i<=20;i=i+2)
{
System.out.println("current odd value is "+ i);

try{
Thread.sleep(305);
}catch(InterruptedException ex)
{

}
}
System.out.println("Main thread terminated...");
}
}