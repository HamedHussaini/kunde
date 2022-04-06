package oslomet.webpro.kunde;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController

public class kundeController {
    private final List<Kunde> alleKunder = new ArrayList<>();
    @GetMapping("/lagre")
    public void lagreKunder(Kunde innKunde){
        alleKunder.add(innKunde);
    }
    @GetMapping("/hentAlle")
    public List<Kunde> henteAlle(){
        return alleKunder;
    }

}
