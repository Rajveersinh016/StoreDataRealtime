package com.example.storedatarealtime;

public class DataClass {

    private String data_Title;
    private String data_desc;
    private String data_lang;
    private String data_image;

    public String getData_Title() {
        return data_Title;
    }

    public String getData_desc() {
        return data_desc;
    }

    public String getData_lang() {
        return data_lang;
    }

    public String getData_image() {
        return data_image;
    }

    public DataClass(String data_Title, String data_desc, String data_lang, String data_image) {
        this.data_Title = data_Title;
        this.data_desc = data_desc;
        this.data_lang = data_lang;
        this.data_image = data_image;
    }

    public DataClass(){

    }
}
