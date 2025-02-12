package springmvcsearch;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyExceptionHandler {
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(NullPointerException.class)
    public String exceptionHandlerNull(Model m) {
        m.addAttribute("msg", "Null pointer exception has occurred");
        return "null_page";
    }

    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(NumberFormatException.class)
    public String exceptionHandlerNumberFormat(Model m) {
        m.addAttribute("msg", "Number format exception has occurred");
        return "null_page";
    }

    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(value = Exception.class)
    public String exceptionHandlerGeneric(Model m){
        m.addAttribute("msg", "Exception has occurred");
        return "null_page";
    }
}
