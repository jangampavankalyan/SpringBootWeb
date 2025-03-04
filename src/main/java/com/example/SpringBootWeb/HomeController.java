package com.example.SpringBootWeb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "index";
    }

    @RequestMapping("/add")
    public String add(@RequestParam int num1, @RequestParam int num2, Model model){
        
        int result = num1 + num2;
        
        model.addAttribute("result",result);
        
        return "result";
    }
}
