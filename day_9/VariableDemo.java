package day_9;

public class VariableDemo {
    int s = 45; // instance variable

    static int g = 25; // static variable

    public static void main(String[] args) {
        int r = 33; // Local variable

        System.out.println(r);

        System.out.println(g);
        VariableDemo obj = new VariableDemo();
        System.out.println(obj.s);

    }
}
