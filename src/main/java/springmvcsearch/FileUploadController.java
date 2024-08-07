package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileOutputStream;

@Controller
public class FileUploadController {
    @RequestMapping("/fileform")
    public String showUploadForm(){
        String str = null;
        System.out.println(str.length());
        return "fileform";
    }

    @RequestMapping(path = "/uploadimage", method = RequestMethod.POST)
    public String fileUpload(@RequestParam("profile")CommonsMultipartFile file, HttpSession session, Model m){
        System.out.println(file.getName());
        System.out.println(file.getContentType());
        System.out.println(file.getOriginalFilename());
        System.out.println(file.getStorageDescription());
        System.out.println(file.getSize());
        byte[] data = file.getBytes();
        String path = session.getServletContext().getRealPath("/") + "WEB-INF" + File.separator + "resources" + File.separator + "images" + File.separator + file.getOriginalFilename();
        System.out.println(path);
        try{
            FileOutputStream stream = new FileOutputStream(path);
            stream.write(data);
            stream.close();
            System.out.println("File Uploaded");
            m.addAttribute("msg", "File uploaded successfully.");
            m.addAttribute("filename", file.getOriginalFilename());
        }
        catch (Exception ex){
            ex.getStackTrace();
            System.out.println(ex.getMessage());
            m.addAttribute("msg", "Something went wrong!");
        }
        return "filesuccess";
    }
}
