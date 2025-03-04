package com.example.SpringBootWeb;

public class Alien {

    private int aid;
    private String aname;


    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getAname() {
        return aname;
    }

    @Override
    public String toString(){
        return "Alien{" + "aid=" + aid + ", aname= " + aname + "}";
    }
}
