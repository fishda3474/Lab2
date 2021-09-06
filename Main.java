class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");

    int totalCandies = 55 * 11;
    double blueColor = totalCandies * .24;
    double brownColor = totalCandies * .13;
    double greenColor = totalCandies * .16;
    double orangeColor = totalCandies * .2;
    double redColor = totalCandies * .13;
    double yellowColor = totalCandies * .14;

    System.out.println("Blue: " + blueColor);
    System.out.println("Brown: " + brownColor);
    System.out.println("Green: " + greenColor);
    System.out.println("Orange: " + orangeColor);
    System.out.println("Red: " + redColor);
    System.out.println("Yellow: " + yellowColor);

    double sumCandies = blueColor + brownColor + greenColor + orangeColor + redColor + yellowColor;

    System.out.println("Sum: " + sumCandies);

    if(blueColor < brownColor && redColor > orangeColor){
      System.out.println("Blue under brown and red over orange.");
    }

    if(brownColor >= greenColor){
      System.out.println("Brown is greater than or equal to green.");
    }

    if(sumCandies == totalCandies){
      System.out.println("Numbers Match.");
    }
  
  }
}