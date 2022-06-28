package com.Prograd.RestApiWithAjax.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class AjaxController {
    @GetMapping("/call/{firstname}/{lastname}")
    public String display(@PathVariable("firstname") String firstname, @PathVariable("lastname") String lastname){
        return "Firstname = "+firstname+"\nLastname = "+lastname;
    }
}
