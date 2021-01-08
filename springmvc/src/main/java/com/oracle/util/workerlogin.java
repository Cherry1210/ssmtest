package com.oracle.util;

public class workerlogin {
private String telnum;
private String password;

    public workerlogin() {
    }

    public workerlogin(String telnum, String password) {
        this.telnum = telnum;
        this.password = password;
    }

    @Override
    public String toString() {
        return "workerlogin{" +
                "telnum='" + telnum + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getTelnum() {
        return telnum;
    }

    public void setTelnum(String telnum) {
        this.telnum = telnum;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
