package overone.project.demo.controller;

import overone.project.demo.model.User;
import overone.project.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthController {

    private final UserService userService;

    @Autowired
    public AuthController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/add_user")
    public String getRegistrPage(Model model){
        model.addAttribute("user", new User());
        return "registration";
    }

    @PostMapping("/add_user")
    public String saveUser(@ModelAttribute(name = "user") User user){
        userService.saveUser(user);
        return "redirect:/";
    }
}
