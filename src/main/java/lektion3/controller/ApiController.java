package lektion3.controller;

import lektion3.model.DogModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ApiController {

    private final RestTemplate restTemplate;


    public ApiController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/dog")
    public DogModel getRandomDog() {
        String url = "https://dog.ceo/api/breeds/image/random";


        DogModel dogModel = restTemplate.getForObject(url, DogModel.class);


        return dogModel;
    }
}
