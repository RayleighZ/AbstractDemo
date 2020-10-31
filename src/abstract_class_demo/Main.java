package abstract_class_demo;

public class Main {
    public static void main(String[] args) {
        Guitar guitar = new Guitar("Gibson牌电吉他");
        RayleighZ rayleighZ = new RayleighZ(guitar);
        Music music = rayleighZ.makeMusic("重庆的雨");
        System.out.println("张煜在创作音乐。。。");
        System.out.println(rayleighZ.getName()+music.name);
        rayleighZ.playGuitar();
        System.out.println("演奏结束。。。");
        rayleighZ.eat();
    }
}
