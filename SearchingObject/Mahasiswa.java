package SearchingObject;

public class Mahasiswa extends Object implements Comparable<Mahasiswa>,Valued {
    private String nama;
    private int nim;
    
    Mahasiswa() {
        this.nama = "Kosong";
        this.nim = 0;
    }

    Mahasiswa(String nama, int nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public int getNim() {
        return nim;
    }

    public String toString() {
        return String.format("Nama : %1$s, Nim : %2$s", this.nama,this.nim); 
    }

    public int getValue() {
        return getNim();
    }

    public int compareTo(Mahasiswa objectMahasiswa ) {
        if (this.getNim() == objectMahasiswa.getNim()) {
            return 0;
        } else if (this.getNim() < objectMahasiswa.getNim()) {
            return -1;
        } else {
            return 1;
        }
    }
}   
