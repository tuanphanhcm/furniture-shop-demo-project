package com.scscyber.fur.common.function;

import com.scscyber.fur.common.function.Interface.IEmailHandler;
import com.scscyber.fur.common.function.Interface.IEmailService;
import org.springframework.stereotype.Service;

@Service
public class EmailService implements IEmailService {
    private final IEmailHandler emailHandler;

    public EmailService(IEmailHandler emailHandler) {
        this.emailHandler = emailHandler;
    }
}
