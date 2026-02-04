
class InvalidAgeException extends Exception{

InvalidAgeException(String title)
{

super(title);
}
}

class customexceptiondemo{

public static void validateage(int age)throws InvalidAgeException
{
if(age<18)
{
throw new InvalidAgeException("Invalid age...Not Eligible for Voting...");
}
else{
System.out.println("Eligible for Voting...");
}
}
public static void main(String args[])
{

try{

validateage(20);

}catch(InvalidAgeException e)
{
System.out.println(e);
//e.printStackTrace();

}
}
}

