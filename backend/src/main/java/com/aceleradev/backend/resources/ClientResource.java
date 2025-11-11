package com.aceleradev.backend.resources;

import com.aceleradev.backend.entities.Client;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

    @GetMapping
    public ResponseEntity<Client> findAll(){

        Client pc = new Client(1L, "Pc The One", "12982228898", "pctheone@email.com", "00000000001", "O melhorzin que tá tendo",new Date());
        return ResponseEntity.ok().body(pc);
    }
}
