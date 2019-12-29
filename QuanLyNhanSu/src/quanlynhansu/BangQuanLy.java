/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlynhansu;

/**
 *
 * @author quyto
 */
public class BangQuanLy {
    private NhanVien nv;
    private PhongBan p;
    private int soNgayLV;

    public BangQuanLy() {
    }

    public NhanVien getNv() {
        return nv;
    }

    public PhongBan getP() {
        return p;
    }

    public int getSoNgayLV() {
        return soNgayLV;
    }

    public void setNv(NhanVien nv) {
        this.nv = nv;
    }

    public void setP(PhongBan p) {
        this.p = p;
    }

    public void setSoNgayLV(int soNgayLV) {
        this.soNgayLV = soNgayLV;
    }
    
    
}
