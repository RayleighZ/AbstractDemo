package father_class_demo;

public class Main {
    public static void main(String[] args) {
        //新建一个张煜
        RayleighZ rayleighZ = new RayleighZ(new String[]{"Java","Kotlin"} , 10);
        rayleighZ.eat();
        rayleighZ.sleep();
        rayleighZ.code();
        rayleighZ.lickSisterTaoTao();

        ProductManager pm = new ProductManager();
        pm.letSomeoneCode(rayleighZ);//安排张煜去写代码
    }
}
