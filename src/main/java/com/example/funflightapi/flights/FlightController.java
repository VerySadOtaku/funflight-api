package com.example.funflightapi.flights;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlightController {

    @GetMapping("/getFlightDetails")
    public String getFlightDetails() {
        return "OK";
    }


}
