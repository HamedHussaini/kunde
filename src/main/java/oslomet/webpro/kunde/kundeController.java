package oslomet.webpro.kunde;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController

public class kundeController {
    private final List<Kunde> alleKunder = new ArrayList<>();
    @PostMapping("/lagre")
    public void lagreKunder(Kunde innKunde){
        alleKunder.add(innKunde);
    }
    @GetMapping("/hentAlle")
    public List<Kunde> henteAlle(){
        return alleKunder;
    }
    @GetMapping("/hentBiler1")
    public List<Bil> hentBiler1(){
        List<Bil> listBiler = new ArrayList<>();
        listBiler.add(new Bil("Audi", "A4"));
        listBiler.add(new Bil("Volvo", "C4"));
        listBiler.add(new Bil("Audi", "A8"));
        return listBiler;

    }


    @GetMapping("/slettAlle")
    public void slettAlle(){
        alleKunder.clear();
    }

}
