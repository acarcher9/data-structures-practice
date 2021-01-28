package com.tts;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

//2) Create a hashMap of vehicles
//    Model of car = key
//    Make of car = value
//    Ask "customer" what model (key) they want, use hashMap to determine if you have it, and if so, what make (value) it is.

public class hashMap {
    public static void main(String[] args) {
        HashMap<String, String> carMap = new HashMap<>();
        carMap.put("Model", "Make");
        carMap.put("GTI", "Volkswagen");
        carMap.put("Pilot", "Honda");
        carMap.put("Camry", "Toyota");
        carMap.put("TT", "Audi");
        carMap.put("Cherokee", "Jeep");
        carMap.put("Sol", "Kia");

///  for loop to cycle though my collection
        for (Map.Entry<String, String> entry : carMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ", " + value);
        }

//  Scanner to take user input, do while loop too check responses. *User must enter "model" not make.
    Scanner customerRequest = new Scanner(System.in);
    System.out.println("Welcome in! What kind of car are you looking for today?");
    String model = customerRequest.next();
    boolean isWorking = true;
    while (isWorking){
        if(carMap.containsKey(model)) {
            String make = carMap.get(model);
            System.out.println("Wonderful, I can point you to our collection of styles by that company..." +"\n We have only one model by that make. Would you be interested in the 2021 release of the " + make + " " + model + "?");
            } else {
                System.out.println("Unfortunately we do not carry that make. Try again! \n We do carry styles by Kia, Jeep, Toyota, and Volkswagen");
            }
            isWorking = false;
        }
    }
}
