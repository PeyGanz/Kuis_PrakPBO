/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lab Informatika
 */
public class Android implements MenghitungKelulusan{
//    Encapsulation -> getter & setter
    private String nik,nama,ket;
    private double tt,tc,ti,nilai;

    // Constructor
    public Android(String nik, String nama, double tt, double tc, double ti) {
        this.nik = nik;
        this.nama = nama;
        this.tt = tt;
        this.tc = tc;
        this.ti = ti;
    }
    
    
    @Override
    public void hitungnilai() {
        nilai=0.25*tt+0.5*tc+0.25*ti;
    }

    @Override
    public void ceklulus() {
        if(nilai>=85) ket="LULUS";
        else ket="TIDAK LULUS";
    }

    public String getKet() {
        return ket;
    }
    
    public double getNilai() {
        return nilai;
    }

    public double getTt() {
        return tt;
    }

    public void setTt(double tt) {
        this.tt = tt;
    }

    public double getTc() {
        return tc;
    }

    public void setTc(double tc) {
        this.tc = tc;
    }

    public double getTi() {
        return ti;
    }

    public void setTi(double ti) {
        this.ti = ti;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    
}
