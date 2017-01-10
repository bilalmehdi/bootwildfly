package bootwildfly;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class HelloWildFlyController {

    private static final Logger log = LoggerFactory.getLogger(HelloWildFlyController.class);

    @RequestMapping("hello")
    public String sayHello(){
        log.info("Hello API Invoked");
        return ("Hello, SpringBoot on Wildfly");
    }

    @RequestMapping("GetDateTime")
    public String getDateTime(){
        log.info("GetDateTime Invoked");
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        return (dateFormat.format(date)); //2016/11/16 12:08:43

    }


    @RequestMapping("killSwitch")
    public void killSwitch()
    {
        log.info("Kill Switch Invoked");
        System.exit(0);
    }
}