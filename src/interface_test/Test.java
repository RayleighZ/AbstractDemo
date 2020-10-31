package interface_test;

public class Test implements InterfaceWithField , InterfaceWIthField2{
    static int test = 0;
    @Override
    public void function() {
        System.out.println(this.number);
        System.out.println(InterfaceWithField.number);
        InterfaceWithField.number++;//会报错，提示为final变量不能改变
    }
}
