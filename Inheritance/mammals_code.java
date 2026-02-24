package Inheritance;

class mammal {
    void mam() {
        System.out.println("Inside Mammals Class");
    }
}

class Lion extends mammal {
    void roar() {
        System.out.println("Inside Lion class ");
    }
}

class Human extends mammal {
    void hum() {
        System.out.println("Inside Human");
    }
}

class mammals_code {
   public static void main(String[] args) {
    Lion obj = new Lion();
    
    obj.roar();
    obj.mam();
   } 
}
