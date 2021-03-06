package de.andron13.s11;

public class DateFashion_11 {
    public static void main(String[] args) {
        System.out.println(dateFashion(5, 10)); //→ 2
        System.out.println(dateFashion(5, 2)); //→ 0
        System.out.println(dateFashion(5, 5)); //→ 1
        System.out.println(dateFashion(3, 8)); //→ 1
    }

    private static int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2) {
            return 0;
        } else if (you >= 8 || date >= 8) {
            return 2;
        }
        return 1;
    }
}
