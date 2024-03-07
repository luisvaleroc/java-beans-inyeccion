package com.factura.demo.demofactura.models;

public class Product {


    private  String name;
    private  Integer pirice;
    public Product() {
    }

    public Product(String name, Integer pirice) {
        this.name = name;
        this.pirice = pirice;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPirice() {
        return pirice;
    }

    public void setPirice(Integer pirice) {
        this.pirice = pirice;
    }
}
