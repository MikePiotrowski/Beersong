// 12/23/2022 Corrected a minor error from the book and made the code more optimal
// Also tested out "Code With Me" in Intellij IDEA between my main computer
// and my laptop. Added a little Lambda in, but for no real special reason.
// Update July 16, 2024, I updated this to Java 18.
// Michael Lee Piotrowski

import java.util.function.IntConsumer;

import static java.lang.Thread.sleep;

public class BeerSong {
    public static void main(String[] args) throws InterruptedException {
        IntConsumer printSong = numOfBeers -> {
            String bottlePluralization = (numOfBeers == 1) ? "bottle" : "bottles";
            String nextBottlePluralization = (numOfBeers - 1 == 1) ? "bottle" : "bottles";
            String song = """
                  %d %s of beer on the wall, %d %s of beer.
                  Take one down, pass it around, %s %s of beer on the wall.
                  """.formatted(
                    numOfBeers, bottlePluralization, numOfBeers, bottlePluralization,
                    (numOfBeers > 1) ? (numOfBeers - 1) : "no more",
                    (numOfBeers > 1) ? nextBottlePluralization : "bottles");

            System.out.println(song);
        };

        for (int numOfBeers = 99; numOfBeers > 0; numOfBeers--) {
            printSong.accept(numOfBeers);
            sleep(4000); // Added a four-second pause between the number of bottled beers.
        }
    }
}
