package de.andron13.s11;

public class In1To10_13 {
    public static void main(String[] args) {
        System.out.println(in1To10(5, false));// → true
        System.out.println(in1To10(11, false));// → false
        System.out.println(in1To10(11, true));// → true
    }

    private static boolean in1To10One(int n, boolean outsideMode) {
        if (n >= 1 && n <= 10 && outsideMode) return true;
        return outsideMode || (n >= 1 && n <= 10);
    }

    private static boolean in1To10Two(int n, boolean outsideMode) {
        if (n >= 1 && n <= 10) {
            return true;
        } else if (n <= 1 || n >= 10 && outsideMode == true) {
            return true;
        }
        return false;
    }

    private static boolean in1To10Three(int n, boolean b) {
        if (n <= 1 || n >= 10 && b == true) {
            return true;
        }
        if (n <= 10) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean in1To10(int n, boolean outsideMode) {
        return (n >= 1 && n <= 10) || outsideMode;
    }
}
