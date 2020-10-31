package father_class_demo;

public class RayleighZ extends AndroidDeveloper {

    public RayleighZ(String[] programs, int age) {
        super("father_class_demo.RayleighZ", programs, age);
    }

    //添加独特的方法
    public void lickSisterTaoTao(){
        System.out.println("涛の姐世界一です");
    }

    //覆写父类中的方法
    @Override
    public void code(){
        //Tip：这里不能通过this直接访问父类的私有域，必须要通过父类提供的get和set接口来获取
        System.out.println(this.getName()+"在划水");
    }

    //不覆写吃饭方法

    //在原有的基础上拓展sleep方法
    @Override
    public void sleep(){
        System.out.println("睡之前听6小时摇滚");
        super.sleep();
    }
}
