import java.util.Scanner;

// Parent class
class Quadrilateral {
    public void showDescription() {
        System.out.println("- is quadrilateral");
    }
}

// Rectangle inherits from Quadrilateral
class Rectangle extends Quadrilateral {
    @Override
    public void showDescription() {
        super.showDescription();
        System.out.println("- has 4 right angles");
    }
}

// Square inherits from Rectangle
class Square extends Rectangle {
    @Override
    public void showDescription() {
        super.showDescription();
        System.out.println("- has 4 equal sides");
    }
}

// Parallelogram inherits from Quadrilateral
class Parallelogram extends Quadrilateral {
    @Override
    public void showDescription() {
        System.out.println("- has 2 pairs of parallel sides");
    }
}

// Rhombus inherits from Parallelogram
class Rhombus extends Parallelogram {
    @Override
    public void showDescription() {
        super.showDescription();
        System.out.println("- has 4 congruent sides");
    }
}

// Trapezoid inherits from Quadrilateral
class Trapezoid extends Quadrilateral {
    @Override
    public void showDescription() {
        System.out.println("- has 1 pair of parallel sides");
    }
}

// Main class
public class RunQuad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Select from the following:");
        System.out.println("R - Rectangle");
        System.out.println("S - Square");
        System.out.println("P - Parallelogram");
        System.out.println("H - Rhombus");
        System.out.println("T - Trapezoid");
        
        System.out.print("Enter your choice: ");
        char choice = scanner.next().toUpperCase().charAt(0);
        
        Quadrilateral shape;

        switch (choice) {
            case 'R':
                System.out.println("\nA rectangle:");
                shape = new Rectangle();
                break;
            case 'S':
                System.out.println("\nA square:");
                shape = new Square();
                break;
            case 'P':
                System.out.println("\nA parallelogram:");
                shape = new Parallelogram();
                break;
            case 'H':
                System.out.println("\nA rhombus:");
                shape = new Rhombus();
                break;
            case 'T':
                System.out.println("\nA trapezoid:");
                shape = new Trapezoid();
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }
        shape.showDescription();
        scanner.close();
    }
}
