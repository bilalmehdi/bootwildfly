package bootwildfly;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWildFlyController {

    private static final Logger log = LoggerFactory.getLogger(HelloWildFlyController.class);

    @RequestMapping("hello")
    public String sayHello(){
        log.info("Hello API Invoked");
        return ("Hello, SpringBoot on Wildfly");
    }

    @RequestMapping("killSwitch")
    public void killSwitch()
    {
        log.info("Kill Switch Invoked");
        System.exit(0);
    }
}