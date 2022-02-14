package ru.shanin.mob3s20220203.presentation.main;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

import ru.shanin.mob3s20220203.app.AppStart;
import ru.shanin.mob3s20220203.domain.entity.Contact;

public class MainViewModel extends ViewModel {

    public MutableLiveData<ArrayList<Contact>> dataLiveData = AppStart.getAll.getAllContacts();

    public void addNew(Contact contact) {
        AppStart.addNew.addNewContact(contact);
    }

}
