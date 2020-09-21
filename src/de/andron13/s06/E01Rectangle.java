package de.andron13.s06;

public class E01Rectangle {
    public static void main(String[] args) {
        rectangle(5, 7);
    }

    private static void rectangle(int height, int weight) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < weight; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
