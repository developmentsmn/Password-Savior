package com.developmentsmn.passwordsavior.datamodule;

import java.lang.reflect.Constructor;

public class PasswordItem {
    private String siteName;
    private String email;
    private String password;

    public PasswordItem(String siteName, String email, String password) {
        this.siteName = siteName;
        this.email = email;
        this.password = password;
    }

    public String getSiteName() {
        return siteName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return  siteName;
    }
}
