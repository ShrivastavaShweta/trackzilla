package com.pluralsight.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TzaController {

    @GetMapping("/applications")
    public String retrieveApplication(Model model){
        model.addAttribute("applications", applicationService.listApplications());
        return "applications";
    }
}
