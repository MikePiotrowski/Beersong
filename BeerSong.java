// 12/23/2022
// Corrected a minor error from the book and made the code more optimal
// Also tested out "Code With Me" in Intellij IDEA between my main computer
// and my laptop. Added a little Lambda in, but no real special reason.
// Michael Lee Piotrowski

import java.util.function.IntConsumer;

public class BeerSong {
    public static void main(String[] args) {
        IntConsumer printSong = numOfBeers -> {
            String bottlePluralization = (numOfBeers == 1) ? "bottle" : "bottles";
            String song = numOfBeers + " " + bottlePluralization + " of beer on the wall, "
                         + numOfBeers + " " + bottlePluralization + " of beer.\n"
                         + "Take one down, pass it around, ";

            if (numOfBeers > 1) {
                bottlePluralization = (numOfBeers - 1 == 1) ? "bottle" : "bottles";
                song += (numOfBeers - 1) + " " + bottlePluralization + " of beer on the wall.";
            } else {
                song += "no more bottles of beer on the wall.";
            }
            System.out.println(song);
        };

        for (int numOfBeers = 99; numOfBeers > 0; numOfBeers--) {
            printSong.accept(numOfBeers);
        }
    }
}
