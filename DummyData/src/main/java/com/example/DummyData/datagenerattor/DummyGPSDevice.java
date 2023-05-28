package com.example.DummyData.datagenerattor;

import java.util.Random;
import org.json.JSONObject;

public class DummyGPSDevice {
    private double latitude;
    private double longitude;
    private long timestamp;

    public DummyGPSDevice() {
        Random random = new Random();
        latitude = random.nextDouble() * (90 - (-90)) + (-90);
        longitude = random.nextDouble() * (180 - (-180)) + (-180);
        timestamp = System.currentTimeMillis();
    }

    public String getData() {
        JSONObject obj = new JSONObject();
        obj.put("vehicle_id", 1);
        obj.put("latitude", latitude);
        obj.put("longitude", longitude);
        obj.put("data_recieve_time", timestamp);
        return obj.toString();
    }
}
