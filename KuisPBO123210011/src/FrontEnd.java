/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lab Informatika
 */
public class FrontEnd extends Web implements MenghitungKelulusan{
    //    Encapsulation -> getter & setter
    private double tt,tc,ti,nilai;
    private String ket;

    public FrontEnd(double tt, double tc, double ti, String nik, String nama) {
        super(nik, nama);//inheritance
        this.tt = tt;
        this.tc = tc;
        this.ti = ti;
    }
    //Polymorphism -> Overload dan Override
    // Overload
    public FrontEnd(float tt, float tc, float ti, String nik, String nama) {
        super(nik, nama);
    }
    
    @Override
    public void hitungnilai() {
        nilai=0.5*tt+0.2*tc+0.3*ti;
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
    
    
    
}
