class Mahasiswa {
    private String nama;
    private String nim;
    private int nilai;

    // Konstruktor, getter, setter, dll.

    // Contoh konstruktor
    public Mahasiswa(String nama, String nim, int nilai) {
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
    }

    // Getter dan setter lainnya
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public int getNilai() {
        return nilai;
    }

    public void setNilai(int nilai) {
        this.nilai = nilai;
    }
}

public class BubbleSortMahasiswa {
    public static void main(String[] args) {
        Mahasiswa[] mahasiswas = {
            new Mahasiswa("Muhammad Sumbul", "12345", 85),
            new Mahasiswa("Ismail ahmad karawita", "67890", 72),
            new Mahasiswa("Khalid abdal jalil shisa", "54321", 92),
            // ... tambahkan mahasiswa lainnya
        };

        System.out.println("Daftar Mahasiswa sebelum diurutkan:");
        printMahasiswaArray(mahasiswas);

        bubbleSortMahasiswa(mahasiswas);

        System.out.println("\nDaftar Mahasiswa setelah diurutkan berdasarkan nilai:");
        printMahasiswaArray(mahasiswas);
    }

    static void bubbleSortMahasiswa(Mahasiswa[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j].getNilai() > arr[j+1].getNilai()) {
                    // menukar arr[j] dan arr[j+1]
                    Mahasiswa temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    static void printMahasiswaArray(Mahasiswa[] arr) {
        for (Mahasiswa mahasiswa : arr) {
            System.out.println(mahasiswa.getNama() + " - " + mahasiswa.getNilai());
        }
    }
}
