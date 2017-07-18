package nz.bitcloud.devMeeting.services;

import nz.bitcloud.devMeeting.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserService {

    private static final String template = "Hello, %s!";

    @RequestMapping("/greeting")
    public User greeting(@RequestParam(value="name", defaultValue="World") String name) {

        return new User(name);
    }
}