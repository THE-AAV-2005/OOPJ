// Java program to illustrate Constructor Overloading
class Box {
    double width, height, depth;

    // Constructor used when all dimensions are specified
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Constructor used when no dimensions are specified
    Box() {
        width = height = depth = 0;
    }

    // Constructor used when a cube is created
    Box(double len) {
        width = height = depth = len;
    }

    // Compute and return volume
    double volume() {
        return width * height * depth;
    }
}

// Driver code
public class Test {
    public static void main(String[] args) {
        // Create boxes using the various constructors
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        double vol;

        // Get volume of the first box
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);

        // Get volume of the second box
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);

        // Get volume of the cube
        vol = mycube.volume();
        System.out.println("Volume of mycube is " + vol);
    }
}

