package thinkinjava.chapter10innerClass.session8WhyUseInnerClass.section1ClosureAndCallback;

public class DotThis {
    void f(){
        System.err.println("******");
    }

    public class Inner{
        public DotThis outer(){
            return DotThis.this;
        }
    }

    public Inner inner(){
        return new Inner();
    }

    public static void main(String[] args) {
        DotThis dotThis = new DotThis();
        Inner inner = dotThis.inner();
        inner.outer().f();
    }

}
