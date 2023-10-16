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

        String types = getTypes();
        System.out.println(types);

        //firstName == 'Nikita'
        //lastName == 'Sinyukovich'

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name below:");
        String name = scanner.nextLine();
        System.out.println("Enter your last name below:");
        String fam = scanner.nextLine();
        System.out.println("FullName is: " + name + " " + fam);

        String sumOfTwoStrings = name + fam;
        String correctSum = name + " " + fam;
        if (sumOfTwoStrings.isEmpty()) {
            System.out.println("No information available");
        } else {
            int length = sumOfTwoStrings.length();
            System.out.println("The length is: " + length);


            char c = sumOfTwoStrings.charAt(7);
            System.out.println(sumOfTwoStrings + ", the 8th symbol is: " + c);

            String replacedFirstName = name.replace('a', 'i');
            boolean areEqual = name.equals(replacedFirstName);
            System.out.println("Strings are equal?: " + areEqual);

            boolean startsWithN = name.startsWith("N");
            System.out.println("Does the name start with letter \"N\"?: " + startsWithN);

            boolean endsWithMine = name.endsWith("a");
            System.out.println("Does the name end with letter \"a\"?: " + endsWithMine);

            boolean containsSin = correctSum.contains("Sin");
            System.out.println("Does the sumOfTwoStrings contain \"Sin\"?: " + containsSin);

            String lowerCase = name.toLowerCase();
            boolean areEqualWithoutReg = name.equalsIgnoreCase(lowerCase);
            System.out.println("Strings are equal with IgnoreCase?: " + areEqualWithoutReg);

            StringBuffer buffer;
            buffer = new StringBuffer(name);
            buffer.append(" " + fam);
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
        return String.format("byte is %d,short is %d, int is %d, long is %d, float is %s, double is %s, " +
                        "boolean is %s, char is %s",
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

