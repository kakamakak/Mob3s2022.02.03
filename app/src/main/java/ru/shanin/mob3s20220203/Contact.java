package ru.shanin.mob3s20220203;

public class Contact {

    public final static int UNDEFINED_ID;

    static {
        UNDEFINED_ID = -1;
    }

    private int _id;
    private final String firstName;
    private final String secondName;
    private final int age;
    private final String email;
    private final String phone;

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public Contact(String firstName, String secondName, int age, String email, String phone) {
        this._id = UNDEFINED_ID;
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.email = email;
        this.phone = phone;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append(firstName).append(" ").append(secondName);
        return sb.toString();
    }

    public String toMyString() {
        final StringBuffer sb = new StringBuffer("Contact{");
        sb.append("_id=").append(_id);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", secondName='").append(secondName).append('\'');
        sb.append(", age=").append(age);
        sb.append(", email='").append(email).append('\'');
        sb.append(", phone='").append(phone).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
