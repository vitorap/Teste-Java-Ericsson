package ap.vitor.testeEricsson.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class IndexController {

    //Get é para ler
    @GetMapping
    public String get(){
        return "Get Spring Boot";
    }

    //Post é para criar
    @PostMapping
    public String post(){
        return "Post Spring Boot";
    }

    //Put é para atualizar
    @PutMapping
    public String put(){
        return "Put Spring Boot";
    }


    //Delete é para apagar
    @DeleteMapping
    public String delete(){
        return "Delete Spring Boot";
    }
}