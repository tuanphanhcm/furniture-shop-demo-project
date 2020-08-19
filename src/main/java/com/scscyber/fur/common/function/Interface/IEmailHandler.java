package com.scscyber.fur.common.function.Interface;

import com.scscyber.fur.model.dto.EmailRequestDto;

public interface IEmailHandler {
    boolean SendEmail(EmailRequestDto request);
}
