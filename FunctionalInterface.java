package NagaPractice.com;

interface addition {
    void add(int a , int b);
}
public class FunctionalInterface implements addition {
      public void add(int a , int b) {
          System.out.println(a+b);
      }
      public static void main (String args[]) {
          FunctionalInterface exg1= new FunctionalInterface();
          exg1.add(200,800);
          InheritanceClass sample=new InheritanceClass();
          sample.abstractMethod();
          sample.regularMethod();
          ImplementInterface obj1=new ImplementInterface();
          obj1.method1();
          obj1.method2();
      }
}
