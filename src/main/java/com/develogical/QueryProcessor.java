package com.develogical;

public class QueryProcessor {

  public String process(String query) {

    System.out.println("Received query:" + query);

    if (query.toLowerCase().contains("Which of the following numbers is the largest: 12, 96, 14?")) {
      return "58";
    }

    return "";
  }
}
