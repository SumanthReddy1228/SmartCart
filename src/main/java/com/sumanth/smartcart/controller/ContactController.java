package com.sumanth.smartcart.controller;

import com.sumanth.smartcart.dto.ContactRequestDto;
import com.sumanth.smartcart.service.IContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/contacts")
@RequiredArgsConstructor
public class ContactController {
    private final IContactService iContactService;

    @PostMapping
    public String saveContact(@RequestBody ContactRequestDto contactRequestDto){
        boolean isSaved =iContactService.saveContact(contactRequestDto);

        if(isSaved){
            return "Contact Saved";
        }
        return "Contact Not Saved";
    }
}
