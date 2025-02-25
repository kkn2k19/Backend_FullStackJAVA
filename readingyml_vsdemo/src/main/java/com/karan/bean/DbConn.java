package com.karan.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "db")
public class DbConn {
    private String driver;
    private String url;
    private String username;
    private String pass;

    public DbConn() {
        super();
    }

    public DbConn(String driver, String url, String username, String pass) {
        super();
        this.driver = driver;
        this.url = url;
        this.username = username;
        this.pass = pass;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "DbConn [driver=" + driver + ", url=" + url + ", username=" + username + ", pass=" + pass + "]";
    }

}
