abstract class Shapes {
    abstract void showShape();

    public void shape() {
        System.out.println("I'm from abstract class");
    }
}

class Spheres extends Shapes {
    void showShape() {
        System.out.println("Object type is Sphere.");
    }
}

class Cuboid extends Shapes {
    void showShape() {
        System.out.println("Object type is Cuboid");
    }
}

class Prism extends Shapes {
    void showShape() {
        System.out.println("Object type is a prism");
    }
}

public class objects {
    public static void main(String[] args) {
        Shapes obj = new Spheres();
        obj.shape();
        obj.showShape();

        obj = new Cuboid();
        obj.shape();
        obj.showShape();

        obj = new Prism();
        obj.shape();
        obj.showShape();
    }
}
