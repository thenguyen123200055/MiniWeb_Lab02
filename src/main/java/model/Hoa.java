/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author Administrator
 */
public class Hoa {
    private int mahoa;
    private String tenhoa;
    private double gia;
    private String hinh;
    private int maloai;
    private Date ngaycapnhat;

    public Hoa() {
    }

    public Hoa(int mahoa) {
        this.mahoa = mahoa;
    }

    public Hoa(int mahoa, String tenhoa, double gia, String hinh, int maloai, Date ngaycapnhat) {
        this.mahoa = mahoa;
        this.tenhoa = tenhoa;
        this.gia = gia;
        this.hinh = hinh;
        this.maloai = maloai;
        this.ngaycapnhat = ngaycapnhat;
    }

    public int getMahoa() {
        return mahoa;
    }

    public void setMahoa(int mahoa) {
        this.mahoa = mahoa;
    }

    public String getTenhoa() {
        return tenhoa;
    }

    public void setTenhoa(String tenhoa) {
        this.tenhoa = tenhoa;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    public int getMaloai() {
        return maloai;
    }

    public void setMaloai(int maloai) {
        this.maloai = maloai;
    }

    public Date getNgaycapnhat() {
        return ngaycapnhat;
    }

    public void setNgaycapnhat(Date ngaycapnhat) {
        this.ngaycapnhat = ngaycapnhat;
    }

    @Override
    public String toString() {
        return "Hoa{" + "mahoa=" + mahoa + ", tenhoa=" + tenhoa + ", gia=" + gia + ", hinh=" + hinh + ", maloai=" + maloai + ", ngaycapnhat=" + ngaycapnhat + '}';
    }
    
}
