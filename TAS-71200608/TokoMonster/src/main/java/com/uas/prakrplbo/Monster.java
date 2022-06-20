package com.uas.prakrplbo;

public abstract class Monster implements MonsterInterface{
    private String nama;



    public Monster(String nama) {
        this.nama = nama;
    }

    protected Monster() {
    }

    public String bersuara(){
        return "Suara";
    }



    public void getInfo(){
        System.out.println("Nama : \t" +nama);
        System.out.println("Suara : \t" +bersuara());
        System.out.println("Gerak : \t" +nama+ " " +bergerak());

    }

    public String getNama() {
        return nama;
    }
}
