package com.sumanth.smartcart.service.impl;

import com.sumanth.smartcart.dto.ContactRequestDto;
import com.sumanth.smartcart.entity.Contact;
import com.sumanth.smartcart.repository.ContactRepository;
import com.sumanth.smartcart.service.IContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ContactServiceImpl implements IContactService {

    private  final ContactRepository contactRepository;

    @Override
    public boolean saveContact(ContactRequestDto contactRequestDto){

            Contact contact =transformToEntity(contactRequestDto);
            contactRepository.save(contact);
            return true;
    }

    public Contact transformToEntity(ContactRequestDto contactRequestDto){
        Contact contact = new Contact();
        BeanUtils.copyProperties(contactRequestDto,contact);
        return contact;
    }

    public List<Contact> getContacts(){
        return contactRepository.findAll();
    }

}
