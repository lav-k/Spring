package com.kushlav.eazyschool.service;


import com.kushlav.eazyschool.Model.Contact;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
    private static final Logger logger = LoggerFactory.getLogger(ContactService.class);

    public boolean saveMessageDetails(Contact contact){
        boolean isSaved = true;
//        TODO - NEED TO PERSIST THE DATA INTO DB
        logger.info(contact.toString());
        return isSaved;
    }
}
