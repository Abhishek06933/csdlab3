package com.example.lab3_pc2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloApplicationTest {

    private double actual;

    @Test
    void calculatesalary() {


        HelloApplication x= new HelloApplication();
        assertEquals(x.calculatesalary(4000),48000);
    }
}