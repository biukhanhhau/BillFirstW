package org.biukhanhhau.webapplyjob;

import org.biukhanhhau.webapplyjob.service.InforService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;

@Controller
public class HomeController {

    @Autowired
    InforService inforService;

    @RequestMapping("/")
    public String homepage(){
        return "index.html";
    }

    @RequestMapping("index")
    public String index(){return "index.html";}

    @RequestMapping("apply")
    public String apply(){
        return "apply.html";
    }

    @RequestMapping("acceptInformation")
    public String accept(Information information){
        inforService.addInformation(information);
        return "thankyou.html";
    }

    @RequestMapping("contact")
    public String contact(){
        return "contact.html";
    }

}
