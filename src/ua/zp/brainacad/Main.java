package ua.zp.brainacad;

public class Main {
    /**
     * Class Main output to consol automatic transformations some types of variables
     */
    public static void main(String[] args) {
        // int -> float
        int intVar = 2_147_483_647;
        System.out.println("int -> float:\n" + intVar + " -> " + (float) intVar);
    }
}
