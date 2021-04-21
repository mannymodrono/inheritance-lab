public class Painting {
    private String author;
    private String name;
    private double height;
    private double width;

    public Painting(){
        this.author = "";
        this.name = "";
        this.height = 0.0;
        this.width = 0.0;
    }

    public Painting(String author, String name, double height, double width){
        this.author = author;
        this.name = name;
        this.height = height;
        this.width = width;
    }

    public String getAuthor(){
        return this.author;
    }
    public String getName(){
        return this.name;
    }
    public double getHeight(){
        return this.height;
    }
    public double getWidth(){
        return this.width;
    }

    public double getArea(){
        return this.width * this.height;
    }

    public String getDimensions(){
        return this.height + "\" high x " + this.width + "\" wide; area of " + this.getArea() + "square in";
    }
}