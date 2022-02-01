package overone.project.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/auth")
public class RestCurrencyController {

    @RequestMapping("/hello")
    public String hello() {
        return "index.html";

    }

    @GetMapping(value = "/getcurrency")
    public String getCurrency() {
        String uri = "https://currencylayer.com/";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        return result;
    }

}
