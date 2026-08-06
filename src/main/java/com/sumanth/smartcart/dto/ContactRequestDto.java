package com.sumanth.smartcart.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContactRequestDto {

    @NotBlank(message = "Name cannot be blank")
    private  String name;

    @NotBlank(message = "Email cannot be blank")
    @Email(message = "Invalid email address")
    private  String email;

    @NotBlank(message = "mobile number cannot be blank")
    @Pattern(regexp = "^\\d{10}$",message = "Mobile number must be 10 digits")
    private  String mobileNumber;

    @NotBlank(message = "Message cannot be blank")
    @Size(min = 5, max = 1000,message = "Message must be between 5 to 1000 characters")
    private String message;
}
