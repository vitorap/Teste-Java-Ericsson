package ap.vitor.testeEricsson.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String hello(){
        return "É assim que eu começo meu teste, como tudo, com um famoso hello world!!!";
    }

    @GetMapping("/teste")
    public String teste(){
        return "Hello World em outro endereço";
    }
}