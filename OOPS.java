public class OOPS{
    public static void main(String args[]){
        Pen p1 = new Pen() ;

        p1.setcolor("blue");
        System.out.println(p1.color);

        p1.settip(5);

        System.out.println(p1.tip);
        


    }

}

class Pen{
    String color;
    int tip ;

    void setcolor(String newcolor){
        color = newcolor;
    }

    void settip(int newtip){
        tip = newtip;
    }

    // this is only for education purpose 

}
