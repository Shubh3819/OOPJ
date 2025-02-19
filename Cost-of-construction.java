import java.util.Scanner;

class TwoDimensional {
    double area;
    double costPerSquareFoot;

    public TwoDimensional(double area, double costPerSquareFoot) {
        this.area = area;
        this.costPerSquareFoot = costPerSquareFoot;
    }

    public double calculateCost() {
        return area * costPerSquareFoot;
    }
}

class ThreeDimensional extends TwoDimensional {
    double depth;

    public ThreeDimensional(double area, double costPerSquareFoot, double depth) {
        super(area, costPerSquareFoot);
        this.depth = depth;
    }

    @Override
    public double calculateCost() {
        return area * costPerSquareFoot * depth;
    }
}

public class lab4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter dimensions for the plastic (2D sheet):");
        System.out.print("Length (ft): ");
        double length = scanner.nextDouble();
        System.out.print("Width (ft): ");
        double width = scanner.nextDouble();
        double area = length * width;

        System.out.println("Enter dimensions for the plastic (3D box):");
        System.out.print("Depth (ft): ");
        double depth = scanner.nextDouble();

        TwoDimensional sheet = new TwoDimensional(area, 40);
        ThreeDimensional box = new ThreeDimensional(area, 60, depth);

        double costSheet = sheet.calculateCost();
        double costBox = box.calculateCost();

        System.out.println("Cost of 2D sheet: Rs " + costSheet);
        System.out.println("Cost of 3D box: Rs " + costBox);
        
        scanner.close();
    }
}
