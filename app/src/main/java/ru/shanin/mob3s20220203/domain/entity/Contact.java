package ru.shanin.mob3s20220203.domain.entity;

public class Contact {

    public final static int UNDEFINED_ID;

    static {
        UNDEFINED_ID = -1;
    }

    private int _id;
    private ContactInfo ci;

    public Contact(ContactInfo ci) {
        this.ci = ci;
        this._id = UNDEFINED_ID;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public ContactInfo getCi() {
        return ci;
    }

    @Override
    public String toString() {
        return ci.toString();
    }

    public String toMyString() {
        return "Contact{" +
                "_id=" + _id +
                ", ci=" + ci +
                '}';
    }
}
