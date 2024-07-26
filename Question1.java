import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Part 1
        System.out.println("Enter your first name:");
        String firstName = scanner.nextLine();
        System.out.println("Enter your middle name:");
        String middleName = scanner.nextLine();
        System.out.println("Enter your last name:");
        String lastName = scanner.nextLine();

        String fullName = lastName + ", " + firstName + " " + middleName;
        System.out.println("Full name: " + fullName);

        // Part 2
        System.out.println("Enter another full name:[Last name][First name][Midddle Name]");
        String anotherFullName = scanner.nextLine();

        if (fullName.equalsIgnoreCase(anotherFullName)) {
            System.out.println("The names are the same.");
        } else {
            System.out.println("The names are different.");
        }

        // Part 3
        String modifiedName = fullName.replace('a', '@').replace('e', '3').toUpperCase();
        System.out.println("Modified full name: " + modifiedName);

        // Part 4
        String[] nameParts = fullName.split(", ");
        String lastNamePart = nameParts[0];
        String[] firstAndMiddleName = nameParts[1].split(" ");
        String firstNamePart = firstAndMiddleName[0];
        String middleNamePart = firstAndMiddleName[1];

        System.out.println("Last Name: " + lastNamePart);
        System.out.println("First Name: " + firstNamePart);
        System.out.println("Middle Name: " + middleNamePart);

        // Part 5
        System.out.println("Enter a string with leading and trailing spaces:");
        String stringWithSpaces = scanner.nextLine();
        String trimmedString = stringWithSpaces.trim();
        System.out.println("Trimmed string: " + trimmedString);

        // Part 6
        int count = 0;
        for (char c : fullName.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        System.out.println("Number of vowels in the full name: " + count);

    }
}
