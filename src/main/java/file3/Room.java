package file3;

public class Room {

    private double length;
    private double width;
    private double height;

    public Room(){
        length = 4.2;
        width = 4.2;
        height = 2.5;
    }

    public Room(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Room(double length) {
        this.length = length;
        width = length;
        height = 2.5;
    }

    public double SWalls() {
        return length * height + width * height;
    }

    public double clearSWalls(){
        double door = 2 * 15;
        double window = 2 * 8;
        return  SWalls() - door - window;
    }

    public void getInfo() {
        System.out.printf("Длина: %.2f м\nШирина: %.2f м\n" +
                "Высота: %.2f м\nПлощадь стен : %.2f м^2\nЧистая площадь стен: %.2f м^2\n\n",
                length, width, height, SWalls(), clearSWalls());
    }



}
