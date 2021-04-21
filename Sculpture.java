public class Sculpture extends Painting {
    private double depth;

    public Sculpture(){
        super();
        this.depth = 0.0;
    }
    public Sculpture(String name, String author, double height, double width, double depth){
        super(name, author, height, width);
        this.depth = depth;
    }

    public double getVolume(){
        return this.getArea() * this.depth;
    }

    public String getDimensions(){
        return this.getHeight() + "\" high x " + this.getWidth() + "\" wide x " + this.depth + "\" deep; volume of " + this.getVolume() + "cubic in";
    }
}