public class InheritenceCalculator{
    public static void main(String[] args) {
        A obj = new A();
        int add = obj.add(10, 2);
        int sub = obj.sub(10, 2);
        int mul = obj.mul(10, 2);
        int div = obj.div(10, 2);
        int rem = obj.rem(10, 2);
        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(rem);
    }
}

class E{
    static int add(int a, int b){
        int r = a+b;
        return r;
    }
}
class D extends E{
    static int sub(int a, int b){
        int r = a-b;
        return r;
    }
}
class C extends D{
    static int mul(int a, int b){
        int r = a*b;
        return r;
    }
}
class B extends C{
    static int div(int a, int b){
        if(b==0){
            return -1;
        }
        int r = a/b;
        return r;
    }
}
class A extends B{
    static int rem(int a, int b){
        int r = a%b;
        return r;
    }
}
