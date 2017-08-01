package com.company;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * Created by sackmann on 04.08.2016.
 */
public class JsonToObject {

    public static void main(String[] args) {

        Dog hugo = new Dog();

        hugo.setName("hugo");
        hugo.setAge((byte) 3);
        hugo.setHeight((float) 10.0);

        ObjectMapper mapper = new ObjectMapper();


        try {
            String json = mapper.writeValueAsString(hugo);

            Dog hugo2 = mapper.readValue(json, Dog.class);

            System.out.println(hugo2.toString());

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
