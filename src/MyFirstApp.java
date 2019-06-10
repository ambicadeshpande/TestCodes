public class MyFirstApp {
    public static void main(String[] args) {
        System.out.println("I RULE!!");
        System.out.println("The World!");
        int x = 3;
        String name = "Ambica";
        x = x +  7;
        System.out.println("x is " + x);
        double d = Math.random();

        while(x > 12){
            x = x -1 ;

        }
        for (int i=0 ; i<10; i++){
            System.out.println("x is now " +x);
        }

        if(x == 10){
            System.out.println("x must be 10");
        } else{
            System.out.println("x isn't 10");
        }
        if((x <3) && (name.equals("Ambica"))){
            System.out.println("Just gently print it");
        }
        System.out.println("This line runs no matter what!!");
    }
}
