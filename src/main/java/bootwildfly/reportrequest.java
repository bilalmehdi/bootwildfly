package bootwildfly;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class reportrequest {
	
    @RequestMapping("request")
    public request getRequest(){
        return new request (1,"Test Request");
    }

}
