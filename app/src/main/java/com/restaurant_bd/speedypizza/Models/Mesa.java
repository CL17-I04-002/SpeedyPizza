package com.restaurant_bd.speedypizza.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Mesa {

    /*
    @SerializedName
    Con esta anotación le indicamos que este campo va cambiar su nombre que el que
    viene en el objeto serializable
    */
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("codigo")
    @Expose
    private int numero;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setCodigo(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString(){
        return "" + numero;
    }
}
