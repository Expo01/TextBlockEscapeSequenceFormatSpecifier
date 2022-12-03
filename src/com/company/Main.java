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
                        /u2022 sub point""";

        //update required

    }
}
