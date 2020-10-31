package abstract_class_demo;

public abstract class GuitarPlayer {
    private Guitar guitar;//私有属性：吉他
    private String name;//私有属性，姓名

    public GuitarPlayer(Guitar guitar, String name) {
        this.guitar = guitar;
        this.name = name;
    }

    //get set方法
    public Guitar getGuitar() {
        return guitar;
    }

    public String getName() {
        return name;
    }

    public void setGuitar(Guitar guitar) {
        this.guitar = guitar;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void playGuitar();//抽象方法：弹吉他
    public abstract Music makeMusic(String inspire);//抽象方法：作曲，需要传递灵感进来，返回一个音乐
    public void eat(){//普通方法，不抽象
        System.out.println(name+"在吃饭");
    }
}
