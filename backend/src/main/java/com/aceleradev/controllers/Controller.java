package com.aceleradev.controllers;

import com.aceleradev.dtos.Usuario;
import com.aceleradev.services.LoginService;
import com.aceleradev.services.impl.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class Controller {

    @Autowired
    LoginServiceImpl loginService;

    @PostMapping(value="/registra-usuario")
    public ResponseEntity<Usuario> cadastraUsuario(@RequestBody Usuario usuario){
        Usuario usuario1 = loginService.registra(usuario);

        return ResponseEntity.ok(usuario1);
    }
}
