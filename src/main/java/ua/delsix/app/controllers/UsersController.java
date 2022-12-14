package ua.delsix.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ua.delsix.app.models.User;

import javax.validation.Valid;

@Controller
public class UsersController {

    @GetMapping("/signup")
    public String newUser() {
        return "forums/new";
    }

    @PostMapping
    public String registration(@ModelAttribute @Valid User user, BindingResult bindingResult) {
        return null;
    }
}
