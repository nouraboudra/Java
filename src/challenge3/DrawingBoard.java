package challenge3;

import java.util.ArrayList;
import java.util.List;

public class DrawingBoard {

    private List<Drawable> shapes;

    public DrawingBoard() {
        this.shapes = new ArrayList<>();
    }

    public void addShape(Drawable shape) {
        this.shapes.add(shape);
    }

    public void displayDrawShapes() {
        for (Drawable shape : shapes) {
            if (shape instanceof Shape) {
                Shape s = (Shape) shape;
                s.displayType();
                s.drawShape();
            }
        }
    }



}
