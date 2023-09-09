package SearchingObject;

public class Test {
    public static void main(String[] args) {
        Mahasiswa[] arrayMahasiswa = new Mahasiswa [15];

        for (int i = 0; i < arrayMahasiswa.length; i++) {
            arrayMahasiswa[i] = new Mahasiswa();
            arrayMahasiswa[i].setNim(i);
        }

        Mahasiswa cari = new Mahasiswa();
        cari.setNim(11);
        
        System.out.println(ObjectSearching.interpolationSearch(arrayMahasiswa, cari));
    }
}
