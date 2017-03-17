package tk.hadeslee.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import tk.hadeslee.domain.User;
import tk.hadeslee.domain.UserRepository;

import java.util.ArrayList;
import java.util.List;

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
public class UserController {
    private List<User> users = new ArrayList<>();

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/create")
    public String create(User user) {
        System.out.println("User : " + user);
        userRepository.save(user);
        return "redirect:/list";
    }

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("users", userRepository.findAll());
        return "list";
    }

}

