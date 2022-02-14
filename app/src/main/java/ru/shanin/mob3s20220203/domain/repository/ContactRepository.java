package ru.shanin.mob3s20220203.domain.repository;

import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;

import ru.shanin.mob3s20220203.domain.entity.Contact;

public interface ContactRepository {

    void addNewContact(Contact contact);

    MutableLiveData<ArrayList<Contact>> getAllContacts();

}
