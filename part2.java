import java.util.Scanner;

public class part1 {
  public static void main (String[] argv)
  {
     Scanner keyboard = new Scanner(System.in);
     
     System.out.print("Enter first name:");
     String firstName = keyboard.nextLine();
     System.out.print("Enter middle name:");
     String middleName = keyboard.nextLine();
     System.out.print("Enter last name:");
     String lastName = keyboard.nextLine();
     
     System.out.print( firstName + " " + middleName + " "+ lastName);
     
     System.out.println("Enter Full name :");
     String secondName = keyboard.nextLine();
     
     StringBuilder stringBuilder = new StringBuilder();
     
     stringBuilder.append(firstName);
     stringBuilder.append(middleName);
     stringBuilder.append(lastName);
     
     String name2 = stringBuilder.toString();
     
     if (name2.equalIgnoreCase(secondName))
     {
       System.out.print("Names Match");
     }
     else
     {
       System.out.print("Names doesn't Match");
     }
     
     
  }
} 


