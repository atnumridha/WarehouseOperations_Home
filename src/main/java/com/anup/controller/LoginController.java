package com.anup.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by atnum on 27-09-2016.
 */
@Controller
public class LoginController {

    @RequestMapping("/")
        public String login(@RequestParam(value = "error",required = false)String error,

                            @RequestParam (value = "logout", required = false)String logout,Model model
        )
        {
            if(error!=null){
                model.addAttribute("error","Invalid Username and Password!");
            }

            if(logout!=null){
                model.addAttribute("msg","You are been logged out Successfully!");
            }

            return "login";
        }

    @RequestMapping("/Registration")
    public String Register(){
        return "Registration";
    }
    }

