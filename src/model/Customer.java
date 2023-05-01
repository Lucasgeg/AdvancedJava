package model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String lastName;
    private String firstName;
    private int age;
    private String address;
    private String phone;
    private double totalPurchase;
    private List<Game> game = new ArrayList<>();

    public Customer() {
    }

    public Customer(String lastName, String firstName, int age, String address, String phone, double totalPurchase) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.totalPurchase = totalPurchase;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getTotalPurchase() {
        return totalPurchase;
    }

    public void setTotalPurchase(double totalPurchase) {
        this.totalPurchase = totalPurchase;
    }

    public List<Game> getGame() {
        return game;
    }

    public void setGame(List<Game> game) {
        this.game = game;
    }

    protected Boolean vipCustomer(){
        return totalPurchase > 1200;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", totalPurchase=" + totalPurchase +
                ", game=" + game +
                ", VIP? :"+ vipCustomer() +
                '}';
    }
}
