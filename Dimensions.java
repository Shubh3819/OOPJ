import java.util.Scanner;

class Plate {
    int length;
    int width;

    public Plate(int length, int width) {
        this.length = length;
        this.width = width;
        System.out.println("Plate constructor executed with length=" + length + " and width=" + width);
    }
}

class Box extends Plate {
    int height;

    public Box(int length, int width, int height) {
        super(length, width);
        this.height = height;
        System.out.println("Box constructor executed with height=" + height);
    }
}

class WoodBox extends Box {
    int thickness;

    public WoodBox(int length, int width, int height, int thickness) {
        super(length, width, height);
        this.thickness = thickness;
        System.out.println("WoodBox constructor executed with thickness=" + thickness);
    }
}

public class lab4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length for Plate: ");
        int plateLength = scanner.nextInt();

        System.out.print("Enter width for Plate: ");
        int plateWidth = scanner.nextInt();

        System.out.print("Enter height for Box: ");
        int boxHeight = scanner.nextInt();

        System.out.print("Enter thickness for WoodBox: ");
        int woodBoxThickness = scanner.nextInt();

        WoodBox woodBox = new WoodBox(plateLength, plateWidth, boxHeight, woodBoxThickness);

        scanner.close();
    }
}
