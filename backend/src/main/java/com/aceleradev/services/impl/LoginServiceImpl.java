package com.aceleradev.services.impl;

import com.aceleradev.dtos.Usuario;
import com.aceleradev.services.LoginService;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class LoginServiceImpl implements LoginService {
    @Override
    public Usuario registra(Usuario usuario) {
        if (Objects.isNull(usuario.getNome())){
            throw new RuntimeException("Nome do usuário é nullo");
        }

        return usuario;
    }
}
