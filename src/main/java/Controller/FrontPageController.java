package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontPageController {

    @GetMapping("/")
        public String index(){

        return "Hello";

    }

    @GetMapping("/NoToFoodWaste")
        public String frontPage(){

        return "front-page.html";
    }


}