package com.example.Springmogodp.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Frutis {

    @Id
    private  String id;
    private String Fruitsname;
    private  String color;
    private int price;

    public String getId(){
        return id;
    }
    public void setId(){
        this.id=id;
    }
    public String getFruitsname(){
        return Fruitsname;
    }
    public void setFruitsname(String fruitsname){
        this.Fruitsname=
    }




}
