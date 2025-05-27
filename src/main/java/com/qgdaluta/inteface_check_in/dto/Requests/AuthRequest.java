package com.qgdaluta.inteface_check_in.dto.Requests;

import lombok.Data;

@Data
public class AuthRequest {
    private String email;
    private String senha;
}
