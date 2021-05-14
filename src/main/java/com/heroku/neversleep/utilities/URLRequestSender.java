/**
 * Created by Krzysztof Zabolotny, https://github.com/KrzysztofZabolotny
 */
package com.heroku.neversleep.utilities;

import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashSet;

@Service
public class URLRequestSender {


    static String INVALID_URL;

    public HashSet<String> fileToSet()throws Exception{

        BufferedReader reader = new BufferedReader(new FileReader("URL_REGISTRY.txt"));

        HashSet<String> linkSet = new HashSet<>();

        String link;

        while((link = reader.readLine())!=null){
            linkSet.add(link);
        }
        reader.close();
        return linkSet;
    }


    public void sendRequests()throws Exception{//TODO url as a method variable


            HashSet<String> linkSet = fileToSet();

            for (String link: linkSet){
                try{
                    URL url = new URL(link);
                    HttpURLConnection con = (HttpURLConnection) url.openConnection();
                    con.setRequestMethod("GET");
                    int status = con.getResponseCode();

                    System.out.println(link+" "+status);

                    if(status!=200){
                        INVALID_URL = link;
                        //TODO : remove link form database/file
                    }
                }catch (Exception e){

                }


            }




    }
}
