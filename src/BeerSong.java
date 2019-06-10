public class BeerSong {
    public static void main(String[] args) {
        int beerCount  = 99;
        while(beerCount > 1) {
                System.out.println(beerCount + " bottles of beer on wall, " + beerCount + " bottles of beer.");
                beerCount = beerCount - 1;
                System.out.println("Take one down and pass it around, " + beerCount + " bottles of beer on wall");
            }
        if(beerCount == 1) {
            System.out.println(beerCount + " bottle of beer on wall, " + beerCount + " bottle of beer.");
            System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");
        }
    }
}
