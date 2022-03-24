package com.example.freemoneynoscam.services;

public class ValidateEmailService {

    public boolean validateEmail(String email) {
        //TODO implement logic such that we verify an e-mail is valid

        if (email.contains("@") && email.contains(".")){
            System.out.println("E-mail: '" + email + "' was added successfully!");
            return true;

        }else {
            System.out.println("E-mail failed to add..");
            return false;
        }
    }
}






