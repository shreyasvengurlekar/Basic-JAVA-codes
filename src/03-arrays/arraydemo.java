class arraydemo{ 
public static void main(String args[])
{
int a[]={5,10,15,20,25,30,35,40,45,50};
int b[]=new int[5];
b[0]=100;
b[1]=200;
b[2]=300;
b[3]=400;
b[4]=500;

int x=a.length;

//access elements of array a
for (int i=0;i<x;i++)
{
System.out.println("Element at index "+ i +" is "+a[i]);
}
//access elements of array b
for (int i=0;i<b.length;i++)
{
System.out.println("Element at index "+ i +" is "+b[i]);
}

}
}