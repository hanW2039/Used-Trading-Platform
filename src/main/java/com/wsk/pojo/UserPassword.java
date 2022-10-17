package com.wsk.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserPassword implements Serializable {
    private Integer id;

    private Date modified;

    private String password;

    private Integer uid;

    public Date getModified() {
        // 如果没
        return modified == null ? null : (Date) modified.clone();
    }
    public void setModified(Date modified) {
        this.modified = modified == null ? null : (Date) modified.clone();
    }
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

}