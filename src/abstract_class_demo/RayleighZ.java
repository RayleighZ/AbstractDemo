package abstract_class_demo;

public class RayleighZ extends GuitarPlayer{
    public RayleighZ(Guitar guitar) {
        super(guitar,"RayleighZ");
    }

    //实现无参数的抽象方法
    @Override
    public void playGuitar() {
        System.out.println(this.getName()+"在演奏"+this.getGuitar().name);
    }

    //实现有参数和返回值的抽象方法
    @Override
    public Music makeMusic(String inspire) {
        return new Music("由"+inspire+"为灵感创作的音乐");
    }

    //实现父类中不抽象的方法
    @Override
    public void eat() {
        System.out.println("餐前运动");
        super.eat();
    }
}
