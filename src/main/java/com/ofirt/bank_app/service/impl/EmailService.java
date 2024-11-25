package com.ofirt.bank_app.service.impl;

import com.ofirt.bank_app.dto.EmailDetails;

public interface EmailService {

    void sendEmailAlert(EmailDetails emailDetails);
}
