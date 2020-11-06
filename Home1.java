package ru.geekbrains.java_one.lesson_a.online_h1;

public class Home1 {


        private static float calculate(int a, int b, int c, int d) {
            return a * (b + (c / d));
        }

        private static float calculate(float a, float b, float c, float d) {
            return a * (b + (c * 1.0f / d));
        }

        private static boolean checkTwoNumbers(int i, int g) {
            int sum = i + g;
            return sum <= 20 && sum >= 10;
        }
        private static Boolean isPositive(int liu) {
            return liu >= 0;
        }

        private static String welcome(String name) {
            System.out.println("Привет, имя!");
            return "Привет, " + name + "!";
        }

        private static boolean isLeapYer(int Year) {
            return (Year % 4 == 0) && (Year % 100 != 0);
        }

    public static void main(String[] args) {
        final int pA = 2;
        final int pB = 5;
        final int pC = 3;
        final int pD = 4;

        final float vA = 2f;
        final float vB = 5f;
        final float vC = 3.1f;
        final float vD = 4f;

        System.out.println("Calculation: " + calculate(pA, pB, pC, pD));

        System.out.println("Ol method returns: " + calculate(vA, vB, vC, vD));

        System.out.println("Sum two numbers: " + checkTwoNumbers(3, 17));

        System.out.println("number is: " + ((isPositive(-2)) ? "positive" : "negative") + "!");

        System.out.println(welcome("NameSomeone"));

        System.out.println("Years: " + isLeapYer(0));
    }

    }
