package ru.shanin.mob3s20220203.app;

import android.app.Application;

import ru.shanin.mob3s20220203.data.repositoryImpl.ContactRepositoryImpl;
import ru.shanin.mob3s20220203.domain.usecases.AddNewContactUseCase;
import ru.shanin.mob3s20220203.domain.usecases.GetAllContactsUseCase;

public class AppStart extends Application {

    public static ContactRepositoryImpl contactRepositoryImpl = new ContactRepositoryImpl();
    public static AddNewContactUseCase addNew = new AddNewContactUseCase(contactRepositoryImpl);
    public static GetAllContactsUseCase getAll = new GetAllContactsUseCase(contactRepositoryImpl);
}
