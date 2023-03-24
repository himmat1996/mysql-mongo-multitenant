package com.spring.mongo.multitenant.mongo.utils;

public class ConnectionStorage {

  private static final ThreadLocal<String> storage = new ThreadLocal<>();

  public static String getConnection() {
    return storage.get();
  }

  public static void setConnection(final String connectionString) {
    storage.set(connectionString);
  }

  public static void clear() {
    storage.remove();
  }
}
