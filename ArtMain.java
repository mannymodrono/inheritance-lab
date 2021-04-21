public class ArtMain {
    public static void main(String[] args) {
        Painting painting1 = new Painting("Picasso", "The Old Guitarist", 4, 2.75);
        Sculpture sculpture1 = new Sculpture("Rodin", "The Thinker", 6.17, 3.25, 4.58);

        System.out.println("The " + painting1.getName() + " by " + painting1.getAuthor() + ". It is " + painting1.getDimensions() + ".");

        System.out.println();

        System.out.println("The " + sculpture1.getName() + " by " + sculpture1.getAuthor() + ". It is " + sculpture1.getDimensions() + ".");
        
    }
}
