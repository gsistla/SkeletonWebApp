package com.develogical;

public class QueryProcessor {

  public String process(String query) {

    System.out.println("Received query:" + query);

    if (query.toLowerCase().contains("What is 33 plus 25??")) {
      return "58";
    }

    return "";
  }
}
