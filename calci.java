class calci {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        int sum=a+b;
        int diff=a-b;
        int mult=a*b;
        int div=a/b;
        String magic="===========Magic===========";
        System.out.println("====Method 1========");
        System.out.println("Addition of a&b: "+sum);
        System.out.println("Substraction of a7b: "+diff);
        System.out.println("Multiplication of a&b: "+mult);
        System.out.println("Division of a&b: "+div);
        System.out.println("====Method 2========");
        System.out.println("Addition of a&b: "+(a+b));
        System.out.println("Substraction of a&b: "+(a-b));
        System.out.println("Multiplicatons of a&b: "+(a*b));
        System.out.println("division of a&b: "+(a/b));
        System.out.println("Remainder : " +(a%b));
        System.out.println(magic);
        System.out.println("Addition of a&b: " + (a + b)+ "Substraction of a&b: " + (a - b)+"Multiplicatons of a&b: "+(a*b)+ "division of a&b: "+ (a / b));
    }
}
