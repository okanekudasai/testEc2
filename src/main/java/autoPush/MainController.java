package autoPush;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class MainController {

    @GetMapping("gogo")
    String gogo() {
        System.out.println("ffff");
        return "gogogogo";
    }
}
