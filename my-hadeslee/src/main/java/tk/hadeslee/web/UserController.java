package tk.hadeslee.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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

    @PostMapping("/create")
    public String create(User user) {
        System.out.println("User : " + user);
        users.add(user);
        return "index";
    }

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("users", users);
        return "list";
    }

}

