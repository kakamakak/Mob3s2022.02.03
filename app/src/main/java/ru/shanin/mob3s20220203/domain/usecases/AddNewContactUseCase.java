package ru.shanin.mob3s20220203.domain.usecases;

import ru.shanin.mob3s20220203.domain.entity.Contact;
import ru.shanin.mob3s20220203.domain.repository.ContactRepository;

public class AddNewContactUseCase {

    private ContactRepository cr;

    public AddNewContactUseCase(ContactRepository cr) {
        this.cr = cr;
    }

    public void addNewContact(Contact contact) {
        cr.addNewContact(contact);
    }

}
