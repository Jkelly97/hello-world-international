package edu.cnm.deepdive;

import java.util.ResourceBundle;

public class HelloWorld {

  public static final String USER_NAME_KEY = "user.name";
  public static final String BUNDLE_BASE_NAME = "strings";
  public static final String SALUTATION_KEY = "hello";
  public static final String SALUTATUION_FORMAT = "%s,%s!%n";

  public static void main(String[] args) {
    String userName = System.getProperty(USER_NAME_KEY);
    ResourceBundle strings = ResourceBundle.getBundle(BUNDLE_BASE_NAME);
    String salutation = strings.getString(SALUTATION_KEY);
    System.out.printf(SALUTATUION_FORMAT, salutation, userName);
    System.getProperties().list(System.out);
  }
}
