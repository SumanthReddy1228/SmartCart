package com.sumanth.smartcart.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContactRequestDto {
    private  String name;
    private  String email;
    private  String mobileNumber;
    private String message;
}
