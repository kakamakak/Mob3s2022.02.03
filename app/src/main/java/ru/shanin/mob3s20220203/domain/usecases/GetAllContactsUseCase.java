package ru.shanin.mob3s20220203.domain.usecases;

import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;

import ru.shanin.mob3s20220203.domain.entity.Contact;
import ru.shanin.mob3s20220203.domain.repository.ContactRepository;

public class GetAllContactsUseCase {
    private ContactRepository cr;

    public GetAllContactsUseCase(ContactRepository cr) {
        this.cr = cr;
    }

    public MutableLiveData<ArrayList<Contact>> getAllContacts() {
        return cr.getAllContacts();
    }
}
