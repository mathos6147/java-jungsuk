package example.second;

public class Ex7_9 {
    /**
     * 접근 제어자(access modifier)
     *
     * private : 같은 클래스 내에서만 접근이 가능하다.
     * (default) : 같은 패키지 내에서만 접근이 가능하다.
     * protected : 같은 패키지 내에서, 그리고 다른 패키지의 자손 클래스에서 접근이 가능하다.
     * public : 접근 제한이 전혀 없다
     * public -> protected -> (default) -> private
     *
     */
    public static void main(String[] args) {
        MyParent p = new MyParent();
        p.printMembers();
     // System.out.println(p.prv);  에러!
        System.out.println(p.dft);
        System.out.println(p.prt);
        System.out.println(p.pub);
    }
}

class MyParent{
    private     int prv;
                int dft;
    protected   int prt;
    public      int pub;

    public void printMembers(){
        System.out.println(prv);
        System.out.println(dft);
        System.out.println(prt);
        System.out.println(pub);
    }
}