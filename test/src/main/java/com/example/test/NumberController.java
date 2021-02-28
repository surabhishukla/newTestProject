package com.example.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Here in Controller class, we set the api path for hitting the api on server
 *
 * @author  Surabhi Shukla
 * @version 2.1.5
 * @since   2020-02-28
 */

@RestController
@RequestMapping(value = "/counts")
public class NumberController {

    @Autowired
    private NumberService number;

    /**
     * create GET api. when someone hit this api count will be increased by 1 in database
     */
    @RequestMapping(method = RequestMethod.GET)
    public void createPosts() {
        /**
         * call method from service class
         */
        number.increaseCount();
    }
}
