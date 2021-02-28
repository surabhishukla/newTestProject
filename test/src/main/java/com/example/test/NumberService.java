package com.example.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Here in Service class, define business logic.
 * defined Synchronized method from which one thread run at a time
 *
 * @author  Surabhi Shukla
 * @version 2.1.5
 * @since   2020-02-28
 */


@Service
public class NumberService {

    @Autowired
    private NumberImpl numberDao;

    /**
     Synchronized method block used for multiple thread. run only one thread at a time.
     */
    synchronized void increaseCount(){
        /**
         call method from Dao class
         */
        numberDao.countNumber();
    }
}
