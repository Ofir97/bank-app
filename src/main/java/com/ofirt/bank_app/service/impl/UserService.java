package com.ofirt.bank_app.service.impl;

import com.ofirt.bank_app.dto.BankResponse;
import com.ofirt.bank_app.dto.CreditDebitRequest;
import com.ofirt.bank_app.dto.EnquiryRequest;
import com.ofirt.bank_app.dto.UserRequest;

public interface UserService {

    BankResponse createAccount(UserRequest userRequest);

    BankResponse balanceInquiry(EnquiryRequest enquiryRequest);

    String nameEnquiry(EnquiryRequest enquiryRequest);

    BankResponse creditAccount(CreditDebitRequest creditDebitRequest);

    BankResponse debitAccount(CreditDebitRequest creditDebitRequest);
}
