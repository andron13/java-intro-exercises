package de.andron13.s11;

public class Old35_14 {
    public static void main(String[] args) {
        System.out.println(old35One(3));// → true
        System.out.println(old35One(10)); //→ true
        System.out.println(old35One(15)); //→ false
        System.out.println(old35One(7)); //→ false
    }

    private static boolean old35One(int a) {
        if (a % 3 == 0 ^ a % 5 == 0) {
            return true;
        }
        return false;
    }

    private static boolean old35Two(int a) {
        return a % 3 == 0 ^ a % 5 == 0;
    }

    private static boolean old35Three(int a) {
        if (a % 3 == 0 && a % 5 == 0) {
            return false;
        }
        else {
            return (a % 3 == 0 || a % 5 == 0);
        }
    }

}
