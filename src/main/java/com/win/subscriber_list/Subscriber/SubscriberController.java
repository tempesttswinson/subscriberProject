package com.win.subscriber_list.Subscriber;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//designates class as a Controller
@Controller
public class SubscriberController {

    // tells our applicatioin whattemplate to return at a specific URL
    @GetMapping
    public String index(Subscriber subscriber) {
        return "subscriber/index";
    }
}