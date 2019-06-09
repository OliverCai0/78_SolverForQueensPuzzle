public class Test{

    public static void main(String[] args) {
        BoardForQueensPuzzle bitch = new BoardForQueensPuzzle(5);
        bitch.populate(2);
        BoardForQueensPuzzle copy = new BoardForQueensPuzzle(bitch);
        bitch.populate(3);
        System.out.println(copy);
        System.out.println(bitch);
    }
    

}