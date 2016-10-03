package com.anup.controller;

import com.anup.dao.ApptDao;
import com.anup.model.Appt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by atnum on 02-10-2016.
 */
@Controller
public class MenuController {


    @Autowired
    private ApptDao apptDao;

    @RequestMapping("/apptList")
    public String getProducts(Model model) {

        List<Appt> appt = apptDao.getAllAppt();
        model.addAttribute("appt", appt);

        return "apptList";
    }

    @RequestMapping("/apptList/viewAppt/{appt_nbr}")
    public String viewAppt(@PathVariable int appt_nbr, Model model) throws IOException {
        Appt appt = apptDao.getApptById(appt_nbr);
        model.addAttribute(appt);

        return "viewAppt";
    }

    @RequestMapping("/apptList/editAppt/{id}")
    public String editProduct(@PathVariable("id") int id,Model model){
        Appt appt = apptDao.getApptById(id);

        model.addAttribute(appt);

        return "editAppt";
    }

    @RequestMapping(value = "/apptList/editAppt", method = RequestMethod.POST)
    public String editProduct(@Valid @ModelAttribute("appt") Appt appt)
    {
        apptDao.editAppt(appt);

        return "redirect:/apptList";
    }

    @RequestMapping("/addAppt")
    public String addAppt(Model model) {
        Appt appt = new Appt();
        model.addAttribute("appt", appt);
        return "addAppt";
    }

    @RequestMapping(value ="/addAppt",method = RequestMethod.POST)
    public String addApptPost(@Valid @ModelAttribute("appt")Appt appt, BindingResult result)
    {
        if(result.hasErrors()){
            return "addAppt";
        }

        apptDao.addAppt(appt);

        return "redirect:/apptList";
    }
}
