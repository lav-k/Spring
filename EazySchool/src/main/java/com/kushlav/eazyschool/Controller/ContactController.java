package com.kushlav.eazyschool.Controller;

import com.kushlav.eazyschool.Model.Contact;
import com.kushlav.eazyschool.service.ContactService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class ContactController {
    private static final Logger logger = LoggerFactory.getLogger(ContactController.class);

    private ContactService contactService;

    @Autowired
    public void ContactService(ContactService contactService){
        this.contactService = contactService;
    }

    @RequestMapping(value={"/contact"})
    public String displayHomePage(Model model){
        return "contact.html";
    }

//    @RequestMapping(value = "/saveMsg", method=POST)
//    public ModelAndView saveMessage(@RequestParam String name, @RequestParam String mobileNum, @RequestParam String email, @RequestParam String subject, @RequestParam String message){
//        logger.info("Name: {}", name);
//        logger.info("Mobile num: {} ", mobileNum);
//        logger.info("Mobile num: {} ", mobileNum);
//        logger.info("Mobile num: {} ", mobileNum);
//        logger.info("Mobile num: {} ", mobileNum);
//        return new ModelAndView("redirect:/contact");
//    }

    @PostMapping(value = "/saveMsg")
    public ModelAndView saveMessage(Contact contact){
        contactService.saveMessageDetails(contact);
        return new ModelAndView("redirect:/contact");
    }
}
