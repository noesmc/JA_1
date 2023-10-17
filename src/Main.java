import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String firstName = "Nikita",
                lastName = "Sinyukovich",
                pos = "Junior QA",
                comp = "SoftClub",
                dateStart = "Feb. 2022th";
        int age = 23;
        String aboutMe = String.format("Wassup! My name is %s %s. I'm %d years old. I've worked at %s as %s since %s!",
                firstName,
                lastName,
                age,
                comp,
                pos,
                dateStart);
        System.out.println(aboutMe);

        System.out.println(getTypes());

        //firstName == 'Nikita'
        //lastName == 'Sinyukovich'

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name below:");
        firstName = scanner.nextLine();
        System.out.println("Enter your last name below:");
        lastName = scanner.nextLine();
        if (firstName.isEmpty() || lastName.isEmpty()) {
            System.out.println("One of elements or all elements are empty");
        } else {
            System.out.println("FullName is: " + firstName + " " + lastName);

            String sumOfTwoStrings = firstName + lastName;
            String correctSum = firstName + " " + lastName;
            int length = sumOfTwoStrings.length();
            System.out.println("The length is: " + length);

                if (length >= 8) {
                    System.out.println(sumOfTwoStrings + ", the 8th symbol is: " +
                         sumOfTwoStrings.charAt(7));
                }

            System.out.println("Are strings equal?: " +
                    firstName.equals(firstName.replace('a', 'i')));

            System.out.println("Does the name start with letter \"N\"?: " +
                    firstName.startsWith("N"));

            System.out.println("Does the name end with letter \"a\"?: " +
                    firstName.endsWith("a"));

            System.out.println("Does the sumOfTwoStrings contain \"Sin\"?: " + correctSum.contains("Sin"));

            System.out.println("Are strings equal with IgnoreCase?: " +
                    firstName.equalsIgnoreCase(firstName.toLowerCase()));

            StringBuffer buffer;
            buffer = new StringBuffer(firstName);
            buffer.append(" ").append(lastName);
            System.out.println(buffer);
        }
    }
    private static String getTypes() {
        byte byteValue = 1;
        short shortValue = 11111;
        int intValue = 1111111111;
        long longValue = 11111111111111111L;
        float floatValue = 111.111F;
        double doubleValue = 111.1111111111111;
        boolean booleanValue = true;
        char charValue = 'C';
        return String.format("byte is %d, short is %d, int is %d, long is %d, float is %f, double is %f, " +
                        "boolean is %b, char is %c",
                byteValue,
                shortValue,
                intValue,
                longValue,
                floatValue,
                doubleValue,
                booleanValue,
                charValue);
    }
}