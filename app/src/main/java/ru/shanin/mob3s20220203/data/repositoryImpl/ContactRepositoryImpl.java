package ru.shanin.mob3s20220203.data.repositoryImpl;

import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;

import ru.shanin.mob3s20220203.data.generator.NewData;
import ru.shanin.mob3s20220203.domain.entity.Contact;
import ru.shanin.mob3s20220203.domain.repository.ContactRepository;

public class ContactRepositoryImpl implements ContactRepository {

    private static ArrayList<Contact> data;
    private static MutableLiveData<ArrayList<Contact>> dataLiveData;
    private static int autoIncrementId;

    static {
        data = new ArrayList<>();
        dataLiveData = new MutableLiveData<>();
        autoIncrementId = 0;
    }

    {
        for (int i = 0; i < 10; i++)
            addNewContact(NewData.newContact());
    }


    private void update() {
        dataLiveData.postValue(new ArrayList<>(data));
    }

    @Override
    public void addNewContact(Contact contact) {
        if (contact.get_id() == Contact.UNDEFINED_ID)
            contact.set_id(++autoIncrementId);
        data.add(contact);
        update();
    }

    @Override
    public MutableLiveData<ArrayList<Contact>> getAllContacts() {
        return dataLiveData;
    }
}
