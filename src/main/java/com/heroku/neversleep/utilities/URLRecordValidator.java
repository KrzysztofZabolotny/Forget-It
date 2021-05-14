/**
 * Created by Krzysztof Zabolotny, https://github.com/KrzysztofZabolotny
 */
package com.heroku.neversleep.utilities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;

public class URLRecordValidator {


    void removeInvalidURL(String url){{

        try {
            BufferedReader reader = new BufferedReader(new FileReader("URL_REGISTRY.txt"));
            String line;

            while((line = reader.readLine())!=null){

            }
        }catch (Exception e){

        }

    }

    }
}
