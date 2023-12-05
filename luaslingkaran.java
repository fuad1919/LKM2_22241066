package tugas.pbo;

class Lingkaran{
    double L;
    double K;
    double phi = 3.14;
    double r;
    
    //mengambl nilai r
    void setR(double r){
        this.r = r;
    }

    //menghitung rumus luas lingkaran
    double Luas(){
        return this.L = this.phi * this.r * this.r;
    }
    double Keliling(){
        return 2*phi*r;
    }

}

public class luaslingkaran {
      public static void main(String[] args) {
        Lingkaran lngk = new Lingkaran();
        lngk.setR(30.0);
        System.out.println("Luas Lingkaran = " + lngk.Luas());   
        System.out.println("\n Keliling Lingkaran = " + lngk.Keliling()); 
    }

    
}
