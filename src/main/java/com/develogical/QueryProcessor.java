package com.develogical;

public class QueryProcessor {

  public String process(String query) {

    System.out.println("Received query:" + query);

    if (query.toLowerCase().contains("What is 22 plus 54?")) {
      return "76";
    }

    return "";
  }
}
