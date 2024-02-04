package challenge3;

import challlenge1.CDPlayer;
import challlenge1.MP3Player;
import challlenge1.MusicLibrary;

public class Main {

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Square square = new Square();
        DrawingBoard drawingBoard = new DrawingBoard();

        drawingBoard.addShape(triangle);
       drawingBoard.addShape(square);

       drawingBoard.displayDrawShapes();

    }







}
