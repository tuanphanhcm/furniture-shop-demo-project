package com.scscyber.fur.common.service.Interface;

import com.scscyber.fur.model.dto.EmailRequestDto;

public interface IEmailHandler {
    boolean SendEmail(EmailRequestDto request);
}
