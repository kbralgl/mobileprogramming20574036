package com.example.donemodevi;

public class settings {
    private String sinavSuresi, soruPuani, zorlukDuzeyi;

    //sinavSuresi
    public void setsinavSuresi(String sinavSuresi){
        this.sinavSuresi = sinavSuresi;
    }
    public String getsinavSuresi(){
        return sinavSuresi;
    }

    //soruPuani
    public void setsoruPuani(String soruPuani){
        this.soruPuani = soruPuani;
    }
    public String getsoruPuani(){
        return soruPuani;
    }

    //zorlukDuzeyi
    public void setzorlukDuzeyi(String zorlukDuzeyi){
        this.zorlukDuzeyi = zorlukDuzeyi;
    }
    public String getzorlukDuzeyi(){
        return zorlukDuzeyi;
    }

}
