/**
 * Created by Krzysztof Zabolotny, https://github.com/KrzysztofZabolotny
 */
package com.heroku.neversleep.utilities;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class URLRecorder {

    String URL_REGISTRY = "URL_REGISTRY.txt";

    public static String timeStamp() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }

    public void saveURL(String url) throws Exception {

        BufferedWriter writer = new BufferedWriter(new FileWriter(URL_REGISTRY, true));

        writer.write(url);
        writer.newLine();
        writer.close();

    }
}
