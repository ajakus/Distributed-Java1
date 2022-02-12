package edu.wctc.springboot3step;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class StepController {
    @RequestMapping("/")
    public String showHomePage(Model model) {
        model.addAttribute("pageTitle", "3StepController");
        return "index";

    }
    @RequestMapping("/page1")
    public String showPage1(Model model1) {
        model1.addAttribute("pageTitle", "3StepController");
        return "page1";

    }
    @RequestMapping("/page2")
    public String showPage2(Model model2) {
        model2.addAttribute("pageTitle", "3StepController");
        return "page2";

    }
    @RequestMapping("/page3")
    public String showPage3(Model model3) {
        model3.addAttribute("pageTitle", "3StepController");
        return "page3";


    }

}
