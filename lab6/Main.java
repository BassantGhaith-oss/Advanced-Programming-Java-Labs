class Canvas{
    private;
    private;
}
public class Main{
    public static void main (String[] args){

    }
}
/*
class A {
public void f1(){
   System.out.println("A.f1 called");
} 
public final void f2() {  # we can not override the mathod
   System.out.println("A.f2 called");
}
public abstract void f3();  // the class had to been defined as abstract
                            // the abstract class have to be defined in the next class before the end of concrete class
}

class B extends A {
public void f1() {
super.f1();
System.out.println("B.f1 called");
}
public void f2() {
super.f2();                         // mistake becuase f2 is defined as final method so we cann't ovveride it
System.out.println("B.f2 called");  // to solve this problem we should remove  final
}
public void f3() {
System.out.println("B.f3 called");
}
}

class C extends A {  // we have to define f3 and its defining or to be abstract class
public void f1() {
super.f1();
System.out.println("C.f1 called");
}
}

abstract class D extends C {  // doesn't have to be adstract (no need)
public void f3() {
System.out.println("D.f3 called");
}
}

final class E extends D {   // this class we can not inherit from
}

class F extends E {    // error we cann't inherit from final class
public void f3() {
super.f3();
System.out.println("F.f3 called");
}
}

public class Test {
public static void main(String[] args) {
A[] ps = new A[6];  
ps[0] = new A();
ps[1] = new B(); 
ps[2] = new C(); 
ps[3] = new D(); // we cann't make an object from abstract class directly
ps[4] = new E();
ps[5] = new F();
*/
