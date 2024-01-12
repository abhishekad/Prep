package CoreJavaConcepts;

public class Strings {

    // Pretty formatting in java
    public static void printTwoDecimals(double number){
        System.out.printf("Formatted and rounded of num is: %.2f", number);
    }

    public static void dynamicIntroduction(String name, String profession, int YOE){
        System.out.printf("My name is %s, I am a %s and I have total %d years of experience.", name, profession, YOE);
    }

    public static void main(String[] args){
        double number = 456.78998;
//        printTwoDecimals(number);
        String name = "Abhishek";
        String profession = "Software Engineer";
        int YOE = 3;
        dynamicIntroduction(name, profession, YOE);
    }

}
