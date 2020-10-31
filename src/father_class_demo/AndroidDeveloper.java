package father_class_demo;

public class AndroidDeveloper {
    private String name;//开发者的名字
    private String[] programs;//会的编程语言
    private int age;//开发者的年龄

    //构造方法
    public AndroidDeveloper(String name, String[] programs, int age) {
        this.name = name;
        this.programs = programs;
        this.age = age;
    }

    //公有的写代码方法
    public void code(){
        System.out.println(name + "正在写代码");
    }

    //公有的吃饭方法
    public void eat(){
        System.out.println(name + "正在吃饭");
    }

    //公有的睡觉方法
    public void sleep(){
        System.out.println(name + "正在睡觉");
    }

    //get set方法
    public void setName(String name) {
        this.name = name;
    }

    public void setPrograms(String[] programs) {
        this.programs = programs;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String[] getPrograms() {
        return programs;
    }

    public int getAge() {
        return age;
    }
}
