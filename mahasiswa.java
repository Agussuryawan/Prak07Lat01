package pert7latihan01;

/**
 *
 * @author 20101290 I Ketut Agus Suryawan
 * Method Overloading
 */
public class mahasiswa {
    private String NIM, NAMA;
    public void datamhs(){
        System.out.println("Menampilkan Data Mahasiswa");
   }
    public void datamhs(String N){
        this.NIM = N ;
        System.out.println("Data Mahasiswa");
        System.out.println("Nama :"+this.NIM);
    }
    public void datamhs(String N1, String N2){
        this.NIM = N1;
        this.NAMA = N2;
        System.out.println("Data Mahasiswa");
        System.out.println("NIM     :"+this.NIM);
        System.out.println("Nama    :"+this.NAMA);
    }
}
