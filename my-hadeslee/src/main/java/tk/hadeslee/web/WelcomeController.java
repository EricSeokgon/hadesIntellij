package tk.hadeslee.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Project: hadesIntellij
 * FileName: WelcomeController
 * Date: 2017-03-15
 * Time: 오후 5:21
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class WelcomeController {
    @GetMapping("/helloworld")
    public String welcome(String name, int age, Model model) {
        System.out.println("name : " + name + ", age :" + age);
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        return "welcome";
    }
}
