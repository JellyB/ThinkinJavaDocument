package thinkinjava.chapter10innerClass.session8WhyUseInnerClass.section1ClosureAndCallback;

public class DotNew {

    public class Inner{

    }

    public static void main(String[] args) {
        DotNew dotNew = new DotNew();
        Inner inner = dotNew.new Inner();
    }
}
