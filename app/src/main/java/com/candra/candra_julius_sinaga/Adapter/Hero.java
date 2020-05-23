package com.candra.candra_julius_sinaga.Adapter;

public class Hero {
    private String nama;
    private String detail;
    private int Photo;
    private String sejarah;
    private String penemu;
    private String tangal;
    private int photoPenemu;

    // Membuat getter setter pada data
    String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }

    public String getDetail(){
        return detail;
    }
    public void setDetail(String detail){
        this.detail = detail;
    }
    public int getPhoto(){
        return Photo;
    }
    public void setPhoto(int photo){
        this.Photo = photo;
    }
    public String getSejarah(){
        return sejarah;
    }

    public void setSejarah(String sejarah) {
        this.sejarah = sejarah;
    }

    public String getPenemu() {
        return penemu;
    }

    public void setPenemu(String penemu) {
        this.penemu = penemu;
    }

    public String getTangal() {
        return tangal;
    }

    public void setTangal(String tangal) {
        this.tangal = tangal;
    }

    public int getPhotoPenemu() {
        return photoPenemu;
    }

    public void setPhotoPenemu(int photoPenemu) {
        this.photoPenemu = photoPenemu;
    }
}

