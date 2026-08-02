package com.sumanth.smartcart.service;


import com.sumanth.smartcart.dto.ContactRequestDto;
import com.sumanth.smartcart.entity.Contact;

import java.util.List;

public interface IContactService {
    boolean saveContact(ContactRequestDto contactRequestDto);
    List<Contact> getContacts();
}
