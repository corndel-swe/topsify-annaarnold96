package org.example;

<<<<<<< HEAD
=======
import java.io.File;
>>>>>>> main
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
//import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import kong.unirest.json.JSONArray;
import kong.unirest.json.JSONObject;

/**
 * INSERT INTO users VALUES(1,'Sally_Kunde','Sally','Kunde','Sally.Kunde49@yahoo.com','https://cloudflare-ipfs.com/ipfs/Qmd3W5DuhgHirLHGVixi6V76LhCkZUz6pnFt5AJBiyvHye/avatar/730.jpg','MNkcfO7qfSqzJl5');
 * INSERT INTO users VALUES(2,'Ebba.Cole','Ebba','Cole','Ebba.Cole@gmail.com','https://avatars.githubusercontent.com/u/54619199','nz5H7F98ukot7yv');
 * INSERT INTO users VALUES(3,'Gerson_Barton','Gerson','Barton','Gerson.Barton@gmail.com','https://avatars.githubusercontent.com/u/69465068','OTSg4YbbUQIMZ6P');
 * **/

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {



    public static void main(String[] args) {

        try {
            File file = Paths.get("reports", "users.json").toFile();
            Path newFilePath = Paths.get("queries","test.sql");


            ObjectMapper mapper = new ObjectMapper();
            System.out.println("hi");

            List<User> userList = mapper.readValue(file, new TypeReference<List<User>>() {});



            System.out.println(userList);


//            List<String> test = new ArrayList<>();
//
//            test.add("hello");

//            Files.write(newFilePath,test);


}


    catch (Exception e){
        e.printStackTrace();
        System.out.println("this didn't work");

    }

        }
    }