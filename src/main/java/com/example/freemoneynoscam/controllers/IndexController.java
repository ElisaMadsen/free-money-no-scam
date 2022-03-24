package com.example.freemoneynoscam.controllers;
import com.example.freemoneynoscam.repositories.EmailRepository;
import com.example.freemoneynoscam.services.ValidateEmailService;
import com.example.freemoneynoscam.services.DatabaseConnect;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

import java.sql.SQLException;


@Controller
public class IndexController {
    ValidateEmailService service = new ValidateEmailService();

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/emailregistered")
    public String emailregistered(WebRequest dataFromForm) {
        DatabaseConnect.connectDB();
        String email = dataFromForm.getParameter("email");
        service.validateEmail(email);
        DatabaseConnect.insertEmail(email);
        if (service.validateEmail(email) == true) {
            return "emailregistered";
        } else {
            return "emailnotregistered";
        }
    }
/*
    @GetMapping("/emailfetch")
    public String emailFetch(Model dataToView) throws SQLException {
        String emailFetch = EmailRepository.fetchSingleEmail();
        DatabaseConnect.connectDB();
        EmailRepository.connectToDB();

        dataToView.addAttribute("emailpost", emailFetch);
        return "emailfetch";
    }

 */
}