package com.company;

public class Main {

    public static void main(String[] args) {

        String bullets = "print a bulleted list:\n" +
                "\t\u2022 first -point\n" +
                "\t\t\u2022 sub point";
        System.out.println(bullets); // \n is escape sequence for new line generation.
        // \t is escape sequence for tab generation
        // \u2022 is unicode for bullet


        String bulletInBlock = """
                print a bulleted list:
                        \u2022 first point
                            \u2022 sub point""";
        System.out.println(bulletInBlock);
        //triple quote allows for literal representation of typed formatting for cleaner code

        int age = 35;
        System.out.printf("your age is %d\n", age);
        //without the \n it will print content below on same line
        // %d is a format specifier to insert the variable 'age' where d is used for decimal integer (short, int long)

        int yearOfBirth = 2023 - age;
        System.out.printf("age = %d, birth year = %d%n", age, yearOfBirth);

        System.out.printf("age = %.3f%n", (float) age);
        // %f used for double and float decimal numbers, %n does same thing as \n
        // precision specified through '.3' for 3 0's after decimal
        // age casted to float because using 'f' not 'd'

        for (int i = 1; i <= 100000; i *= 10) {
            System.out.printf("printing %6d%n", i);
            // '6' indicates 6 total characters including spaces such that all output numbers will be aligned to the right
        }

        String formaattedString = String.format("your age is %d", age);
        // String.format is required when using  the format specifier when assigning string value to a variable
        System.out.println(formaattedString);
        //alternatively can do it like this for same output
         formaattedString = "your age is %d".formatted(age);
        System.out.println(formaattedString);

    }
}
