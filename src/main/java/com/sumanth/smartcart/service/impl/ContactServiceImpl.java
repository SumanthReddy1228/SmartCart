package com.sumanth.smartcart.service.impl;

import com.sumanth.smartcart.dto.ContactRequestDto;
import com.sumanth.smartcart.entity.Contact;
import com.sumanth.smartcart.repository.ContactRepository;
import com.sumanth.smartcart.service.IContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ContactServiceImpl implements IContactService {

    private  final ContactRepository contactRepository;

    @Override
    public boolean saveContact(ContactRequestDto contactRequestDto){

        try{
            Contact contact =transformToEntity(contactRequestDto);
            contact.setCreatedAt(Instant.now());
            contact.setCreatedBy(contactRequestDto.getName());
            contactRepository.save(contact);
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
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
