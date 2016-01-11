package com.gojek.gobox.contactPersonDetailForm.presenter;

import com.gojek.gobox.contactPersonDetailForm.interactor.ContactPersonDetailFormInteractorImpl;

public class ContactPersonDetailFormFactory
{
  public static ContactPersonDetailFormPresenter createContactPersonPresenter()
  {
    return new ContactPersonDetailFormPresenterImpl(new ContactPersonDetailFormInteractorImpl());
  }
}


/* Location:              /Users/michael/Downloads/dex2jar-2.0/GO_JEK.jar!/com/gojek/gobox/contactPersonDetailForm/presenter/ContactPersonDetailFormFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */