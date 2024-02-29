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
//    What is 5 multiplied by 81?
//            What is 72 plus 87?

    if (query.toLowerCase().contains("plus")) {
      String string = query.replace("What is ", "").replace(" plus", "").replace(" ?", "");
      String[] stringsArray = string.split(" " );
      Integer finalInt = Integer.parseInt(stringsArray[0]) + Integer.parseInt(stringsArray[1]);
      return finalInt.toString();
    }

    if(query.toLowerCase().contains("multiplied by")) {
      String string = query.replace("What is ", "").replace(" multiplied by", "").replace(" ?", "");
      String[] stringsArray = string.split(" " );
      Integer finalInt = Integer.parseInt(stringsArray[0]) * Integer.parseInt(stringsArray[1]);
      return finalInt.toString();
    }
    return "";
  }
}
