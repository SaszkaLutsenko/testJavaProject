public class DrawingEngine {
    public void drawCircle (int x, int y) {
        //code to draw pixels on screen for a circle
    }
    public void drawCircle (int x, int y, String color) {
        // reuse drawing
        this.drawCircle(x, y);
        //then code to add color
    }
    public void drawCircle (int x, int y, String color, int
            radius) {
        //reuse colored drawing
        this.drawCircle(x, y, color)
        //then code to resize
    }
    //default circle:
    public void drawCircle() {
        //reuse
        this.drawCircle(5,5,”White”,5);
    }