package com.develogical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class QueryProcessor {

  public String process(String query) {

    System.out.println("Received query:" + query);

    if (query.toLowerCase().contains("is the largest: ")) {
      String number = query.replace("Which of the following numbers is the largest: ", "").replace("?", "");
      String[] numbersArray = number.split(", " );
      Arrays.sort(numbersArray, Collections.reverseOrder());
      return numbersArray[0];
    }

    if (query.toLowerCase().contains("plus")) {
      String string = query.replace("What is ", "").replace(" plus", "").replace("?", "");
      String[] stringsArray = string.split(" " );
      Integer finalInt = Integer.parseInt(stringsArray[0]) + Integer.parseInt(stringsArray[1]);
      return finalInt.toString();
    }

    if (query.toLowerCase().contains("minus")) {
      String string = query.replace("What is ", "").replace(" minus", "").replace("?", "");
      String[] stringsArray = string.split(" " );
      Integer finalInt = Integer.parseInt(stringsArray[0]) - Integer.parseInt(stringsArray[1]);
      return finalInt.toString();
    }

    if(query.toLowerCase().contains("multiplied by")) {
      String string = query.replace("What is ", "").replace(" multiplied by", "").replace("?", "");
      String[] stringsArray = string.split(" " );
      Integer finalInt = Integer.parseInt(stringsArray[0]) * Integer.parseInt(stringsArray[1]);
      return finalInt.toString();
    }
    //"Which of the following numbers are primes: 60, 83, 29, 7, 45?"
    //Which of the following numbers is both a square and a cube: 2, 64, 16, 729, 27, 5, 10?

    if (query.toLowerCase().contains("are primes: ")) {
      String string = query.replace("Which of the following numbers are primes: ", "").replace("?", "");
      String[] stringsArray = string.split(", " );
      List<String> stringsList = Arrays.asList(stringsArray);
      List<String> PrimesArrays = Arrays.asList("2", "3", "5", "7", "11", "13", "17", "19", "23", "29", "31", "37", "41", "43", "47", "53", "59", "61", "67", "71", "73", "79", "83", "89", "97");
      List<String> commonElements = new ArrayList<>(stringsList);
      commonElements.retainAll(PrimesArrays);
      return commonElements.toString().replace("[", "").replace("]", "");
    }


    return "";
  }
}
