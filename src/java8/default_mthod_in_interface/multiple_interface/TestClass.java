package java8.default_mthod_in_interface.multiple_interface;

public class TestClass implements TestInterface1, TestInterface2{
    public static void main(String[] args) {
        TestClass obj = new TestClass();
        obj.show();
    }

    @Override
    public void show() {
        TestInterface2.super.show();
        TestInterface1.super.show();
    }
}
