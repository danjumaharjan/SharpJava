public class StaticAndNonStaticMethod {
    
    public static void main (String[] args) {
        StaticAndNonStaticMethod m = new StaticAndNonStaticMethod();//creatig an object for non static method
        m.go();
        //m.go1();
        m.go2();
        go3();
        
        //exercise code
        System.out.println ("Exercise");
        m.go1();
        System.out.println ("After calling go1 method");
        
    }
    
    public void go(){
        System.out.println ("Inside Go Method");
        go2();
        System.out.println ("After calling go2 method");
    }
    
    public void go1(){
        System.out.println("Inside Go1 Method");
        go();
        System.out.println ("After calling go method");
    }
    
    public void go2(){
        System.out.println("Inside Go2 Method");
    }
    
    
    //Things to remember: Staci method cannot give a call to non static component;
    //but static --> static (allowed)
    //but non static --> non static, static (allowed)
    //non static components cannot be called without making an object of this class
    //but non static --> non static. For example, we will create non static method, and will call the method without creating an object;
    public static void go3(){
        System.out.println("Inside Go3 Non Static Method");
    }
    
    //if we are keeping everything static then we are not following Object Orientation
}