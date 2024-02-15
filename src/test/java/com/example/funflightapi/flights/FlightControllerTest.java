package com.example.funflightapi.flights;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class FlightControllerTest {

    @InjectMocks
    FlightService flightService;


    @BeforeEach
    void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testIfFlightDetailsEqualToOk(){
        String responseOK = flightService.getFlightDetails();
        Assertions.assertEquals("OK", responseOK);
    }
}
