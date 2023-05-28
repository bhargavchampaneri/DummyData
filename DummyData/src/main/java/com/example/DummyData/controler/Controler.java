package com.example.DummyData.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.DummyData.datagenerattor.DummyGPSDevice;


@RestController
public class Controler {

    @GetMapping("/data")
    public String sendData() {
        DummyGPSDevice data = new DummyGPSDevice();
        return data.getData();
    }
}
