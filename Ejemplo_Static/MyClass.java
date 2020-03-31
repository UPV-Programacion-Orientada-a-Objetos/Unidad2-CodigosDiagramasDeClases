package mx.edu.spolancom;

public class MyClass {
    private String name;
    public String url;
    public static int instCount;
    public static final int TIPO_EMPLEADO = 0;
    public MyClass() {
        MyClass.instCount++;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getName() {
        return this.name;
    }
}
