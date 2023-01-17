package com.emanuel.cab.controller;

import com.emanuel.cab.customer.Customer;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Controller
public class WebController implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/congratulation").setViewName("congratulation");
    }

    @GetMapping("/signUpForm")
    public String showSignUpForm(Customer customer) {
        return "sign_up_form";
    }

    @GetMapping("/loginForm")
    public String showLoginForm(Customer customer) {
        return "login_form";
    }

    @PostMapping("/")
    public String checkCustomerInfo(@Valid Customer customer, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "sign_up_form";
        }
        return "redirect:/congratulation";
    }
}
