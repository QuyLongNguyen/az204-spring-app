package org.example.az204;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class Az204Application {

    @Value("${spring.application.name}")
    private String applicationName;

    public static void main(String[] args) {
        SpringApplication.run(Az204Application.class, args);
    }

    @GetMapping
    public String homepage(Model model){
        model.addAttribute("applicationName", applicationName);
        return "homepage";
    }

}
