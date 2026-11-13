package com.example.a31;

public class Contact {
    private String name;
    private String phone;
    private int avId;

    public Contact(String name, String phone, int avId) {
        this.name = name;
        this.phone = phone;
        this.avId = avId;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public int getAvId() {
        return avId;
    }
}
