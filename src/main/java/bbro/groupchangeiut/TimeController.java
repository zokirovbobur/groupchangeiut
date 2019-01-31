package bbro.groupchangeiut;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class TimeController {


    @GetMapping("time")
    public String res() throws UnknownHostException {
        final String uri = "http://mkreq.herokuapp.com";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);

        System.out.println(result);
        return InetAddress.getLocalHost().getHostName().toString()+"-- got request!";
    }

}
