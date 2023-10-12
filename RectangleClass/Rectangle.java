package RectangleClass;

public class Rectangle {
    int width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public Rectangle(){}
    public int getArea(){
        return this.width * this.height;
    }
    public int getPerimeter(){
        return 2 * this.width + 2 * this.height;
    }
    public String displayName(){
        return "Rectangle: " + "width=" + width + "\n" + "height=" + height;
    }
}

