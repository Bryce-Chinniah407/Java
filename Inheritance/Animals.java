package Inheritance;

class animal {
    void eat() {
        System.out.println("eating...Animal class...eatmethod");
    }
}

class Lion extends animal {
    void roar() {
        System.out.println("Roar...Lio class...roar method");
    }
}

class BabyLion extends Lion {
    void weep() {
        System.out.println("Weeping...BabyLion class...weep method");
    }
}

class Animals {
    public static void main(String[] args) {
        BabyLion obj = new BabyLion();
        obj.weep();
        obj.roar();
        obj.eat();
    }
}