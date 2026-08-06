package com.sumanth.smartcart.controller;

import com.sumanth.smartcart.dto.ContactRequestDto;
import com.sumanth.smartcart.entity.Contact;
import com.sumanth.smartcart.service.IContactService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
@RequiredArgsConstructor
public class ContactController {
    private final IContactService iContactService;

    @PostMapping("/contacts")
    public ResponseEntity<String> saveContact(@Valid @RequestBody ContactRequestDto contactRequestDto){
        iContactService.saveContact(contactRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body("Contact Saved");
    }

    @GetMapping("/contacts")
    public  ResponseEntity<List<Contact>> getAllContacts(){
        return ResponseEntity.status(HttpStatus.OK).body(iContactService.getContacts());
    }
}
