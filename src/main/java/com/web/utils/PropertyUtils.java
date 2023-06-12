package com.web.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class PropertyUtils {

    private static final Properties properties = new Properties();
    private static final Map<String, String> PROPERTIES = new HashMap<>();

    static {
        String filePath = System.getProperty("user.dir") + "/src/test/resources/properties/config.properties";

        try (FileInputStream fileInputStream = new FileInputStream(filePath)) {

            properties.load(fileInputStream);
            for (Map.Entry<Object, Object> entry : properties.entrySet()) {
                String key = String.valueOf(entry.getKey());
                String value = String.valueOf(entry.getValue());
                PROPERTIES.put(key, value);
            }

        }

        catch (IOException e) {
            e.printStackTrace();
            //System.exit(0);
        }
    }

    public static String getPropertyValue(String key){
        return properties.getProperty(key);
    }

    public static String getValue(String key) {
        return PROPERTIES.get(key);
    }

}