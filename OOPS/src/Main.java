import java.util.*;

class animal{
    void sound(){
        System.out.println("someting make sound");
    }
}
class dog extends animal{
    void sound(){
        System.out.println("dog is dark");
    }
}
class cat extends animal{
    void sound(){
        System.out.println("cat is dark");
    }
}

class main{
    public static void main(String[] args){
        animal a;

        a = new dog();
        a.sound();
        a = new cat();
        a.sound();
    }
}
