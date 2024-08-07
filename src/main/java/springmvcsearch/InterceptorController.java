package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InterceptorController {

    @RequestMapping("/sweet_home")
    public String home(){
        return "sweet_home";
    }

    @RequestMapping("/welcome")
    public String welocome(@RequestParam("name") String name, Model m){
        System.out.println("This is welcome page");
        m.addAttribute("name", name);
        return "welcome";
    }
}
