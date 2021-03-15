public class Childd extends Base {
    void doIt(){
        System.out.println("Form Child");

    }
    void childMethod(){
        System.out.println("child mehtiijoo");
    }

    public static void main(String[] args) {
        Childd c=new Childd();
        c.doIt();
        Base b= new Childd();
        b.doIt();
        Base bb= new Base();
        bb.doIt();
        //Childd cc= new Base();
        //cc.doIt();
    }
}
