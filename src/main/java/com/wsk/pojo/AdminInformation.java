package com.wsk.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdminInformation implements Serializable{
    private Integer id;

    private String ano;

    private String password;

    private Date modified;


    public void setAno(String ano) {
        this.ano = ano == null ? null : ano.trim();
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getModified() {
        return (Date) modified.clone();
    }

    public void setModified(Date modified) {
        this.modified = (Date) modified.clone();
    }
}