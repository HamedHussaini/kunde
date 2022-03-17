package oslomet.webpro.kunde;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class kundeController {
    @GetMapping("/")
    public String hei(String navn){
        return "hei verden "+navn;
    }
}
