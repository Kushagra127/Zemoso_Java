package Assignment_5;


public class Singleton {
    String name;
    static Singleton obj=null;
    private Singleton() {}

    public static synchronized Singleton getInstance(String name)
    {
        if(obj==null)
        {
            obj=new Singleton();
            obj.name=name;
        }
        return obj;
    }

    public void getName() {
        System.out.println(obj.name);
    }
}