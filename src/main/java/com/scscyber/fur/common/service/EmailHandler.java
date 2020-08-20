package com.scscyber.fur.common.service;

import com.scscyber.fur.common.service.Interface.IEmailHandler;
import com.scscyber.fur.model.dto.EmailRequestDto;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Service
public class EmailHandler implements IEmailHandler {
    public final JavaMailSender emailSender;

    public EmailHandler(JavaMailSender emailSender) {
        this.emailSender = emailSender;
    }

    public boolean SendEmail(EmailRequestDto request) {
        try {
            MimeMessage message = emailSender.createMimeMessage();

            MimeMessageHelper helper = new MimeMessageHelper(message, true, "utf-8");

            message.setContent(request.getText(), "text/html");

            helper.setTo(request.getMailTo());

            helper.setSubject(request.getSubject());


            this.emailSender.send(message);
        } catch (MessagingException ex) {
            return false;
        }
        return true;
    }
}
