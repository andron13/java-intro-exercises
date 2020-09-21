package de.andron13.s06;

public class E02ThreeUnknowns {
    public static void main(String[] args) {
        threeUnknowns();
    }

    private static void threeUnknowns() {
        int n = 1;
        for (int i = 1; i <= 36; i++) {
            for (int j = i; j <= 36; j++) {
                for (int k = j; k <= 36; k++) {
                    if (i * j * k == 36) {
                        System.out.print("Вариант - " + n + " :");
                        System.out.print("x = " + i + ", ");
                        System.out.print("y = " + j + ", ");
                        System.out.print("z = " + k + ", ");
                        System.out.println();
                        n++;
                    }
                }
            }
        }
    }
}
