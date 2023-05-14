package com.example.BACKEND.RequestsClasses;

public class PersonaImgRequest {
    
    private int id;
    private String imagenstr; 
    private String banner;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImagen() {
        return imagenstr;
    }

    public void setImagen(String imagenstr) {
        this.imagenstr = imagenstr;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }
}
