package com.sumanth.smartcart.service;


import com.sumanth.smartcart.dto.ContactRequestDto;

public interface IContactService {
    boolean saveContact(ContactRequestDto contactRequestDto);
}
