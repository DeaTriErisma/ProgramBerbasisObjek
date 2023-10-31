
package programberbasisobjek;


public class DeaTriErisma {
    public static void main(String[] args) {
        double Nilai1;
       double Nilai2;
       double hasil;
 
       Scanner keyboard = new Scanner(System.in);
 
       System.out.print("Input angka-1: ");
       Nilai1 = keyboard.nextInt();
       System.out.print("Input angka-2: ");
       Nilai2 =keyboard.nextInt();
//
      // penjumlahan
       hasil = Nilai1 + Nilai2;
       System.out.println("Hasil = " + hasil);
//
       System.out.print("Input angka-1: ");
       Nilai1 = keyboard.nextInt();
       System.out.print("Input angka-2: ");
       Nilai2 = keyboard.nextInt();
//
      // pengurangan
       hasil = Nilai1 - Nilai2;
       System.out.println("Hasil = " + hasil);
//
        System.out.print("Input angka-1: ");
       Nilai1 = keyboard.nextInt();
       System.out.print("Input angka-2: ");
       Nilai2 = keyboard.nextInt();
    // perkalian
       hasil = Nilai1 * Nilai2;
       System.out.println("Hasil = " + hasil);
//
     System.out.print("Input angka-1: ");
       Nilai1 = keyboard.nextInt();
       System.out.print("Input angka-2: ");
       Nilai2 = keyboard.nextInt();
//
//        // Pembagian
       hasil = Nilai1 / Nilai2;
       System.out.println("Hasil = " + hasil);
//
       System.out.print("Input angka-1: ");
       Nilai1 = keyboard.nextInt();
       System.out.print("Input angka-2: ");
       Nilai2 = keyboard.nextInt();
 
       // Sisa Bagi
       hasil = Nilai1 % Nilai2;
       System.out.println("Hasil = " + hasil);
       
       System.out.print("Masukkan nilai pertama: ");
        int nilaiPertama = scanner.nextInt();

        System.out.print("Masukkan nilai kedua: ");
        int nilaiKedua = scanner.nextInt();

        if (nilaiPertama == nilaiKedua) {
            System.out.println("Nilai pertama sama dengan nilai kedua.");
        } else {
            System.out.println("Nilai pertama tidak sama dengan nilai kedua.");
            
            public class BitwiseOperation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan biner pertama: ");
        String biner1 = scanner.nextLine();

        System.out.print("Masukkan bilangan biner kedua: ");
        String biner2 = scanner.nextLine();

        int hasil = Integer.parseInt(biner1, 2) & Integer.parseInt(biner2, 2);

        System.out.println("Hasil operasi AND: " + Integer.toBinaryString(hasil));
   }
}
    
