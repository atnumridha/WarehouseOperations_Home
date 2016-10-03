package com.anup.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by atnum on 27-09-2016.
 */
@Controller
public class UserInterfaceController {

    @RequestMapping("/UserInterface")
    public String Menu() {
        return "UserInterface";
    }

}
