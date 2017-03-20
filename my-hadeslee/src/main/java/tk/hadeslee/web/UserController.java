package tk.hadeslee.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tk.hadeslee.domain.User;
import tk.hadeslee.domain.UserRepository;

/**
 * Project: hadesIntellij
 * FileName: UserController
 * Date: 2017-03-17
 * Time: 오후 3:11
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/loginForm")
    public  String loginForm() {
        return "/user/login";
    }

    @GetMapping("/form")
    public  String form() {
        return "/user/form";
    }

    @PostMapping("")
    public String create(User user) {
        System.out.println("User : " + user);
        userRepository.save(user);
        return "redirect:/users";
    }

    @GetMapping("")
    public String list(Model model) {
        model.addAttribute("users", userRepository.findAll());
        return "/users/list";
    }



}

