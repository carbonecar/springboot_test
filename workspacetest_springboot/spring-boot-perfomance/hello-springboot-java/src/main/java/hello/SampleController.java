package hello;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class SampleController {

    private int count=0;
    @RequestMapping("/")
    @ResponseBody
    String home() {
        count++;
        if( count %2 ==0){
            while (true){

            }
        }
        return "Hello World! "+count;
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}
