
package hello;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@Controller
@EnableAutoConfiguration
public class SampleController {

    private int count=0;
    
    
    @RequestMapping("/response_even_request")
    @ResponseBody
    public String responseEventRequest() throws InterruptedException {
        count++;
        if( count %2 ==0){
            Thread.sleep(3600);
        }
        return "Hello only in even count: "+count+"\n";
    }

    
    @RequestMapping("/response_all_request")
    @ResponseBody
    public String responseAllRequest(){
    	return "I Always say's Hello\n";
    }
    
}
