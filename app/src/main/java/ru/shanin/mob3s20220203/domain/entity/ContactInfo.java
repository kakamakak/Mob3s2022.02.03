package ru.shanin.mob3s20220203.domain.entity;

public class ContactInfo {

    private final String firstName;
    private final String secondName;
    private final int age;
    private final String email;
    private final String phone;

    public ContactInfo(String firstName, String secondName, int age, String email, String phone) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.email = email;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return firstName + " " + secondName;
    }

    public String toMyString() {
        return "ContactInfo{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}
