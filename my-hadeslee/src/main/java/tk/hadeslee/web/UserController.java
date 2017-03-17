package tk.hadeslee.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

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
    @PostMapping("/create")
    public String create(User user) {
        System.out.println("User : " + user);
        return "index";
    }
}
