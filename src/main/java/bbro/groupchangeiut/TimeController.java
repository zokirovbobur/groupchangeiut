package bbro.groupchangeiut;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("time")
public class TimeController {

    @GetMapping("start")
    public String start(){
        final String uri = "http://mkreq.herokuapp.com/connect";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);

        System.out.println(result);
        return "started";
    }
    @GetMapping("res")
    public void res(){
        final String uri = "http://mkreq.herokuapp.com/res";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);

        System.out.println(result);
    }

}
