package com.evenger.eventlog.util;

import com.google.gson.Gson;

/*
 * A utility class over GSON methods and for operating with JSON.
 * Created by harshit on 4/11/17.
 */
public class JSONUtil {

  private JSONUtil() {
  }

  public static String objectToJson(Object object) {
    Gson gson = new Gson();
    return gson.toJson(object);
  }
}
