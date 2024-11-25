package com.ofirt.bank_app.controller;

import com.ofirt.bank_app.dto.BankResponse;
import com.ofirt.bank_app.dto.CreditDebitRequest;
import com.ofirt.bank_app.dto.EnquiryRequest;
import com.ofirt.bank_app.dto.UserRequest;
import com.ofirt.bank_app.service.impl.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public BankResponse createAccount(@Valid @RequestBody UserRequest userRequest) {
        return userService.createAccount(userRequest);
    }

    @PostMapping("/balanceEnquiry")
    public BankResponse balanceEnquiry(@Valid @RequestBody EnquiryRequest enquiryRequest) {
        return userService.balanceInquiry(enquiryRequest);
    }

    @PostMapping("/nameEnquiry")
    public String nameEnquiry(@Valid @RequestBody EnquiryRequest enquiryRequest) {
        return userService.nameEnquiry(enquiryRequest);
    }

    @PostMapping("/credit")
    public BankResponse creditAccount(@RequestBody CreditDebitRequest creditDebitRequest) {
        return userService.creditAccount(creditDebitRequest);
    }

    @PostMapping("/debit")
    public BankResponse debitAccount(@RequestBody CreditDebitRequest creditDebitRequest) {
        return userService.debitAccount(creditDebitRequest);
    }
}
