package com.company;

public class Farm2 {
    private String ownerName;
    private int address;

    private Cow cow;
    private Sheep sheep;
    private Horse horse;

    public Farm2() {
    }

    public Farm2(String ownerName, int address, Cow cow, Sheep sheep, Horse horse) {
        this.ownerName = ownerName;
        this.address = address;
        this.cow = cow;
        this.sheep = sheep;
        this.horse = horse;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    public Cow getCow() {
        return cow;
    }

    public void setCow(Cow cow) {
        this.cow = cow;
    }

    public Sheep getSheep() {
        return sheep;
    }

    public void setSheep(Sheep sheep) {
        this.sheep = sheep;
    }

    public Horse getHorse() {
        return horse;
    }

    public void setHorse(Horse horse) {
        this.horse = horse;
    }

    @Override
    public String toString() {
        return "Farm2{" +
                "ownerName='" + ownerName + '\'' +
                ", address=" + address +
                ", cow=" + cow +
                ", sheep=" + sheep +
                ", horse=" + horse +
                '}';
    }
}
