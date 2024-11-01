import java.util.Scanner;

/**
 * Program HitungBMI adalah aplikasi untuk menghitung Body Mass Index (BMI) pengguna
 * berdasarkan berat dan tinggi badan yang dimasukkan. Program ini juga menampilkan
 * kategori BMI berdasarkan hasil perhitungan.
 */
class HitungBMI {

    /**
     * Metode utama untuk menjalankan program HitungBMI.
     *
     * @param args argumen baris perintah
     */
    public static void main(String[] args) {
        // Membuat scanner untuk input pengguna
        Scanner input = new Scanner(System.in);

        // Memanggil metode untuk input tinggi badan
        double tinggi = InputTinggi(input);

        // Memanggil metode untuk input berat badan
        double berat = InputBerat(input);

        // Menghitung BMI menggunakan metode hitungBMI
        double bmi = hitungBMI(berat, tinggi);

        // Menampilkan hasil BMI
        TampilkanBMI(bmi);

        // Menampilkan kategori berdasarkan hasil BMI
        tampilkanKategoriBMI(bmi);

        // Menutup scanner
        input.close();
    }

    /**
     * Menampilkan hasil perhitungan BMI ke layar.
     *
     * @param bmi nilai BMI yang akan ditampilkan
     */
    private static void TampilkanBMI(double bmi) {
        System.out.println("BMI Anda adalah: " + bmi);
    }

    /**
     * Menghitung BMI berdasarkan berat dan tinggi yang diberikan.
     *
     * @param berat berat badan dalam kilogram
     * @param tinggi tinggi badan dalam meter
     * @return nilai BMI yang dihitung
     */
    private static double hitungBMI(double berat, double tinggi) {
        return berat / (tinggi * tinggi);  // Rumus BMI: berat(kg) / tinggi^2(m)
    }

    /**
     * Meminta input berat badan dari pengguna.
     *
     * @param input objek Scanner untuk membaca input pengguna
     * @return berat badan dalam kilogram
     */
    private static double InputBerat(Scanner input) {
        System.out.print("Masukkan berat badan Anda (dalam kilogram): ");
        double berat = input.nextDouble();
        return berat;
    }

    /**
     * Meminta input tinggi badan dari pengguna.
     *
     * @param input objek Scanner untuk membaca input pengguna
     * @return tinggi badan dalam meter
     */
    private static double InputTinggi(Scanner input) {
        System.out.print("Masukkan tinggi badan Anda (dalam meter): ");
        double tinggi = input.nextDouble();
        return tinggi;
    }

    /**
     * Menampilkan kategori BMI berdasarkan nilai BMI yang dihitung.
     *
     * @param bmi nilai BMI yang akan dievaluasi
     */
    public static void tampilkanKategoriBMI(double bmi) {
        if (bmi < 18.5) {
            System.out.println("Anda berada dalam kategori: Kekurangan berat badan.");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Anda berada dalam kategori: Normal.");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("Anda berada dalam kategori: Kelebihan berat badan.");
        } else {
            System.out.println("Anda berada dalam kategori: Obesitas.");
        }
    }
}
