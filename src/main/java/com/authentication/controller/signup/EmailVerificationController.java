package com.authentication.controller.signup;

import com.authentication.exception.signup.TokenDoesNotExistException;
import com.authentication.exception.signup.TokenExpiredException;
import com.authentication.exception.signup.UserAlreadyValidated;
import com.authentication.model.signup.Signuser;
import com.authentication.service.signup.EmailSendService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping( value = "/auth")
@AllArgsConstructor
public class EmailVerificationController {

    private EmailSendService emailSendService;

    @GetMapping( value = "/emailVerification/token={token}")
    public @ResponseBody String fun(@PathVariable("token") String token ) throws TokenDoesNotExistException, UserAlreadyValidated, TokenExpiredException {

        // using token get the user if exist
        Signuser user = emailSendService.getUserByToken(token);

        return "Hi Lord....Your Account Activated";
    }
}
