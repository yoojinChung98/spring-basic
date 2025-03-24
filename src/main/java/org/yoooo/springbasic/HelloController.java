package org.yoooo.springbasic;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model) {
        // attributeName -> ${} 에 들어가는 변수명, attributeValue -> 변수값
        model.addAttribute("data", "spring!!");
        return "hello";
    }
}
