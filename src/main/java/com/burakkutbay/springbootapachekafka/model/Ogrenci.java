package com.burakkutbay.springbootapachekafka.model;

/**
 * Created by Hasan Burak KUTBAY on 12/13/20.
 */
public class Ogrenci {
    private String adi;
    private int numarasi;

    public Ogrenci(String adi, int numarasi) {
        this.adi = adi;
        this.numarasi = numarasi;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public int getNumarasi() {
        return numarasi;
    }

    public void setNumarasi(int numarasi) {
        this.numarasi = numarasi;
    }
}
