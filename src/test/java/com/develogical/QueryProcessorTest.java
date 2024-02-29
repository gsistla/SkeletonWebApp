package com.develogical;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class QueryProcessorTest {

  QueryProcessor queryProcessor = new QueryProcessor();

  @Test
  public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
    assertThat(queryProcessor.process("test"), is(""));
  }

  @Test
  public void findLargestNumber() throws Exception{
    assertThat(queryProcessor.process("Which of the following numbers is the largest: 66, 26, 83?"), is("83"));
  }

  @Test
  public void calculatePlus() throws Exception{
    assertThat(queryProcessor.process("What is 2 plus 1?"), is("3"));
  }

  @Test
  public void calculateMultipliedBy() throws Exception{
    assertThat(queryProcessor.process("What is 5 multiplied by 81?"), is("405"));
  }

  @Test
  public void calculateMinus() throws Exception{
    assertThat(queryProcessor.process("What is 23 minus 7?"), is("16"));
  }

//  @Test
//  public void calculateSquareAndCube() throws Exception{
//    assertThat(queryProcessor.process("Which of the following numbers is both a square and a cube: 2, 64, 16, 729, 27, 5, 10?"), is("64, 729"));
//  }

  @Test
  public void calculatePrimes() throws Exception{
    assertThat(queryProcessor.process("Which of the following numbers are primes: 60, 83, 29, 7, 45?"), is("83, 29, 7"));
  }

}
