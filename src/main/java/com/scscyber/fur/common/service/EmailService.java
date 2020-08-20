package com.scscyber.fur.common.service;

import com.scscyber.fur.common.service.Interface.IEmailHandler;
import com.scscyber.fur.common.service.Interface.IEmailService;
import com.scscyber.fur.model.dto.EmailRequestDto;
import org.springframework.stereotype.Service;

@Service
public class EmailService implements IEmailService {
    private final IEmailHandler emailHandler;

    public EmailService(IEmailHandler emailHandler) {
        this.emailHandler = emailHandler;
    }


    @Override
    public boolean SendEmailRegisterUser(String email, String password) {
        EmailRequestDto requestDto = new EmailRequestDto();
        requestDto.setMailTo(email);
        requestDto.setSubject("Xác nhận đăng ký thành công");

        String text = String.format("Bạn có thể đăng nhập với Email: %s, và Mật khẩu: %s", email, password);
        requestDto.setText(text);
        return emailHandler.SendEmail(requestDto);
    }
}
