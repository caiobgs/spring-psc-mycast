package com.mycast.mycastspring.controler;

import com.mycast.mycastspring.model.MyEmail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Mailcontroller
 */
@RestController
public class EmailResource {

    @Autowired 
    private JavaMailSender mailSender;

	@PostMapping(path="/emailcontact")
	public @ResponseBody void updateFavorite(@RequestBody MyEmail email) {

		SimpleMailMessage smm = new SimpleMailMessage();
        smm.setText(email.getBody());
        smm.setSubject(email.getSubject());
        smm.setFrom(email.getFrom());
        smm.setTo(email.getTo());
        
        try{
            mailSender.send(smm);
        } catch (Exception e) {
            e.printStackTrace();
        }
		
	}	    
    
}