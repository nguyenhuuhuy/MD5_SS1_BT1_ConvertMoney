package demo.bt1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertMoneyController {
    @GetMapping("/convert")
    public String convert(@RequestParam double money, Model model){
        double convertVND = money * 22000;
        model.addAttribute("result",convertVND);
        return "convert";
    }
}
