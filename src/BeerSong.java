// July 21, 2022 from the Book Headfirst Java
// This will be kept private for my learning purposes



public class BeerSong {

    public static void main (String[] arges){

        int beerNum = 99;
        String word = "bottles";

        while (beerNum > 0){


            if (beerNum == 1){
                word = "bottle"; // singular, as in ONE bottle
            }

            System.out.println(beerNum + " " + word +  " of beer on the wall");
            System.out.println(beerNum + " "  + word +  " of beer.");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            beerNum = beerNum -1;

            if (beerNum == 0) {
                System.out.println(beerNum + " " + word + " of beer on the wall.");
            }
                else{
                    System.out.println("No more bottles of beer on the wall.");
                } // End else

        } // End while loop

    }//End main method
} // end class
