package com.tugas;

class mahasiswa{

//membuat data member dari class mahasiswa
String nama;
int angkatan;
String asal;


//konstruktor
public mahasiswa(){
    nama = "banbang";
    angkatan = 1999;
    asal = "jawa";  
}

// method ubah (mengubah nama nama yang berada dalam data member)
void ubah(String nma, int angtn, String asl){
    nama = nma;
    angkatan = angtn;
    asal = asl;
} 
 //method untuk inisialisasi mahasiswa
void cetak(){
    System.out.println("nama : " +nama);
    System.out.println("angkatan : " + angkatan);
    System.out.println("asal : " +asal);
}

}

//class dengan nama test mahasiswa
class testMahasiswa {
    public static void main(String[] args) throws Exception {
        //menginisialisasikan mahasiswa dengan "MHS"
        mahasiswa MHS = new mahasiswa();
        System.out.println("IDENTITAS AWAL : ");
        MHS.cetak();

        MHS.ubah( "Fuad",  2003,   "nusa bai");
        System.out.println("\nIDENTITAS AKHIR : ");
        MHS.cetak();

    }
}


