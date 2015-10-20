package com.couchbase.mbds.controller;

import com.couchbase.client.java.Bucket;
import com.couchbase.client.java.document.json.JsonObject;
import com.couchbase.mbds.service.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by marwen on 20/10/15.
 */

@RestController
@RequestMapping
public class UserController {

    private final Bucket bucket;

    @Autowired
    public UserController(Bucket bucket) {
        this.bucket = bucket;
    }

    @RequestMapping(value="/login", method= RequestMethod.GET)
    public Object login(@RequestParam String user, @RequestParam String password) {
        return User.login(bucket, user, password);
    }

    @RequestMapping(value="/login", method=RequestMethod.POST)
    public Object createLogin(@RequestBody String json) {
        JsonObject jsonData = JsonObject.fromJson(json);
        return User.createLogin(bucket, jsonData.getString("user"), jsonData.getString("password"));
    }

    @RequestMapping(value="/flights", method=RequestMethod.POST)
    public Object book(@RequestBody String json) {
        JsonObject jsonData = JsonObject.fromJson(json);
        return User.registerFlightForUser(bucket, jsonData.getString("username"), jsonData.getArray("flights"));
    }

    @RequestMapping(value="/flights", method=RequestMethod.GET)
    public Object booked(@RequestParam String username) {
        return User.getFlightsForUser(bucket, username);
    }

}
