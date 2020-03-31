package mx.edu.spolancom;

public class Main {

    public static void main(String[] args) {
        MyClass inst1 = new MyClass();
        MyClass inst2 = new MyClass();

        inst1.url = "www.google.com.mx";
        inst2.url = "www.upvictoria.edu.mx";

        System.out.println(inst1.url);
        System.out.println(inst2.url);

        System.out.println(MyClass.instCount);
        System.out.println(MyClass.TIPO_EMPLEADO);
    }
}
