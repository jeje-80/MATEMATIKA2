package Matematika;

/**
 *
 * @author Pongo
 */
class MatematikaCangGih extends Matematika {
    // Metode untuk mengalikan dua bilangan bulat
    public int perkalian(int a, int b) {
        return a * b;
    }

    // Metode untuk membagi dua bilangan desimal
    public double pembagian(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Pembagian dengan nol tidak diperbolehkan.");
        }
        return a / b;
    }

    // Metode untuk mendapatkan sisa bagi dari dua bilangan bulat
    public int modulus(int a, int b) {
        return a % b;
    }

    // Metode utama untuk menguji fungsi
    public static void main(String[] args) {
        MatematikaCangGih mcg = new MatematikaCangGih();

        // Menguji metode perkalian
        System.out.println("Perkalian 4 dan 5: " + mcg.perkalian(4, 5));

        // Menguji metode pembagian
        System.out.println("Pembagian 10.0 dan 2.0: " + mcg.pembagian(10.0, 2.0));

        // Menguji metode modulus
        System.out.println("Modulus 10 dan 3: " + mcg.modulus(10, 3));
    }
}