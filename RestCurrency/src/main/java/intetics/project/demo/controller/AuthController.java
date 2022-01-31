package intetics.project.demo.controller;

import intetics.project.demo.model.User;
import intetics.project.demo.service.UserService;
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
    public String getSuccesPage(Model model){
        model.addAttribute("user", new User());
        return "success";
    }

    @PostMapping("/add_user")
    public String saveUser(@ModelAttribute(name = "user") User user){
        userService.saveUser(user);
        return "redirect:/";
    }
}
