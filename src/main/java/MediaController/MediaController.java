package MediaController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MediaController {

    @GetMapping("/")
        public String index(){

        return "Hello";

    }
}
