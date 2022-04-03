package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class EvalBeanController {

    @RequestMapping("/itsecurityco")
    public void itsecurityco(EvalBean evalBean, Model model) {
        System.out.println("=========================");
        System.out.println("[+] RequestMapping index");
        System.out.println(evalBean);
        System.out.println("=========================");
    }
}
