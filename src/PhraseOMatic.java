public class PhraseOMatic {
    public static void main(String[] args) {
        String[] phraseOne = {"24/7","marvelous","just","hardwork"};
        String[] phraseTwo = {"crazy","mad","stupid","nauseous"};
        String[] phraseThree = {"maybe","later","Idk","Idgas"};

        int oneLen = phraseOne.length;
        int twoLen = phraseTwo.length;
        int threeLen = phraseThree.length;

        System.out.println("Legth1: " + oneLen);
        System.out.println("Legth2: " + twoLen);
        System.out.println("Legth3: " + threeLen);

        int rand1 = (int)(Math.random() * oneLen);
        System.out.println("Random int one: "+ rand1);

        int rand2 = (int)(Math.random() * twoLen);
        System.out.println("Random int one: "+ rand2);

        int rand3 = (int)(Math.random() * threeLen);
        System.out.println("Random int one: "+ rand3);

        String phrase =phraseOne[rand1] + " " + phraseTwo[rand2] + " " + phraseThree[rand3];

        System.out.println("The random phrase that is going to make to sound really smart is: " + phrase);
    }
}
