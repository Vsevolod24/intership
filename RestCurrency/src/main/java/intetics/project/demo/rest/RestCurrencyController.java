package intetics.project.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestCurrencyController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello";

    }

    @GetMapping(value = "/getcurrency")
    public String getCurrency(){
        String uri = "http://localhost:8088/hello";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        return result;
    }

    @GetMapping(value = "/currency")
    public String getRealCurrency(){
        String uri = "https://currencylayer.com/";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        return result;

    }
}
