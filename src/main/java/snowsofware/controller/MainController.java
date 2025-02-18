package snowsofware.controller;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.*;
import snowsofware.entity.Cat;


@RestController
public class MainController {
    private final ObjectMapper objectMapper;

    public MainController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @GetMapping("/api/main")
    public String MainListener(){
        return "Hello World";
    }
    @GetMapping("/api/cat")
    public String GiveCat() {
        Cat cat = new Cat("Барсик", 5, 10);
        String jasonData = null;
        try {
            jasonData = objectMapper.writeValueAsString(cat);
        } catch (JsonProcessingException e) {
            System.out.println("Ошибка");

        }
        return jasonData;
    }
    @PostMapping("/api/special-cat")
    public String GiveSpecialCat(@RequestParam String name ) {
        Cat cat = new Cat(name,5, 10);
        String jasonData = null;
        try {
            jasonData = objectMapper.writeValueAsString(cat);
        } catch (JsonProcessingException e) {
            System.out.println("Ошибка");

        }
        return jasonData;
    }
}
