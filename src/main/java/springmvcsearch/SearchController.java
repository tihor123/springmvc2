package springmvcsearch;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
    @RequestMapping("user/{userId}/{userName}")
    public String getUser(@PathVariable("userId") int id, @PathVariable("userName") String name) {
        System.out.println(id);
        System.out.println(name);
        Integer.parseInt(name);
        return "home";
    }

    @RequestMapping("/home")
    public String home() {
        String str = null;
        System.out.println(str.length());
        return "home";
    }

    @RequestMapping("/search")
    public RedirectView search(@RequestParam("query") String query) {
        String url = "https://www.google.com/search?q=" + query;
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl(url);
        return redirectView;
    }

    //    @ExceptionHandler({NumberFormatException.class, NullPointerException.class})
//    public String handleException(){
//        return "null_page";
//    }
//    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
//    @ExceptionHandler(NullPointerException.class)
//    public String exceptionHandlerNull(Model m) {
//        m.addAttribute("msg", "Null pointer exception has occurred");
//        return "null_page";
//    }
//
//    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
//    @ExceptionHandler(NumberFormatException.class)
//    public String exceptionHandlerNumberFormat(Model m) {
//        m.addAttribute("msg", "Number format exception has occurred");
//        return "null_page";
//    }
}
