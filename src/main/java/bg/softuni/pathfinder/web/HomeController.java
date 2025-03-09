package bg.softuni.pathfinder.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Random;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model){
        double sofiaTemp = new Random().nextDouble();
        model.addAttribute("sofiaTemperature", sofiaTemp);


//        ModelAndView mnv = new ModelAndView();
//        mnv.addObject("sofiaTemperature", sofiaTemp);
//        mnv.setViewName("index");
        //return mnv;

        return "index";
    }

}
