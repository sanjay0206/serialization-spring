package com.techprimers.serializationexample.controller;

import com.techprimers.serializationexample.model.User;
import com.techprimers.serializationexample.service.SerializedService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/serialize")
public class SerializationResource {

    private SerializedService serializedService;

    public SerializationResource(SerializedService serializedService) {
        this.serializedService = serializedService;
    }

    @PostMapping
    public String post(@RequestBody final User user) {

        serializedService.persist(user);

        return "User data saved..!";
    }

}
