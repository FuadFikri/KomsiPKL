package com.komsi.komsipkl;

public class Kegiatan {

    private String kegiatan;
    private String deskripsi;
    private String tanggal;
    private Integer status;

    public Kegiatan(String kegiatan, String deskripsi, String tanggal, Integer status) {
        this.kegiatan = kegiatan;
        this.deskripsi = deskripsi;
        this.tanggal = tanggal;
        this.status=status;

    }

    public String getkegiatan() {
        return kegiatan;
    }

    public void setkegiatan(String kegiatan) {
        this.kegiatan = kegiatan;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
    public Integer getStatus(){
        return status;
    }
    public void setStatus(Integer status){
        this.status=status;
    }

}
