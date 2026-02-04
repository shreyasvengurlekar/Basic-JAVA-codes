class arraysorting{ 
public static void main(String args[])
{
int a[]={5,2,6,3,1,4,7,8,10,9};
int x=a.length;
int i,j;
//Array elements before sorting are...
for (i=0;i<x;i++)
{
System.out.println("Element at index "+ i +" is "+a[i]);
}
int temp;
for(i=0;i<x;i++)
{
for(j=i+1;j<x;j++)
{
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
//sorted array in ascending order is
System.out.println("Sorted array is...");
for (i=0;i<x;i++)
{
System.out.println("Element at index "+ i +" is "+a[i]);
}
}
}