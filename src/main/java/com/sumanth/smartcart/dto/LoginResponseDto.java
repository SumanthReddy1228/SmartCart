package com.sumanth.smartcart.dto;

public record LoginResponseDto(String message,UserDto user,String jwtToken) {
}
