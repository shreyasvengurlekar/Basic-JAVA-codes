
/*You can create your own thread of execution by extending  a Thread class. All you need to do is to override the run() of Thread class
that contains the code that composes the functionality of the newly
created thread.Next give call to this run method by invoking the start() of Thread class.

*/

class childthread extends Thread{

childthread()
{
start();
}
public void run()
{
System.out.println("I am inside child thread....");
}
}

class mainthread1 {
public static void main(String args[])
{
System.out.println("I am inside main thread...");
childthread c=new childthread();
}
}