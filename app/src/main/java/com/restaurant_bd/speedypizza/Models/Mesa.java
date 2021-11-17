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
    private String codigo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString(){
        return codigo;
    }
}
