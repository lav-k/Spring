package com.kushlav.eazyschool.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

//    In Spring MVC / Spring Boot, the Model interface is used in a controller to pass data from the controller to the view Thymeleaf.
    @RequestMapping(value={"","/","/home"})
    public String displayHomePage(Model model){
//        model.addAttribute("username", "kush");
        return "home.html";
    }
}
