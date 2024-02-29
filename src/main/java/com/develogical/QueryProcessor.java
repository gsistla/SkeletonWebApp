package com.develogical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class QueryProcessor {

  public String process(String query) {

    System.out.println("Received query:" + query);

    if (query.toLowerCase().contains("is the largest: ")) {
      String number = query.replace("Which of the following numbers is the largest: ", "").replace("?", "");
      String[] numbersArray = number.split(", " );
      Arrays.sort(numbersArray, Collections.reverseOrder());
      return numbersArray[0];
    }
    return "";
  }
}
