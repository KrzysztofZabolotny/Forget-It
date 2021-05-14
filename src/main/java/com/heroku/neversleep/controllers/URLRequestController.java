/**
 * Created by Krzysztof Zabolotny, https://github.com/KrzysztofZabolotny
 */
package com.heroku.neversleep.controllers;

import com.heroku.neversleep.utilities.URLRecorder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class URLRequestController {

    @PostMapping("/registerURL")
    void testController(@RequestBody String url) throws Exception{
        URLRecorder urlRecorder = new URLRecorder();
        urlRecorder.saveURL(url);
        //check url if correct
        //check if exists
        //ping it
    }

}
