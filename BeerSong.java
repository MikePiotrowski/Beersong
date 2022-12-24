public class BeerSong {
    public static void main(String[] args) {
        for (int numOfBeers = 99; numOfBeers > 0; numOfBeers--) {
            String bottlePluralization = (numOfBeers == 1) ? "bottle" : "bottles";
            String song = numOfBeers + " " + bottlePluralization + " of beer on the wall, "
                         + numOfBeers + " " + bottlePluralization + " of beer.\n"
                         + "Take one down, pass it around, ";

            if (numOfBeers > 1) {
                song += (numOfBeers - 1) + " " + bottlePluralization + " of beer on the wall.";
            } else {
                song += "no more bottles of beer on the wall.";
            }
            System.out.println(song);
        }
    }
}
